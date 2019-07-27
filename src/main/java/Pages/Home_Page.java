package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase_package.Testbase;

public class Home_Page extends Testbase{
	
	@FindBy(xpath="//div[text()=\"Flipkart\"]")
	WebElement Flipkart;

	
	public Home_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnNotificationPreference() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Flipkart).build().perform();
		//Thread.sleep(3000)
		action.moveByOffset(0,3).click().build().perform();
		
	}
	
}
