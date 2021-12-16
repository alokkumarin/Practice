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
import org.testng.annotations.Test;

import com.practice.testCases.BaseClass;

public class dropDownTest extends BaseClass {

	@SuppressWarnings("unchecked")
	@Test
	public  void dropDownPractice() {
		
		
		driver.get("https://www.webex.com/contact-sales.html");
		
		WebElement dropdown= driver.findElement(By.id("country"));
		
		Select select=new Select(dropdown);
//	    select.selectByVisibleText("Australia");
		
		List <WebElement> selectedlist=select.getOptions();
		System.out.println("I am hear----"+selectedlist);
		
		List listofCountries = new ArrayList<String>();
		
		for (Iterator iterator = selectedlist.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
//			System.out.println("webElement---"+webElement.getText());
			listofCountries.add(webElement.getText());
		}
		
		if(listofCountries.contains("Canada")) {
			System.out.println("Canada is in list");
			select.selectByVisibleText("Canada");
			
		}
		Assert.assertEquals(true, listofCountries.contains("Canada"));
		Assert.assertEquals(52, listofCountries.size());
	}

}
