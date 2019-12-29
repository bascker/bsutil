package com.bascker.common;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * CharsetUtils
 *
 * @author bascker
 */
public class CharsetUtils {

    public static final Charset UTF8 = Charset.forName(Constant.UTF8);

    public static final CharsetEncoder ENCODER_UTF8 = UTF8.newEncoder();

    private CharsetUtils() {}

}
