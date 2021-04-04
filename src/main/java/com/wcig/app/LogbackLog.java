package com.wcig.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogbackLog.class);
        logger.info("info log..");
        logger.error("error log", new Exception("test logback log exception"));
        // output:
        // 2021-04-04 14:36:14.156 [main] [INFO ] com.wcig.app.LogbackLog - info log..
        // 2021-04-04 14:36:14.159 [main] [ERROR] com.wcig.app.LogbackLog - error log
        // java.lang.Exception: test logback log exception
        // 	at com.wcig.app.LogbackLog.main(LogbackLog.java:10)
    }
}
