package com.lexer;

public class Main {

    public static void main(String[] args) {
        // Testing Lexer
//        ListLexer lexer = new ListLexer(args[0]);
//        Token t = lexer.nextToken();
//        while (t.type != Lexer.EOF_TYPE) {
//            System.out.println(t);
//            t = lexer.nextToken();
//        }
//        System.out.println(t);

        // Testing Parser

        ListLexer lexer = new ListLexer(args[0]);
        ListParser parser = new ListParser(lexer);
        parser.list();

    }
}
