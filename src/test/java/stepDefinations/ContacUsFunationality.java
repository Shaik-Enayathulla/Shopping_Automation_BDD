package stepDefinations;

import java.util.Map;

import factory.BassClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.ContactUs_Page;
import pageObjects.Shopping_HomePage;

public class ContacUsFunationality {
	
	Shopping_HomePage hp;
	ContactUs_Page cp;
	@Given("user navigates to Contact Us page")
		public void user_navigates_to_contact_us_page() {
		    hp = new Shopping_HomePage(BassClass.getdriver());
		    hp.navigate_to_ContactUs_page();
		}

		@When("the user enters name, email, subject, and message")
		public void User_Enter_required_data(io.cucumber.datatable.DataTable dataTable) {
		    cp = new ContactUs_Page(BassClass.getdriver());
		    Map<String,String> data = dataTable.asMap(String.class,String.class);
		    cp.setName(data.get("Name"));
		    cp.setEmail(data.get("Email"));
		    cp.setSubject(data.get("Subject"));
		    cp.setMessage(data.get("Message"));
		}

		@When("the user uploads a file from {string}")
		public void user_uploads_a_file(String location) {
			//cp = new ContactUs_Page(BassClass.getdriver());
			cp.uploadFile(location);
		}

		@When("the user clicks Submit button")
		public void user_clicks_button() {
		    cp.click_Submit_btn();
		}
		
		@When("user click OK for alert window")
		public void Handle_Alert_window()
		{
			cp.handle_alert();
		}

		@Then("the success message {string} should be visible")
		public void validation(String string) {
			String Actual_msg = cp.displayed_Actual_message();
			Assert.assertEquals(Actual_msg, string);
		}
	
}
