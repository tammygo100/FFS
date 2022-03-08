package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage
{

	//Locators
	
	private By emailid=By.id("email");
	private By pasword=By.id("passwd");
	private By submit=By.id("SubmitLogin");
	private By forgotpwdlink=By.linkText("Forgot your password?");
	private WebDriver driver;
	
	
	//constructor of the class
	
	public loginpage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	//pageactions
	public String gettitlepage()
	{
		return driver.getTitle();
	}
	
	public boolean isforgotpasswordlinkexists()
	{
		return driver.findElement(forgotpwdlink).isDisplayed();
	}
	
	public void username(String username)
	{
		driver.findElement(emailid).sendKeys(username);
	}
	
	public void password(String password)
	{
		driver.findElement(pasword).sendKeys(password);
	}
	public void clickonsignin()
	{
		driver.findElement(submit).click();
	}
}
