package com.Copla.testCases;

import org.testng.annotations.Test;

import com.Copla.pageObjects.BaseClass;
import com.Copla.pageObjects.Lada;
import com.Copla.pageObjects.Paivi2;

public class TC_Paivi2Test_004 extends BaseClass {

	@Test

	public void paivi2Test() throws InterruptedException {

		login();
		logger.info("Logged in the application");

		Paivi2 paivi = new Paivi2(driver);
		Lada ld = new Lada(driver);

		paivi.datamenuclick();
		logger.info("Click on data screen");

		paivi.paiviscreenclick();
		Thread.sleep(7000);
		logger.info("Click on lada screen");

		paivi.addfilterclick();
		Thread.sleep(3000);
		logger.info("Click on add filter");

		paivi.selectfilters();
		logger.info("Click on filters");

		paivi.sortingcode();
		logger.info("Select filter and add operators");

		paivi.filterselection();
		logger.info("Select another filter and add operators");

		paivi.deletefilter();
		logger.info("Delete last filter");
		Thread.sleep(20000);

		paivi.applyfilter();
		Thread.sleep(15000);
		logger.info("Click on apply filter");

		ld.preferencecheckbox();
		logger.info("Select preference checkbox");

		ld.preferencename();
		logger.info("Enter the preference name");

		ld.savepreference();
		Thread.sleep(3000);
		logger.info("save the preference with random name");

	}

}
