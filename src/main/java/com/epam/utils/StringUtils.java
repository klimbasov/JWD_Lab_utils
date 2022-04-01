package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.defaultString;

public class StringUtils {
    private static final String REGEX_NUMBER = "(\\d+)|(-[1-9]\\d*)|(-?\\d+\\.\\d+)";

    public static boolean isPositiveNumber(String str) {
        validateInput(str);
        return isPositiveNumberInternal(str);
    }

    private static void validateInput(String str) {
        String nonNullStr = defaultString(str);
        if (!nonNullStr.matches(REGEX_NUMBER)) {
            throw new NumberFormatException();
        }
    }

    private static boolean isPositiveNumberInternal(String str) {
        return str.charAt(0) != '-' && !str.equals("0");
    }
}
