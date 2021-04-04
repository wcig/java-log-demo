package com.wcig.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jAnnotationLog {
    public static void main(String[] args) {
        log.info("info log..");
        log.error("error log", new Exception("test @Slf4j log exception"));
        // output:
        // 2021-04-04 14:44:05.206 [main] [INFO ] com.wcig.app.Slf4jAnnotationLog - info log..
        // 2021-04-04 14:44:05.209 [main] [ERROR] com.wcig.app.Slf4jAnnotationLog - error log
        // java.lang.Exception: test @Slf4j log exception
        // 	at com.wcig.app.Slf4jAnnotationLog.main(Slf4jAnnotationLog.java:9)
    }
}
