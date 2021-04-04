package com.wcig.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jLog {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4jLog.class);
        logger.info("info log..");
        logger.error("error log", new Exception("test log4j log exception"));
        // output:
        // 14:29:22.167 [main] ERROR com.wcig.app.Log4jLog - error log
        // java.lang.Exception: test log4j log exception
        // 	at com.wcig.app.Log4jLog.main(Log4jLog.java:10) [classes/:?]
    }
}
