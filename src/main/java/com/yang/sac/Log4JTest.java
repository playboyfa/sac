package com.yang.sac;

import org.apache.log4j.Logger;

public class Log4JTest {
	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger(Log4JTest.class);
        logger.debug("开始");
     
        logger.debug("结束");
	}
}
