package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase_package.Testbase;

public class Login_Page extends Testbase{
	
	@FindBy(xpath="//input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\" and @class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement submit;
	
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginTitle()
	{
		return driver.getTitle();
	}
	
	public Home_Page Login(String uid,String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit.click();
		return new Home_Page();
	}
	

}
