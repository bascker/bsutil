package com.bascker.common;

import org.apache.commons.lang3.BooleanUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * 运算符
 */
public enum Operator {

    ADD('+', 0), SUB('-', 0), MUL('*', 1), DEV('/', 1);

    private final char op;
    private final int priority;

    Operator(char op, int priority) {
        this.op = op;
        this.priority = priority;
    }

    public char val() {
        return op;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.valueOf(op);
    }

    // ------------------------
    // extend
    // ------------------------

    public static Operator get(char ch) throws NoSuchMethodException {
        final Optional<Operator> optional = Arrays.stream(Operator.values())
                .filter(operator -> operator.val() == ch).findFirst();
        if (BooleanUtils.isFalse(optional.isPresent())) {
            throw new NoSuchMethodException(String.format("The element %s is not exist", ch));
        }

        return optional.get();
    }

    public static boolean isOperator(char ch) {
        return Arrays.stream(Operator.values()).map(Operator::val).anyMatch(op -> op.equals(ch));
    }

    public static int compare (char a, char b) throws NoSuchMethodException {
        final Operator opA = Operator.get(a);
        final Operator opB = Operator.get(b);
        if (opA.getPriority() > opB.getPriority()) {
            return 1;
        } else if (opA.getPriority() == opB.getPriority()) {
            return 0;
        } else {
            return -1;
        }
    }

}
