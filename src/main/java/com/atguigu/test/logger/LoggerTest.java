package com.atguigu.test.logger;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LoggerTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(LoggerTest.class);

	@Test
	public void test1(){
		if (logger.isDebugEnabled()) {
			logger.debug("test1() - start");
		}
		
		logger.info("--------info");
		
		
		if (logger.isDebugEnabled()) {
			logger.debug("test1() - end");
		}
	}
	
}
