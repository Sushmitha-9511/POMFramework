package testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Custom_Listener_Package.Custom_Listener;
import Pages.Home_Page;
import Pages.Login_Page;
import testbase_package.Testbase;
@Listeners(Custom_Listener.class)
public class Login_Page_Test extends Testbase{
	Login_Page loginpage;
	Home_Page homepage;
	
	public Login_Page_Test()
	{
		super();
	}

	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage= new Login_Page();
	}
	
	@Test
	public void verifyTitle()
	{
		String actualtitle=loginpage.getLoginTitle();
		Assert.assertEquals(actualtitle, "Online");
		
	}
	
	
	@Test
	public void loginUsingCredentials()
	{
		homepage=loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
