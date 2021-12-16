package com.practice.testData;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practice.testCases.BaseClass;


public class ContactMain extends BaseClass{
	
	Logger log = Logger.getLogger(ContactMain.class);
	
WebDriver driver;
	
  	@Test
 	public void driverLocalConnection()	{	
  		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("Driver connection Stablised");
	try {
		int y = 10/0;
	} catch (Exception e) {
		// TODO: handle exception
		log.error(e);
	}
	log.error("Driver connection Stablised");
	}
	
  	@AfterTest
  	public void closeDriverConnection() {
  		driver.quit();
  		System.out.println("Driver connection closed");
  	log.info("Driver connection closed");
  	}
    	
	@Test
	public void webConnection() {		
		driver.get("https://www.webex.com/");
		System.out.println("Base URL opened");
		driver.findElement(By.xpath("(//a[normalize-space()='Contact Sales'])[1]")).click();
		System.out.println("Contact Page Opened");
	log.info("Contact Page Opened");	
	
}
}