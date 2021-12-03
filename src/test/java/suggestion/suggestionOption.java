package suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class suggestionOption {

	@Test
	public void selectSuggestionOption() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\OTHER SOFTWARE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("autocomplete")).click();
		 driver.findElement(By.id("autocomplete")).sendKeys("India");
		 
		 
		 Actions action=new Actions (driver);
		 action.keyDown("I");
		 //List<WebElement> elements =
		 //System.out.println(elements.size());
	}
}
