package com.bascker.common;

/**
 * 运算符
 */
public enum Operator {

    ADD('+'), SUB('-'), MUL('*'), DEV('/'),
    BRACKET_LEFT('('), BRACKET_RIGHT(')'),
    BRACKET_MID_LEFT('['), BRACKET_MID_RIGHT(']'),
    BRACE_LEFT('{'), BRACE_RIGHT('}');

    private char op;

    Operator(char op) {
        this.op = op;
    }

    public char val() {
        return op;
    }

    @Override
    public String toString() {
        return String.valueOf(op);
    }
}
