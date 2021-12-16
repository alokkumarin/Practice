package traveler.Booking;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.testCases.BaseClass;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import java.io.IOException;
import java.net.*;

public class mapCabsHomePage extends BaseClass {
	
	int respCode = 200;

	@Test
	public void TC_ListOfFooter_001() throws IOException, InterruptedException {
		driver.get("https://www.mapcabs.in/");
		driver.manage().window().maximize();

		WebElement footer = driver.findElement(By.xpath("//div[@class='container-fluid backclass']"));
		int i = footer.findElements(By.tagName("div")).size();
		System.out.println("Footer Size is.-----" + i);

		List<WebElement> footlinks = footer.findElements(By.xpath("//div//ul[@class='states1']"));
		for (Iterator iterator = footlinks.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();

			List<WebElement> listofLI = webElement.findElements(By.tagName("li"));

			for (WebElement webElement2 : listofLI) {
				System.out.println(webElement2.getText());
				String hrefname = webElement2.findElement(By.tagName("a")).getAttribute("href");

				URL url = new URL(hrefname);
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				huc.connect();

				int resCode = huc.getResponseCode();
				
				if(resCode >= 400){
					System.out.println(url+" is a broken link");
					}
					else{
					System.out.println(url+" is a valid link");
					}

				Assert.assertEquals(200, resCode);

				Thread.sleep(3000);
				System.out.println("link----" + hrefname);

			}

			Thread.sleep(3000);
			
			
			

//			System.out.println("Footer State name is..." + webElement.getText());
		}
		}
		
		@Test
		public void TC_FooterBrokenLinkCheck() {
			System.out.println("hi---:");
		}

	

}
