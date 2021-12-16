package traveler.Booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class mapCabsBase {

	 WebDriver driver;
	
	@BeforeTest
	public void DriverConnection(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
	}
	
	@AfterTest
	public void QuitDriver() {
		driver.close();
	}
}
