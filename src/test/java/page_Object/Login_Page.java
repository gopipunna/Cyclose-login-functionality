package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="login-link")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@placeholder='User']")
	WebElement user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement loginClick;
	
	
	public void LoginButton()
	{
		loginButton.click();	}

	public void user() {
		user.sendKeys("demo");
	}
	public void password()
	{
		password.sendKeys("1234");
	}
	public void loginClick()
	{
		loginClick.click();
	}
	
}
