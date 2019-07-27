package testbase_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;

	
		public Testbase()
		{
			try
			{
			 prop= new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\Sushmitha\\eclipse-workspace\\POMFramework\\src\\main\\java\\config_package\\config.properties");
			
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void initialization()
		{Logger log =Logger.getLogger(Testbase.class);
			String urlname= prop.getProperty("url");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sushmitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			log.info("Openning Chrome");
	
			driver = new ChromeDriver();
			
			driver.get(urlname);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	}


