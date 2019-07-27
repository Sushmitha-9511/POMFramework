package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Home_Page;
import Pages.Login_Page;
import testbase_package.Testbase;

public class Home_Page_Test extends Testbase{
	Login_Page loginpage;
	Home_Page homepage;
	


	public Home_Page_Test()
	{
		super();
	}
	
	
	@BeforeMethod()
	public void settup()
	{
		initialization();
		loginpage= new Login_Page();
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homepage= new Home_Page();
		
	}
	
	@Test
	public void verifyclick() throws InterruptedException
	{
		homepage.clickOnNotificationPreference();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}