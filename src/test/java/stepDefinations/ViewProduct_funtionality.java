package stepDefinations;

import factory.BassClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.AllProduct_Page;
import pageObjects.Shopping_HomePage;
import pageObjects.Specific_nth_product_page;

public class ViewProduct_funtionality {
	Shopping_HomePage hp;
	AllProduct_Page allprdpage;
	Specific_nth_product_page nthprdpage;
	
	@Given("user navigates to All Products page")
	public void user_navigates_to_all_products_page() {
	   hp = new Shopping_HomePage(BassClass.getdriver());
	   hp.navigate_to_Products_page();
	}

	@When("the user clicks on View Product text link of the first product")
	public void first_product_page() {
		allprdpage = new AllProduct_Page(BassClass.getdriver());
		allprdpage.navigate_1st_product_page();
	}

	@SuppressWarnings("deprecation")
	@Then("the user verifies the product name, category, price, availability, condition and brand product details are visible")
	public void required_details_are_visible() {
		nthprdpage = new Specific_nth_product_page(BassClass.getdriver());
		 Assert.assertTrue("Product Name field is visible", nthprdpage.isProductNameVisible());
	        Assert.assertTrue("Category field is visible", nthprdpage.isCategoryVisible());
	        Assert.assertTrue("Price field is visible", nthprdpage.isPriceVisible());
	        Assert.assertTrue("Availability field is visible", nthprdpage.isAvailabilityVisible());
	        Assert.assertTrue("Condition field is visible", nthprdpage.isConditionVisible());
	        Assert.assertTrue("Brand field is visible", nthprdpage.isBrandVisible());
	}


}
