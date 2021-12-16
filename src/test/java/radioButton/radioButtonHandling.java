package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.practice.testCases.BaseClass;

public class radioButtonHandling extends BaseClass{

	
	@Test
	public  void radioPractice() {
		
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("radio-btn-example"));

	}

}
