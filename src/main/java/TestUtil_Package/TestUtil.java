package TestUtil_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testbase_package.Testbase;

public class TestUtil extends Testbase{

	public static void Screenshot(WebDriver driver,String testmethodname) throws IOException
	{
		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\Sushmitha\\eclipse-workspace\\POMFramework\\Screenshot\\"+testmethodname+"_"+".jpg"));
	}
}
