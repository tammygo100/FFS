package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ffspage 
{
	private WebDriver driver;
	//locatorsl
	private By aggflag=By.xpath("//*[@data-test-automation-id=\"addButton\"]");
	private By flagname=By.id("id");
	private By datatype=By.xpath("//*[@data-test-automation-id=\"toggle\"]");
	private By savebtn=By.xpath("//*[@data-test-automation-id=\"saveButton\"]");
	private By list=By.xpath("//li[@class=\"multi-select-list-content\"]");
	private By submitbtn=By.xpath("//*[@data-test-automation-id=\"submit\"]");
	private By toolsbtn=By.xpath("//a[text()='Tools']");
	private By ffsservice=By.xpath("//div[text()='Feature Flags Service' and  ancestor:: a[@data-test-automation-id='featureFlagsService']]");
	
	
	public ffspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//pageactions
		public String gettitlepage()
		{
			return driver.getTitle();
		}
		public void clicksubmitbtn()
		{
			driver.findElement(submitbtn).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(toolsbtn).click();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(ffsservice).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public boolean isaddflagbtndisplayed()
		{
			return driver.findElement(aggflag).isDisplayed();
		}
		
		public void clickffbtn()
		{
			driver.findElement(flagname).click();
		}
		public void flagname(String flagna)
		{
			driver.findElement(flagname).sendKeys(flagna);
		}
		public void description(String description)
		{
			driver.findElement(flagname).sendKeys(description);
		}
		
		public void clicksavebtn()
		{
			driver.findElement(savebtn).click();
		}
		public void datatype()
		{
			driver.findElement(datatype).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		List<String> all_elements_text=new ArrayList<>();
		List<WebElement> myList = driver.findElements(list);
		

			for(WebElement e : myList)
			{
					String text = e.getText();
					System.out.println(text);
					all_elements_text.get(2);
					
			}
		}
}

