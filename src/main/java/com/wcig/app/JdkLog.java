package com.wcig.app;

import java.util.logging.Logger;

public class JdkLog {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("info log..");
        logger.warning("warning log..");
        logger.fine("fine log..");
        logger.severe("severe log..");
        // output:
        // 四月 04, 2021 12:54:02 下午 com.wcig.app.App testJdkLog
        // 信息: info log..
        // 四月 04, 2021 12:54:02 下午 com.wcig.app.App testJdkLog
        // 警告: warning log..
        // 四月 04, 2021 12:54:02 下午 com.wcig.app.App testJdkLog
        // 严重: severe log..
    }
}
