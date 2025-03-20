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
	
	@FindBy(xpath="(//input[@class='form-control w-100 ng-touched ng-dirty ng-valid'])[1]")
	WebElement name;
	
	@FindBy(xpath="(//input[@class='form-control w-100 ng-touched ng-dirty ng-valid'])[2]")
	WebElement LoginName;
	
	@FindBy(xpath="(//input[@class='form-control w-100 ng-touched ng-dirty ng-valid'])[3]")
	WebElement email;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	WebElement gender;
	
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	WebElement next;
	
	@FindBy(xpath="//input[@class='form-control w-100 ng-pristine ng-invalid ng-touched']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid']")
	WebElement cpassword;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement demoTest;
	
	
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	WebElement submit;
	
	
	//creation of action
	
	public void setRegisterClicj()
	{
		registerClick.click();
	}
	public void SetName()
	{
		name.sendKeys("nishi");
	}
	public void SetLoginName()
	{
		LoginName.sendKeys("nishi123");	
	}
	public void SetMailid()
	{
		email.sendKeys("nishi123@gmail.com");
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
		password.sendKeys("Choti@123");
	}
	public void SetConfirmPassword()
	{
		cpassword.sendKeys("Choti@123");
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


