package com.practice.testData;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practice.testCases.BaseClass;

public class ContactMain extends BaseClass {

	Logger log = Logger.getLogger(ContactMain.class);

	@Test
	public void webConnection() {
		driver.get("https://www.webex.com/");
		System.out.println("Base URL opened");
		driver.findElement(By.xpath("(//a[normalize-space()='Contact Sales'])[1]")).click();
		System.out.println("Contact Page Opened");
		log.info("Contact Page Opened");

	}
}