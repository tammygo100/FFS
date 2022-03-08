package stepdefinations;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.loginpage;
import com.qa.factory.driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps 
{
	private static String title;
	private WebDriver driver;
	loginpage login=new loginpage(driverfactory.getdriver());
	
	/*@Given("user is on login page")
	public void user_is_on_login_page() {
		driverfactory.getdriver().get("http://scp-devf13ams.lab.nordigy.ru:8080/app/tools/featureFlagsService/flags/list");
	
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		 title = login.gettitlepage();
		System.out.println(title);
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {	
		Assert.assertTrue(title.contains(expectedtitle));
	  
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
	    Assert.assertTrue(login.isforgotpasswordlinkexists());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	 login.username(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   login.password(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    login.clickonsignin();
	}*/

   

}
