package com.rhzx.rhzx_boot.util;

import com.google.common.base.Strings;
import com.rhzx.rhzx_boot.util.exception.InputCheckException;

/**
 * Created by chenliusong on 2017/3/2.
 */
public final class InputCheckUtil {
    private InputCheckUtil() {
    }

    public static void checkNotEmpty(String value, String itemName) {
        if (Strings.isNullOrEmpty(value)) {
            throw new InputCheckException(itemName + "不能为空");
        }
    }

    public static void checkNotNull(Object value, String itemName) {
        if (value == null) {
            throw new InputCheckException(itemName + "不能为Null。");
        }
    }

    public static void checkIntegerMaxValue(String value, String itemName, int maxValue) {
        checkNotNull(value, itemName);
        if (checkIsInteger(value, itemName) > maxValue) {
            throw new InputCheckException(itemName + "必须小于" + maxValue);
        }
    }

    public static void checkIntegerMinValue(String value, String itemName, int minValue) {
        checkNotNull(value, itemName);
        if (checkIsInteger(value, itemName) < minValue) {
            throw new InputCheckException(itemName + "必须大于" + minValue);
        }
    }

    public static Integer checkIsInteger(String value, String itemName) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new InputCheckException(itemName + "必须是数字");
        }
    }

    public static void checkStringMaxValue(String value, String itemName, int maxValue) {
        checkNotNull(value, itemName);
        if (value.length() > maxValue) {
            throw new InputCheckException(itemName + "必须小于" + maxValue);
        }
    }


}
