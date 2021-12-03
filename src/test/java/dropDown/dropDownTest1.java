package dropDown;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropDownTest1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\OTHER SOFTWARE\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.webex.com/contact-sales.html");
		
		WebElement dropdown= driver.findElement(By.id("description1"));
		
		Select select=new Select(dropdown);

		List <WebElement> selectedlist=select.getOptions();
		System.out.println("I am hear----"+selectedlist);
		
		List listofplanpurchase = new ArrayList<String>();	
		
		for (Iterator iterator = selectedlist.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
//			System.out.println("webElement---"+webElement.getText());
			listofplanpurchase.add(webElement.getText());
		}
		
		if(listofplanpurchase.contains("Webex for Education")) {
			System.out.println("Webex for Education is in list");
			select.selectByVisibleText("Webex for Education");
			
		}
		Assert.assertEquals(true, listofplanpurchase.contains("Webex for Education"));
		Assert.assertEquals(13, listofplanpurchase.size());
	}

}
