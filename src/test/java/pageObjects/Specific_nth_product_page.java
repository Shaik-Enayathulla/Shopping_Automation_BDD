package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Specific_nth_product_page extends BasePage {

	public Specific_nth_product_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='Blue Top']")
	WebElement productNameField;
	
	@FindBy(xpath="//p[normalize-space()='Category: Women > Tops']")
	WebElement categoryField;
	
	@FindBy(xpath="//span[normalize-space()='Rs. 500']")
	WebElement priceField;
	
	@FindBy(xpath="//b[normalize-space()='Availability:']")
	WebElement availabilityField;
	
	@FindBy(xpath="//b[normalize-space()='Condition:']")
	WebElement conditionField;
	
	@FindBy(xpath="//b[normalize-space()='Brand:']")
	WebElement brandField;
	
	public boolean isProductNameVisible() {
        try {
            return productNameField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Method to check if the category field is visible
    public boolean isCategoryVisible() {
        try {
            return categoryField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Method to check if the price field is visible
    public boolean isPriceVisible() {
        try {
            return priceField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Method to check if the availability field is visible
    public boolean isAvailabilityVisible() {
        try {
            return availabilityField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Method to check if the condition field is visible
    public boolean isConditionVisible() {
        try {
            return conditionField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Method to check if the brand field is visible
    public boolean isBrandVisible() {
        try {
            return brandField.isDisplayed();
        } catch (Exception e) {
            return false;
       }
    }
}