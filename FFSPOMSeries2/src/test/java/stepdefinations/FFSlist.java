package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.ffspage;
import com.pages.loginpage;
import com.qa.factory.driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FFSlist 
{
	private static String title;
	private WebDriver driver;
	//loginpage login=new loginpage(driverfactory.getdriver());
	ffspage ffs=new ffspage(driverfactory.getdriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driverfactory.getdriver().get("http://scp-devf13ams.lab.nordigy.ru:8080/app/tools/featureFlagsService/flags/list");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ffs.clicksubmitbtn();
	
	}
	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		  title = ffs.gettitlepage();
		System.out.println(title);
	   
	}
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {	
		Assert.assertTrue(title.contains(expectedtitle));
	  
	}
	@Then("Add flag link should be displayed")
	public void add_flag_link_should_be_displayed() 
	{
		Assert.assertTrue(ffs.isaddflagbtndisplayed());
	}

	@When("user clicks on addflag")
	public void user_clicks_on_addflag() {
	  ffs.clickffbtn();
	}

	@When("user enters flagname {string}")
	public void user_enters_flagname(String flagname) {
	    ffs.flagname(flagname);
	}

	@When("user select datatype")
	public void user_select_datatype() {
	   ffs.datatype();
	}

	@When("user enters description {string}")
	public void user_enters_description(String string) {
	    ffs.description(string);
	}

	@Then("user clicks on save button")
	public void user_clicks_on_save_button() {
	    ffs.clicksavebtn();
	}

}
