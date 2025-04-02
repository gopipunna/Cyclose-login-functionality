package page_Object;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay_User_Page {
	
	public WebDriver driver;
	Actions ac;
	public Pay_User_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@class='quick-access-item'])[1]")
    WebElement payuser;
	
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement contactsList;
	
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount;
	
	@FindBy(xpath="//button[@title='Pay now']")
	WebElement paynow;
	
	@FindBy(id="id_5")
	WebElement description;
	
	@FindBy(xpath="//action-button[@class='d-inline-block button']//span")
	WebElement confirm;
	
	public void Setpayuser() {
		payuser.click();
	}
	
	public void SearchContact() {
		contactsList.click();
		driver.findElement(By.xpath("(//div[@class='modal-content']//div//a)[3]")).click();
		
	    }
	   
	public void EnterAmount() {
		amount.sendKeys("1");
	}
	public void ClickPayNow() {
		paynow.click();
		//driver.findElement(By.xpath("//div[@id=\"dropdown-menu-id_4\"]//a[1]")).click();
		
		List<WebElement> ele02=driver.findElements(By.xpath("//div[@role='listbox']//a"));
		int size=ele02.size();
		System.out.println(size);
		
		for(int j=0;j<size;j++)
		{
			String value1=ele02.get(j).getText();
			System.out.println(value1);
			if(value1.equals(" Pay now "))
			{
				ele02.get(j).click();
			}
			
		}
		
		
	}
	public void descrip() {
		description.sendKeys("Payment Done");
	}
	public void confirm() {
		confirm.click();
	}
	

}
