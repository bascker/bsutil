package com.bascker.common;

/**
 * 运算符
 */
public enum Operator {

    ADD("+"), SUB("-"), MUL("*"), DEV("/"),
    BRACKET_LEFT("("), BRACKET_RIGHT(")"),
    BRACKET_MID_LEFT("["), BRACKET_MID_RIGHT("]"),
    BRACE_LEFT("{"), BRACE_RIGHT("}");

    private String op;

    Operator(String op) {
        this.op = op;
    }

    public String val() {
        return op;
    }


}
