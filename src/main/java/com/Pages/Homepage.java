package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBaseClass;

public class Homepage extends TestBaseClass {

	@FindBy(xpath="//span[contains(text(),'Mack Gohi')]")
	WebElement displayName;
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement contactIcon;
	
	@FindBy(xpath="//i[@class='money icon']")
	WebElement dealsIcon;
	
	@FindBy(xpath="//i[@class='tasks icon']")
	WebElement taskIcon;
	
	//Initializing page Objects:
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	public boolean verifyUserName() {
		return displayName.isDisplayed();
		
	}
	public ContactPage clickOnContactIcon() {
		contactIcon.click();
		return new ContactPage();
	}
	public dealsPage clickOndealsIcon() {
		dealsIcon.click();
		return new dealsPage();
	}
	public taskPage clickOntaskIcon() {
		taskIcon.click();
		return new taskPage();
	}
}
