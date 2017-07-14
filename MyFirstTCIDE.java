package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class MyFirstTCIDE {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.swisscom.ch/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testMyFirstTCIDE() throws Exception {
		selenium.open("/de/privatkunden.html");
		selenium.click("link=");
		selenium.waitForPopUp("_self", "50000");
		selenium.click("link=Angebote");
		selenium.click("link=Internet");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPopUp("_self", "30000");
		selenium.click("link=Zu den Angeboten");
		selenium.waitForPageToLoad("20000");
		selenium.click("//div[4]/div/div[2]/div/div/div/form/div[2]/div/div/span/fieldset/div[2]/label");
		selenium.click("id=voip-disable_0");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
