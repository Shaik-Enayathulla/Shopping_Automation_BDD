package stepDefinations;

import org.junit.Assert;

import factory.BassClass;
import io.cucumber.java.en.*;
import pageObjects.Shopping_HomePage;

public class Subsucribition_Test005 {
	Shopping_HomePage hp;
	@Given("User launch the page and land at Home page of application")
	public void user_launch_the_page_and_land_at_home_page_of_application() {
	    hp=new Shopping_HomePage(BassClass.getdriver());
	}

	@When("User scroll down until the text {string} is visible")
	public void user_scroll_down_until_the_text_is_visible(String string) {
	   hp.scroll_to_subscribtion();
	}

	@When("User enters a valid email address in the subscription input field")
	public void user_enters_a_valid_email_address_in_the_subscription_input_field() {
	    String input_email="Shaik123@gmail.com";
	    hp.set_subcrib_email(input_email);
	}

	@When("User clicks the subscribe arrow button")
	public void user_clicks_the_subscribe_arrow_button() {
	    hp.click_subcrib_btn();
	}

	@Then("User verifies the success message {string} is visible")
	public void user_verifies_the_success_message_is_visible(String string) {
	   String expected_string = string;
	   String actual_string=hp.Validate_actual_subcribtion_message();
	   
	   Assert.assertEquals(actual_string,expected_string);
	}
}
