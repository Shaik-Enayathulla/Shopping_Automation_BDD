package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends BasePage{

	public ContactUs_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Name_inp_box;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement Email_inp_box;
	
	@FindBy(xpath="//input[@placeholder='Subject']")
	WebElement subject_inp_box;
	
	@FindBy(xpath="//textarea[@placeholder='Your Message Here']")
	WebElement msg_inp_box;
	
	@FindBy(xpath="//input[@name='upload_file']")
	WebElement choose_file_btn;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submit_btn;
	
	@FindBy(xpath="//div[@class='status alert alert-success']")
	WebElement act_contactus_txt;
	
	public void setName(String str)
	{
		Name_inp_box.sendKeys(str);
	}
	
	public void setEmail(String str)
	{
		Email_inp_box.sendKeys(str);
	}
	
	public void setSubject(String str)
	{
		subject_inp_box.sendKeys(str);
	}
	
	public void setMessage(String str)
	{
		msg_inp_box.sendKeys(str);
	}
	
	public void uploadFile(String path)
	{
		choose_file_btn.sendKeys(path);
	}
	
	public void click_Submit_btn()
	{
		submit_btn.click();
	}
	
	public void handle_alert()
	{
		try 
		{
			Alert alr = driver.switchTo().alert();
			alr.accept();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured :"+e.getMessage());
		}
	}
	
	public String displayed_Actual_message()
	{
		return act_contactus_txt.getText();
	}
}

