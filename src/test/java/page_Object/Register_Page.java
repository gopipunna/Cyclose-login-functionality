package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	public WebDriver driver;
	public Register_Page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	//identification of elements
	
	@FindBy(id="register-link")
	WebElement registerClick;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	WebElement name;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	WebElement LoginName;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	WebElement email;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	WebElement gender;
	
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	WebElement next;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	WebElement password;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	WebElement cpassword;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement demoTest;
	
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement submit;
	
	
	//creation of action
	
	public void setRegisterClicj()
	{
		registerClick.click();
	}
	public void SetName()
	{
		name.sendKeys("nhikum");
	}
	public void SetLoginName()
	{
		LoginName.sendKeys("gopipunna");	
	}
	public void SetMailid()
	{
		email.sendKeys("gopipunna8@gmail.com");
	}
	public void SetGender()
	{
		gender.click();
	}
	public void SetNextButton()
	{
		next.click();
	}
	public void SetPassword()
	{
		password.sendKeys("Anu1122@.com");
	}
	public void SetConfirmPassword()
	{
		cpassword.sendKeys("Anu1122@.com");
	}
	public void SetDemoTest()
	{
		demoTest.click();
	}
	
	public void SetSubmit()
	{
		submit.click();
	}
	
	}


