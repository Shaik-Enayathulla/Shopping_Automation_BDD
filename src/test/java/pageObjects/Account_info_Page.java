package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Account_info_Page extends BasePage {
	public Account_info_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	WebElement Acct_info_title;
	
	
	@FindBy(xpath="//label[normalize-space()='Mr.']")
	WebElement Mr_radio_check;
	
	@FindBy(xpath="//label[normalize-space()='Mrs.']")
	WebElement Mrs_radio_check;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Name_inp_box;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Pswd_inp_box;
	
	@FindBy(xpath="//select[@name='days']")
	WebElement day_drp_down;
	
	@FindBy(xpath="//select[@name='months']")
	WebElement moth_drp_down;
	
	@FindBy(xpath="//select[@name='years']")
	WebElement year_drp_down;
	
	@FindBy(xpath="//input[@name='newsletter']")
	WebElement newletter_chk_box;
	
	@FindBy(xpath="//input[@name='optin']")
	WebElement offer_chk_box;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName_inp_txt;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName_inp_txt;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement compName_inp_txt;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement Adrss1_inp_txt;
	
	@FindBy(xpath="//input[@name='address2']")
	WebElement Adrss2_inp_txt;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement country_drp_down;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state_inp_txt;

	@FindBy(xpath="//input[@name='city']")
	WebElement city_inp_txt;
	
	@FindBy(xpath="//input[@name='zipcode']")
	WebElement zipc_inp_txt;
	
	@FindBy(xpath="//input[@name='mobile_number']")
	WebElement phno_inp_txt;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement cret_acct_btn;
	
	public String Acc_Info_Page_txt()
	{
		return Acct_info_title.getText();
	}
	
	public void setGendar(String str)
	{
		if(str.equalsIgnoreCase("Mr."))
		{
			Mr_radio_check.click();
		}
		else
		{
			Mrs_radio_check.click();
		}
	}
	
	public void setName(String strName)
	{
		Name_inp_box.sendKeys(strName);
	}
	
	public void setPassword(String strPswd)
	{
		Pswd_inp_box.sendKeys(strPswd);
	}
	
	public void setDay(String strDay)
	{
		Select sc = new Select(day_drp_down);
		sc.selectByVisibleText(strDay);
	}
	
	public void setMonth(String strMth)
	{
		int n = Integer.parseInt(strMth);
		Select sc = new Select(moth_drp_down);
		sc.selectByIndex(n);
	}
	public void setYear(String strYer)
	{
		Select sc = new Select(year_drp_down);
		sc.selectByVisibleText(strYer);
	}
	
	public void enableChkBoxes()
	{
		offer_chk_box.click();
		newletter_chk_box.click();
	}
	
	public void setFirstName(String strFrtName)
	{
		firstName_inp_txt.sendKeys(strFrtName);
	}
	
	public void setLastName(String strLastName)
	{
		lastName_inp_txt.sendKeys(strLastName);
	}
	
	public void setAddress(String compy, String addr1, String addr2, String ctry, String state, String city, String zip, String phn)
	{
		compName_inp_txt.sendKeys(compy);
		Adrss1_inp_txt.sendKeys(addr1);
		Adrss2_inp_txt.sendKeys(addr2);

		Select scn = new Select(country_drp_down);
		scn.selectByVisibleText(ctry);
		state_inp_txt.sendKeys(state);
		city_inp_txt.sendKeys(city);
		zipc_inp_txt.sendKeys(zip);
		phno_inp_txt.sendKeys(phn);
	}
	
	public void clickCreateBtn()
	{
		cret_acct_btn.click();
	}
	
}
