package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping_HomePage extends BasePage {
	public Shopping_HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement singup_page;
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement deleteAcct_btn;
	
	@FindBy(xpath="//li[10]//a[1]")
	WebElement Actul_text;
	
	@FindBy(xpath="//b[normalize-space()='Shaik1Shaikk']")
	WebElement LoggedIn;
	
	@FindBy(xpath="//a[normalize-space()='Contact us']")
	WebElement contactUs_navg_link;
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement Products_navg_link;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logout_btn;
	
	@FindBy(xpath="//h2[normalize-space()='Subscription']")
	WebElement subscription_UI_txt;
	
	@FindBy(xpath="//input[@id='susbscribe_email']")
	WebElement subcrib_input_email_box;
	
	@FindBy(xpath="//div[@id='success-subscribe']")
	WebElement actual_subcrib_txt;
	
	@FindBy(xpath="//button[@id='subscribe']")
	WebElement subscribe_btn;
	
	public void navigate_signup_page()
	{
		singup_page.click();
	}
	
	public void DeleteAcct()
	{
		deleteAcct_btn.click();
	}
	
	public String actula_displyed_txt()
	{
		return Actul_text.getText();
	}
	
	public boolean DD_actual_logged_user()
	{
		String act_loggedin = LoggedIn.getText();
		return act_loggedin.contains("Logged in as");
	}
	
	public void navigate_to_ContactUs_page()
	{
		contactUs_navg_link.click();
	}
	
	public void navigate_to_Products_page()
	{
		Products_navg_link.click();
	}
	
	public void logout()
	{
		logout_btn.click();
	}
	
	public void scroll_to_subscribtion()
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", subscription_UI_txt);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(subscription_UI_txt));
	}
	
	public void set_subcrib_email(String str)
	{
		subcrib_input_email_box.sendKeys(str);
	}
	
	public void click_subcrib_btn()
	{
		subscribe_btn.click();
	}
	
	public String Validate_actual_subcribtion_message()
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//WebElement dymic_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(actual_subcrib_txt));
		
		return actual_subcrib_txt.getText();
	}

}
