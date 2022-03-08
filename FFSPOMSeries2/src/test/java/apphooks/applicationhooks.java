package apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.driverfactory;
import com.qa.util.configreader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class applicationhooks 
{
	private driverfactory driverfact;
	public WebDriver driver;
	private configreader configread;
	Properties prop;
	
	@Before(order=0)
	public void getproperty()
	{
		configread=new configreader();
		prop=configread.init_prop();		
		
	}
	
	@Before(order=1)
	public void launchbrowser()
	{
		String browsername = prop.getProperty("browser");
		driverfact=new driverfactory();
		driver=driverfact.init_driver(browsername);
		
	}
	
	@After(order=0)
	public void quitbrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void teardown(Scenario sc)
	{
		if(sc.isFailed())
		{
			//takescreenshot
			String screenshotname=sc.getName().replaceAll("", "");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshotname, "image/png", screenshotname);
		}
	}

}
