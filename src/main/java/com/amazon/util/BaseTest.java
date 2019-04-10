package com.amazon.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest extends TestUtil{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest() {
		try {
			prop =new Properties();
			FileInputStream fis = new FileInputStream("C:\\panay\\PM\\Learning\\AmazonCucumber\\src\\main\\java\\com\\amazon\\config\\config.properties");
			prop.load(fis);
		}
		catch(IOException e ){
			e.getMessage();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\panay\\PM\\Learning\\AmazonCucumber\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\prannoy.m\\eclipse-workspace\\WebcomCucumberFramework\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOADLTIMEOUT, TimeUnit.SECONDS);
	    //pageLoadTimeout((TestUtil.PAGE_LOADLTIMEOUT),TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));


}
}