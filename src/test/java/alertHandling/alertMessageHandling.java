package alertHandling;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alertMessageHandling {
	WebDriver driver;
	@BeforeTest
	public void myetestBefore(){
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\OTHER SOFTWARE\\chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	}
	
	@Test
	public void mytest() throws InterruptedException {
		
//		try {
		//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		
		String name = "Alok"; 
		
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("confirmbtn")).click();
		
		
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		
		String expectedMessage = "Hello "+name+", Are you sure you want to confirm?";
		String alertmessage=driver.switchTo().alert().getText();
		
		boolean alertWhetherPassOrFailed=driver.switchTo().alert().getText().equalsIgnoreCase(expectedMessage); 
		
		//assertTrue(alertWhetherPassOrFailed);
		assertFalse(alertWhetherPassOrFailed);
//		
//		Assert.assertEquals(alertmessage,"Hello alok, Are you sure you want to confirm?");
//		System.out.println("Alert message---"+alertmessage);
		
//		Assert.assertEquals(alertmessage, expectedMessage);
		alert.accept();
		//driver.close();
//		}catch(Exception e) {
//			System.out.println(e.toString());
//		}finally {
//			driver.quit();	
//		}
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
