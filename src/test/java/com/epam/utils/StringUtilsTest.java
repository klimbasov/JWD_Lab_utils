package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        String[] exceptionInputs = {"", null, "a", "sd", "--3", "a4", "4a", "4a4", "-3-", "34 5", " 456", "234 ", ".234",
                "234.", "123..123", "12. 321", "123 .123", "2-3", "-0"};
        String[] trueInputs = {"123", "0.545", "123.123", "2"};
        String[] falseInputs = {"-123", "-0.34", "-123.132", "-3", "0"};

        for (String input :
                exceptionInputs) {
            assertThrows(NumberFormatException.class, () -> StringUtils.isPositiveNumber(input));
        }

        for (String input :
                trueInputs) {
            assertTrue(StringUtils.isPositiveNumber(input));
        }

        for (String input :
                falseInputs) {
            assertFalse(StringUtils.isPositiveNumber(input));
        }
    }
}