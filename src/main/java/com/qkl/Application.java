package com.qkl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @Author LiuBao
 * @Version 2.0
 * @Date 2018年11月12日
 */
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.warn("This is not a right calling method!!!");
    }

}
