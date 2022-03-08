package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class driverfactory 
{
	public WebDriver driver;
	/*
	 * this is to initialize the local driver
	 */
	public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<>();
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("browser value is "+browser);
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tdriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tdriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			tdriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		getdriver().manage().deleteAllCookies();
		getdriver().manage().window().maximize();
		return getdriver();
	}
	
	
	public static synchronized WebDriver getdriver()
	{
		return tdriver.get();
	}
	
	

}
