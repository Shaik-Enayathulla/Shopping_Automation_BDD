package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup_Login_Page extends BasePage{
	public Signup_Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[contains(text(),'New User Signup!')]")
	WebElement singup_txt;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Name_inp_box;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement Email_inp_box;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement singup_btn;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement emailAddress_inptxt;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement password_inptxt;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_btn;
	
	public String Act_displayed_signup_txt()
	{
		return singup_txt.getText();
	}
	
	public void set_Name(String name)
	{
		Name_inp_box.sendKeys(name);
	}
	
	public void set_Email(String email)
	{
		Email_inp_box.sendKeys(email);
	}
	
	public void click_sinup_btn()
	{
		singup_btn.click();
	}
	
	public void setLoginEmail(String str)
	{
		emailAddress_inptxt.sendKeys(str);
	}
	
	public void setPassword(String str)
	{
		password_inptxt.sendKeys(str);
	}
	
	public void click_loginbtn()
	{
		login_btn.click();
	}
}
