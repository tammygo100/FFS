package mytestrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src.test.resource/com/features/addffslist.feature"},
			glue = {"stepdefinations","apphooks"},
			plugin = {"pretty",
				
				}
			)
	public class myestrunner { 

}
