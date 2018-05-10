package com.axone.mavensample;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	@Test
	public void selTest(){
		System.setProperty("webdriver.gecko.driver","C:\\SoftwareDownloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	System.out.println("maven");
	driver.get("https://www.seleniumhq.org/");
		driver.close();
	}

}
