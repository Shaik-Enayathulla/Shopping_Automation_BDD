package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {
	
	public AccountCreatedPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement conf_acc_cret_msg;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement cont_btn;
	
	public String getConfMsg()
	{
		return conf_acc_cret_msg.getText();
	}
	
	public void clickContBtn()
	{
		cont_btn.click();
	}
}
