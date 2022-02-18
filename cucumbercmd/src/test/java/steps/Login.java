package steps;

import io.cucumber.java.en.*;

public class Login {
	@Given("user Launch Edge browser")
	public void user_launch_edge_browser() {
	    System.out.println("launch browser");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		System.out.println("open url");

	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		System.out.println("enter user and password");

	}

	@When("Click on login")
	public void click_on_login() {
		System.out.println("login");
 
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		System.out.println("page title");

	    	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		System.out.println("logout");

	}

	@Then("close browser")
	public void close_browser() {
		System.out.println("close");

	}

}
