package stepDefinations;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import factory.BassClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Shopping_HomePage;
import pageObjects.Signup_Login_Page;
import utilites.dataReaderutility;

public class User_LoginFuntionallity_002 {
	
	Shopping_HomePage hp;
	Signup_Login_Page slp;
	List<HashMap<String, String>> datamap;
	
	@Given("user navigate to Login page")
	public void user_navigate_to_login_page() {
		hp = new Shopping_HomePage(BassClass.getdriver());
	    hp.navigate_signup_page();
	}

	@When("user enter the correct email address as {string} and password as {string}")
	public void user_enter_the_correct_email_address_as_and_password_as(String user_name, String pswd) {
	    slp = new Signup_Login_Page(BassClass.getdriver());
	    slp.setLoginEmail(user_name);
	    slp.setPassword(pswd);
	    
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		slp.click_loginbtn();
	}

	@Then("{string} should be visible")
	public void should_be_visible(String string) {
	    Assert.assertEquals(string, hp.actula_displyed_txt());
	}
	
	@Then("user should try to loged in the application with provided excel data {string}")
	public void loging_test_using_excel_data(String rows) throws IOException
	{
		datamap = dataReaderutility.logingData(System.getProperty("user.dir")+"\\testData\\Login_Valitation_data.xlsx","Sheet1");
		int rowindex = Integer.parseInt(rows)-1;
		String Email_DD = datamap.get(rowindex).get("Email");
		String pswd_DD = datamap.get(rowindex).get("Password");
		String expected_DD = datamap.get(rowindex).get("Validation");
		slp = new Signup_Login_Page(BassClass.getdriver());
		hp = new Shopping_HomePage(BassClass.getdriver());
		slp.setLoginEmail(Email_DD);
		slp.setPassword(pswd_DD);
		slp.click_loginbtn();
		
		try {
			boolean userlogged = hp.DD_actual_logged_user() ;
			if(expected_DD.equalsIgnoreCase("valid"))
			{
				if(userlogged==true)
				{
					hp.logout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			if(expected_DD.equalsIgnoreCase("invalid"))
			{
				if(userlogged==true)
				{
					hp.logout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Occured Exception meassag"+e.getMessage());
		}
	
	}

}
