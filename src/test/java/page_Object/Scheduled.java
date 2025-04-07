package page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheduled {
	public WebDriver driver;
	public Scheduled (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
	}
	
	
	@FindBy(xpath="(//a[@class='quick-access-item'])[1]")
    WebElement payuser;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement contactsList;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount;
	
	@FindBy(xpath="//button[@title='Pay now']")
	WebElement Schedul;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement DueDate;
	
	@FindBy(id="id_5")
	WebElement description;
	
	@FindBy(xpath="//action-button[@class='d-inline-block button']//span")
	WebElement confirm;
	
	
	public void Setpayuser2() {
		payuser.click();
	}
	
	public void SearchContact2() {
		contactsList.click();
		driver.findElement(By.xpath("(//div[@class='modal-content']//div//a)[3]")).click();
		
	    }
	   
	public void EnterAmount2() {
		amount.sendKeys("1");
	}
	public void ClickSchedul() {
		Schedul.click();
		//driver.findElement(By.xpath("//div[@id=dropdown-menu-id_9]//a[2]")).click();
		
		List<WebElement> ele02=driver.findElements(By.xpath("//div[@role='listbox']//a"));
		int size=ele02.size();
		System.out.println(size);
		
		for(int j=0;j<size;j++)
		{
			String value1=ele02.get(j).getText();
			System.out.println(value1);
			if(value1.equals("Scheduled"))
			{
				ele02.get(j).click();
			}
			
		}
	}
	public void date() {
		DueDate.sendKeys("14/08/2025");
		System.out.println(DueDate.getText());
}
	public void descrip2() {
		description.sendKeys("Payment Done");
		System.out.println(description.getText());
	}
	public void confirm2() {
		confirm.click();
	}
}


