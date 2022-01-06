package com.Copla.testCases;

import org.testng.annotations.Test;

import com.Copla.pageObjects.BaseClass;
import com.Copla.pageObjects.Lada;

public class TC_LadaTest_003 extends BaseClass {

	@Test
	public void ladaTest() throws InterruptedException {

		login();
		logger.info("Logged in the application");

		Lada ld = new Lada(driver);

		ld.datamenuclick();
		logger.info("Click on data screen");

		ld.ladascreenclick();
		Thread.sleep(8000);
		logger.info("Click on lada screen");

		ld.addfilterclick();
		logger.info("Click on add filter");

		ld.selectfilters();
		// Thread.sleep(3000);
		logger.info("Click on filters");

		ld.selectsortingcode();
		logger.info("Select sorting code");

		ld.operatorclick();
		logger.info("Click on Operator");

		ld.selectoperator();
		logger.info("Select Operator");

		ld.textboxvalue();
		Thread.sleep(15000);
		logger.info("Enter the value");

		ld.preferencecheckbox();
		logger.info("Select preference checkbox");

		ld.preferencename();
		logger.info("Enter the preference name");

		ld.savepreference();
		Thread.sleep(3000);
		logger.info("save the preference with random name");

	}

}
/*** Preference delete ,Export button and filter delete ***/