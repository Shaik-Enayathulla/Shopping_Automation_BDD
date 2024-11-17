package stepDefinations;

import java.util.Map;

import factory.BassClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.AccountCreatedPage;
import pageObjects.Account_info_Page;
import pageObjects.Shopping_HomePage;
import pageObjects.Signup_Login_Page;

@SuppressWarnings("deprecation")
public class User_Registration_001 {
	
	Shopping_HomePage hp;
	Signup_Login_Page logp;
	Account_info_Page AccInfoP;
	AccountCreatedPage AcctCreated;
	@Given("user launched the appplication and view the home screen")
	public void user_launched_appplication() {
	    System.out.println("Application is launched through the setup method");
	}

	@When("the user clicks on Signup button")
	public void clicks_on_Sinup_button() {
	   hp = new Shopping_HomePage(BassClass.getdriver());
	   hp.navigate_signup_page();
	}

	/*@Then("{string} is visible")
	public void is_visible(String string) {
	    logp = new Signup_Login_Page(BassClass.getdriver());
	    String actlStr=logp.Act_displayed_signup_txt();
	    Assert.assertEquals(string, actlStr);
	}*/

	@When("the user enters name and email address")
	public void the_user_enters_name_and_email_address(io.cucumber.datatable.DataTable dataTable) {
		logp = new Signup_Login_Page(BassClass.getdriver());
		AccInfoP = new Account_info_Page(BassClass.getdriver());
	    Map<String,String> data = dataTable.asMap(String.class,String.class);
	    logp.set_Name(data.get("Name"));
	    logp.set_Email(data.get("Email"));
	    
	    
	}

	@When("the user clicks Signup button")
	public void the_user_clicks_button1() {
		logp.click_sinup_btn();
	}
	
	@When("the user fills account details")
	public void the_user_fills_account_details(io.cucumber.datatable.DataTable dataTable) {
		AccInfoP = new Account_info_Page(BassClass.getdriver());
		Map<String,String> data = dataTable.asMap(String.class, String.class);
		AccInfoP.setName(data.get("Name"));
		AccInfoP.setGendar(data.get("Title"));
		AccInfoP.setPassword(data.get("Password"));
		String date = data.get("Date of Birth").toString();
		String[] arr = date.split("/");
		String month=arr[1];
		String year=arr[2];
		AccInfoP.setDay(arr[0]);
		AccInfoP.setMonth(month);
		AccInfoP.setYear(year);
	}

	@When("the user selects  checkbox")
	public void the_user_selects_checkbox() {
	    AccInfoP.enableChkBoxes();
	}

	@When("the user fills address details")
	public void the_user_clicks_button(io.cucumber.datatable.DataTable dataTable) {
		Map<String,String> data = dataTable.asMap(String.class, String.class);
		AccInfoP.setFirstName(data.get("FirstName"));
		AccInfoP.setLastName(data.get("LastName"));
		AccInfoP.setAddress(data.get("Company"), data.get("Address"), data.get("Address2"), data.get("Country"), data.get("State"), data.get("City"), data.get("Zipcode"), data.get("MobileNumber"));
	}
	
	@When ("the user clicks Create Account button")
	public void Create_Accunt_Btn_Click()
	{
		AccInfoP.clickCreateBtn();
	}
	
	@Then("{string} is visible")
	public void Final_text_visible(String Expectedstring)
	{
		AcctCreated = new AccountCreatedPage(BassClass.getdriver());
		String ActualString = AcctCreated.getConfMsg();
		Assert.assertEquals(Expectedstring, ActualString);
	}
}
