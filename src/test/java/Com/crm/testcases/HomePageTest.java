package Com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.ContactPage;
import com.Pages.Homepage;
import com.Pages.LoginPage;

import baseClass.TestBaseClass;
import come.utility.TestUtil;

public class HomePageTest<DealsPage> extends TestBaseClass{
	LoginPage loginPage; // defining variable at the class level
	Homepage homepage;
	TestUtil testUtil;
	ContactPage	contactpage ;
	com.Pages.dealsPage dealsPage;
	
	public HomePageTest() {
		super(); // calling prop from baseclass
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage(); // created constructor for LoginPage so that it can be called on this methods
		homepage =loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	@Test
	public void verifyHomepageTitle() {
		String homepageTitle= homepage.verifyHomepageTitle();
		Assert.assertEquals(homepageTitle, "Cogmento CRM","Home Page Title Not Matched");
	}
	@Test
	public void verifyUsernameTest() {
		Assert.assertTrue(homepage.verifyUserName());
	}
	@Test
	public void verifyContatcIcon() {
		contactpage = homepage.clickOnContactIcon();
	}
	@Test
	public void verifyDealsIcon() {
		dealsPage = homepage.clickOndealsIcon();
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
	}
	
	

