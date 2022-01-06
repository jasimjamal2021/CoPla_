package com.Copla.testCases;

import org.testng.annotations.Test;

import com.Copla.pageObjects.BaseClass;
import com.Copla.pageObjects.DeliveryCalendar;

public class TC_DeliveryCalendarTest_002 extends BaseClass {

	@Test
	public void deliverycalendarTest() throws InterruptedException {

		login();
		logger.info("Logged in the application");

		Thread.sleep(6000);

		DeliveryCalendar dc = new DeliveryCalendar(driver);

		dc.calendarclick();
		logger.info("Click on calendar");
		Thread.sleep(3000);
		
		dc.deliverycalendarclick();
		logger.info("Click on deliverycalendar dropdown");
		Thread.sleep(3000);
		logger.info("click on delivery calendaer dropdown");

		dc.yearclick();
		logger.info("click on year");

		dc.yearselect();
		logger.info("Select an year 2022");
		Thread.sleep(8000);

		dc.showcalendar();
		logger.info("Clik on calendar button");
		Thread.sleep(8000);

		dc.day();
		Thread.sleep(5000);
		logger.info("Select a day from calendar");

		dc.popup();
		Thread.sleep(3000);
		logger.info("Select another from calendar");

		dc.save();
		logger.info("Click on save");
		
		dc.reset();
		logger.info("Day is reseted to old date");

	}

}
