package com.sparta.toyin.View;

import com.sparta.toyin.Starter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    static Logger logger = LogManager.getLogger(Starter.class);

    public static <T extends Exception> void logException(T exception) {
        logger.error("The following exception was thrown: " + exception.getMessage());

        logger.error("Printing Stack Trace");
        for (StackTraceElement stackTraceElement: exception.getStackTrace()) {
            logger.error(stackTraceElement);
        }
    }

    public static <T> void traceLog(T input, String message) {
        logger.trace(message + input);
    }
    public static void traceLog(String message) {
        logger.trace(message);
    }

}
