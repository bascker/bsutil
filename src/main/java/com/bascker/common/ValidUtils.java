package com.bascker.common;


import java.util.Objects;

public class ValidUtils {

    private ValidUtils() {}

    public static <T> boolean isEmpty(T[] arr) {
        return Objects.isNull(arr) || arr.length < 1;
    }

    public static <T> boolean isNotEmpty(T[] arr) {
        return !isEmpty(arr);
    }

}
