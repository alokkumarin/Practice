package com.practice.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactSalePage {

	@FindBy(id="firstName")
	WebElement txtFirstName;
	
	@FindBy(id="lastName")
	WebElement txtLastName;
	
	@FindBy (id="emailAddress")
	WebElement uBusinessEmail;
	
	@FindBy (id="busPhone")
	WebElement uPhoneNumber;
	
	@FindBy (id="company")
	WebElement uCompanyName;
	
	@FindBy (id="country")
	WebElement uCountryName;
	
	@FindBy(id="description1") 
	WebElement uPurchasePlan;
	
	@FindBy(id="fe2215") 
	WebElement uSubmitButton;
	
	public void setUserFirstName(String ufname) {
		txtFirstName.sendKeys(ufname);
	}
	
	public void setUserLastName(String ulname) {
		txtLastName.sendKeys(ulname);
	}
	
	public void setBusinessEmail(String uemail) {
		uBusinessEmail.sendKeys(uemail);
	}
	
	public void setUserPhone(String uphone) {
		uPhoneNumber.sendKeys(uphone);
	}
	
	public void setCompanyName(String ucompany) {
		uCompanyName.sendKeys(ucompany);
	}
	
	public void setUserCountry(String ucountry) {
		uCountryName.sendKeys(ucountry);
	}
	
	public void setUserPlan(String uplan) {
		uPurchasePlan.sendKeys(uplan);
	}
	
		
	public void SubmitDetails() {
		uSubmitButton.click();
	}
}
