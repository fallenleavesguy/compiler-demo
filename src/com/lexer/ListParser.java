package com.lexer;

public class ListParser extends Parser{
    public ListParser(Lexer input) {
        super(input);
    }
    public void list() {
        match(ListLexer.LBRACK); elements(); match(ListLexer.RBRACK);
    }
    public void elements() {
        element();
        while (lookahead.type == ListLexer.COMMA) {
            match(ListLexer.COMMA); element();
        }
    }
    public void element() {
        if (lookahead.type == ListLexer.NAME) match(ListLexer.NAME);
        else if (lookahead.type == ListLexer.LBRACK) list();
        else throw new Error("expecting name or list; found " + lookahead);
    }
}
