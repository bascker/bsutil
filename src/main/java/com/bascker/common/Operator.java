package com.bascker.common;

import java.util.Arrays;

/**
 * 运算符
 */
public enum Operator {

    ADD('+'), SUB('-'), MUL('*'), DEV('/');

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

    public static boolean isOperator(char ch) {
        return Arrays.stream(Operator.values()).map(Operator::val).allMatch(op -> op.equals(ch));
    }

}
