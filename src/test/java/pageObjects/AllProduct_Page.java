package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProduct_Page extends BasePage {
	
	public AllProduct_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(css = "a[href='/product_details/1']")
	WebElement view_1st_Product;
	
	@FindBy(css = "a[href='/product_details/2']")
	WebElement view_2nd_Product;
	
	public void navigate_1st_product_page()
	{
		view_1st_Product.click();
	}
	
	public void navigate_2nd_product_page()
	{
		view_2nd_Product.click();
	}

}
