package CalederPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.practice.testCases.BaseClass;

public class TestCalender extends BaseClass {

	@Test
	public void calenderPractice() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
						
		Calendar calendar= Calendar.getInstance();
		SimpleDateFormat targetdateformat=new SimpleDateFormat("dd/MMM/yyyy");

/*
		String date= "04/Dec/2021";

		try {
			Date d=targetdateformat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside Catch");
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally");
		}
*/		
		int targetdate=calendar.get(Calendar.DAY_OF_MONTH);
		int targetmonth=calendar.get(Calendar.MONTH);
		int targetyear= calendar.get(Calendar.YEAR);
		
		System.out.println("targetdate---"+targetdate);
		System.out.println("targetmonth---"+targetmonth);
		System.out.println("targetyear---"+targetyear);
		
		driver.findElement(By.id("second_date_picker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar' ]//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text="+targetdate+"]")).click();
		

	}

}
