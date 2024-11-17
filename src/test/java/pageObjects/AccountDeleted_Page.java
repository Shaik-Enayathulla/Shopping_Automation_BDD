package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeleted_Page extends BasePage{

		public AccountDeleted_Page(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
		WebElement acct_deleted_msg;
		
		public String Acct_Dele_Msg()
		{
			return acct_deleted_msg.getText();
		}
}
