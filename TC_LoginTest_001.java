package com.Copla.testCases;

import org.testng.annotations.Test;

import com.Copla.pageObjects.BaseClass;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		logger.info("URL is opened");

		login();
		logger.info("Application  is opened");

	}
}
