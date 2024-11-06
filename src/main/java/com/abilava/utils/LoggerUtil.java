package com.abilava.utils;

import com.abilava.dtos.LoggerStatus;
import lombok.experimental.UtilityClass;
import java.time.OffsetDateTime;

@UtilityClass
public class LoggerUtil {

    private final String MESSAGE_FORMAT = "%s | %s | %s";

    public static void info(final String message) {
        System.out.println(String.format(MESSAGE_FORMAT, OffsetDateTime.now(), LoggerStatus.INFO, message));
    }

    public static void warn(final String message) {
        System.out.println(String.format(MESSAGE_FORMAT, OffsetDateTime.now(), LoggerStatus.WARN, message));
    }

    public static void error(final String message) {
        System.out.println(String.format(MESSAGE_FORMAT, OffsetDateTime.now(), LoggerStatus.ERROR, message));
    }

}
