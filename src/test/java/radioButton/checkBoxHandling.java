package radioButton;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkBoxHandling {

	@Test
	public  void checkboxClick() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\OTHER SOFTWARE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println(driver.findElement(By.xpath("(//label[normalize-space()='Option1'])[1]")).getText());
		String myaceptedresult= "Option1";
		boolean actualresult=driver.findElement(By.xpath("(//label[normalize-space()='Option1'])[1]")).getText().equalsIgnoreCase(myaceptedresult);
		
		
		System.out.println("My Actual Result----"+actualresult);
		
		assertTrue(actualresult);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
