package com.etsyframewok.Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeMethod;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;



public class Base extends Keyword {

	@BeforeMethod
	public void launchBrowser() {
		
		Constants.logger = Logger.getLogger("Selling product");
		PropertyConfigurator.configure("C:\\Users\\Admin\\EtsyFramework\\src\\main\\resources\\log4j2.properties");

		Keyword.openBrowser("Chrome");
		Constants.logger.info("Browser is open");
		Keyword.openUrl("https://www.etsy.com/");
		Keyword.windowMaximize();

	}

	/*@AfterMethod
	public void quitBrowser() {
		Keyword.closeBrowser();
	}*/
}