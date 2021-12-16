package com.practice.testCases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	public WebDriver driver;

	public BaseClass() {
		// TODO Auto-generated constructor stub
		PropertyConfigurator.configure("log4j.properties");
		System.out.println("i am add some point Here");
		System.out.println(" I added");
	}
	

	
  	@BeforeTest
 	public void driverLocalConnection()	{	
  		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("Driver connection Stablised");
	
	}
	
  	@AfterTest
  	public void closeDriverConnection() {
  		driver.quit();
  		System.out.println("Driver connection closed");
    	}
}
