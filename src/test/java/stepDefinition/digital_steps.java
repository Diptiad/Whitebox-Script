package stepDefinition;

import org.openqa.selenium.WebDriver;

import action.common_actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class digital_steps {
	WebDriver driver;
	globalHooks globalhook;
	common_actions action;

	public digital_steps(common_actions action)
		{
			this.action=action;
		}

	/*@When("user is landed on a home page")
	public void user_is_landed_on_a_home_page() {
		System.out.println("1");
	}*/

	@Then("user searches the Digital app in Operation menu")
	public void user_searches_the_digital_app_in_operation_menu() {
		System.out.println("2");
	}

	@Then("user clicks on the digital option and land on Digital app")
	public void user_clicks_on_the_digital_option_and_land_on_digital_app() {
		System.out.println("3");
	}

	@Then("Select the One Agency for the digital medium")
	public void select_the_one_agency_for_the_digital_medium() {
		System.out.println("4");
	}

	@Then("user is able to select the client")
	public void user_is_able_to_select_the_client() {
		System.out.println("5");}

	@Then("user is able to select the brand")
	public void user_is_able_to_select_the_brand() {
		System.out.println("6");
	}

}
