package com.wcig.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingLog {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonsLoggingLog.class);
        log.info("info log..");
        log.error("error log", new Exception("test commons logging log exception"));
        // output:
        // 四月 04, 2021 1:26:09 下午 com.wcig.app.CommonsLoggingLog main
        // 信息: info log..
        // 四月 04, 2021 1:26:09 下午 com.wcig.app.CommonsLoggingLog main
        // 严重: error log
        // java.lang.Exception: test commons logging log exception
        // 	at com.wcig.app.CommonsLoggingLog.main(CommonsLoggingLog.java:10)
    }
}
