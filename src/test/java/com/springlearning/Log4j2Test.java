package com.springlearning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * ClassName: Log4j2Test
 * Package: com.springlearning
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 17/04/2023
 */
class Log4j2Test {
    @Test
    void test01() {
        //  使用Log4j2的门面来实现日志功能
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    void test02(){
        // 使用配置文件，xml格式
        // log4j2默认加载类路径（resources）下的log4j2.xml文件中的配置
        // 具体参考上面提到的log4j2.xml文件
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
