package com.practice.testCases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	
	static ExtentReports extent;
		
		public static ExtentReports getReportObject()
		{

			
			String path =System.getProperty("user.dir")+"\\reports\\index1.html";
			System.out.println("path----"+path);
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("Web Automation Results");
			reporter.config().setDocumentTitle("Test Results");
			
			 extent =new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Rahul Shetty");
//			extent.setSystemInfo("Reviewed By", "Alok");
			return extent;
			
		}

		public static String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
			FileUtils.copyFile(source, new File(destinationFile));
			return destinationFile;

		}

}

