package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBaseClass;

public class LoginPage extends TestBaseClass {
	
	

	// page Factory or Object repository
	
		
		@FindBy(xpath="//input[@type='text'and@name='email']")
			WebElement email;
		
		@FindBy(xpath="//input[@type='password'and@name='password']")
			WebElement password;
		
		@FindBy(xpath="//div[contains(text(),'Login')and@class='ui fluid large blue submit button']")
			WebElement LoginBtn;
		
		
		
		// Initializing page objects.
		
		public LoginPage() {
			PageFactory.initElements(driver, this); // this very important to initiate = initElement(driver,this0;
			
		}
		
//		private Object xpath(String string) {
//			// TODO Auto-generated method stub
//			return null;
//		}
		
		
		// Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
			
		}
		public boolean validateLoginBtn() {
			return LoginBtn.isDisplayed();
		}
		public Homepage login(String em, String pass) {
		
			email.sendKeys(em);
			password.sendKeys(pass);
			LoginBtn.click();
			
			return new Homepage();
			
			
		}
	}


