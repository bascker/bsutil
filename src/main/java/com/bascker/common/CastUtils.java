package com.bascker.common;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * 类型转换工具类
 *
 * @author bascker
 */
public class CastUtils {

    public static <T> String toString(final Iterable<T> iterator) {
        return toString(iterator, Constant.EMPTY);
    }

    /**
     * 可迭代类型的 String 表示
     * @param iterable
     * @param seperator
     * @param <T>
     * @return
     */
    public static <T> String toString(final Iterable<T> iterable, final String seperator) {
        final StringBuilder sb = new StringBuilder();
        // Avoid NPE
        if (Objects.isNull(iterable)) {
            return StringUtils.EMPTY;
        }

        iterable.forEach(item -> sb.append(item).append(seperator));

        if (sb.length() >= seperator.length()) {
            sb.replace(sb.length() - seperator.length(), sb.length(), Constant.EMPTY);
        }

        return sb.toString();
    }

    /**
     * 转为 String 类型，默认值为空串
     * @param object
     * @return
     */
    public static String castString(final Object object) {
        return castString(object, Constant.EMPTY);
    }

    /**
     * 转为 String 类型
     * @param object
     * @param defaultValue
     * @return
     */
    public static String castString(final Object object, final String defaultValue) {
        return Objects.nonNull(object) ? String.valueOf(object) : defaultValue;
    }

    /**
     * 转为 Double 类型，默认值是 0D
     * @param object
     * @return
     */
    public static double castDouble(final Object object) {
        return castDouble(object, Constant.ZERO);
    }

    /**
     * 转为 Double 类型
     * @param object
     * @param defaultValue
     * @return
     */
    public static double castDouble(final Object object, final double defaultValue) {
        final String strValue = castString(object);
        return StringUtils.isNotEmpty(strValue) ? Double.parseDouble(strValue) : defaultValue;
    }

    /**
     * 转为 Long 类型，默认值为 0L
     * @param object
     * @return
     */
    public static long castLong(final Object object) {
        return castLong(object, Constant.ZERO);
    }

    /**
     * 转为 Long 类型
     * @param object
     * @param defaultValue
     * @return
     */
    public static long castLong(final Object object, final long defaultValue) {
        final String strValue = castString(object);
        return StringUtils.isNotEmpty(strValue) ? Long.parseLong(strValue) : defaultValue;
    }

    /**
     * 转为 int 类型，默认值为 0
     * @param object
     * @return
     */
    public static int castInt(final Object object) {
        return castInt(object, Constant.ZERO);
    }

    /**
     * 转为 int 类型
     * @param object
     * @return
     */
    public static int castInt(final Object object, final int defaultValue) {
        final String strValue = castString(object);
        return StringUtils.isNotEmpty(strValue) ? Integer.parseInt(strValue) : defaultValue;
    }

    /**
     * 转为 Boolean 类型，默认值为 false
     * @param object
     * @return
     */
    public static boolean castBoolean(final Object object) {
        return castBoolean(object, Boolean.FALSE);
    }

    /**
     * 转为 Boolean 类型
     * @param object
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(final Object object, final boolean defaultValue) {
        final String strValue = castString(object);
        return StringUtils.isNotEmpty(strValue) ? Boolean.parseBoolean(strValue) : defaultValue;
    }

    private CastUtils() {}

}
