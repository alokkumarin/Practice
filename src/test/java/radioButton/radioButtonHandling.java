package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("radio-btn-example"));

	}

}
