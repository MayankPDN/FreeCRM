package Com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Pages.Homepage;
import com.Pages.LoginPage;

import baseClass.TestBaseClass;
import come.utility.TestUtil;

public class LoginPageTest extends TestBaseClass {
	
	LoginPage loginPage; // defining variable at the class level
	Homepage homepage;
	TestUtil testUtil;
	
	public LoginPageTest() {
		super(); // calling prop from baseclass
		
	}

	@BeforeMethod
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage(); // created constructor for LoginPage so that it can be called on this methods
	}
	
	@Test (priority=1)
	public void loginPageTetleTest() {
		String title= loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test (priority=2)
	public void loginbuttonTest() {
//		testUtil.switchtoFrame();
		boolean Btn = loginPage.validateLoginBtn();
//		System.out.println("Btn");
		Assert.assertTrue(Btn);
		
	}
	@Test (priority=3)
	public void loginTest () {
//		testUtil.switchtoFrame();
		homepage =	loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
