package page_Object;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recrurring_Payments {
	public WebDriver driver;
	public Recrurring_Payments (WebDriver driver) {
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
	WebElement Payments;
	
	@FindBy(xpath="(//div[@class='d-flex label-value-value'])[6]//div[2]")
	WebElement futuredate;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement fristDate;

	@FindBy(xpath="(//div[@class='d-flex label-value-value'])[8]//div[2]")
	WebElement RadioButton;

	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement Nooffoccurance;

	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement process;

	@FindBy(xpath="(//button[@type='button'])[4]")				
	WebElement dropdown;

	@FindBy(id="id_5")
	WebElement description;
	
	@FindBy(xpath="//action-button[@class='d-inline-block button']//span")
	WebElement confirm;
	
	
	
	
	public void Setpayuser4() {
		payuser.click();
	}
	
	public void SearchContact4() {
		contactsList.click();
		driver.findElement(By.xpath("(//div[@class='modal-content']//div//a)[3]")).click();
		
	    }
	   
	public void EnterAmount4() {
		amount.sendKeys("1");
	}
	public void Clickrecrurringpayment() {
		Payments.click();
		//driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[3]")).click();
		
		List<WebElement> ele02=driver.findElements(By.xpath("//div[@role='listbox']//a"));
		int size=ele02.size();
		System.out.println(size);
		
		for(int j=0;j<size;j++)
		{
			String value1=ele02.get(j).getText();
			System.out.println(value1);
			if(value1.equals("Recurring payments"))
			{
				ele02.get(j).click();
			}
			
		}
	}
	
	public void ftrdate4() {
		futuredate.click();

}
	public void FristOccuranceDate() {
		fristDate.sendKeys("14/08/2025");
		System.out.println(fristDate.getText());
}
	public void repeatUntill() {
		RadioButton.click();
	}
	public void fixNumofoccurence() {
		Nooffoccurance.sendKeys("2");
	}
	
	public void Days_in_Process() {
		process.sendKeys("2");
	}
	public void Weeks_DropDown() {
		dropdown.click();
		//driver.findElement(By.xpath("(//div[@role='listbox'])[2]//a[2]")).click();
		List<WebElement>week=driver.findElements(By.xpath("(//div[@role='listbox'])[2]//a"));
		int size=week.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			String value=week.get(i).getText();
			System.out.println(value);
			if (value.equals("Weeks")) {
				week.get(i).click();
			}
		}
		
	}
	public void descrip4() {
		description.sendKeys("Payment Done");
		System.out.println(description.getText());
	}
	public void Next4() {
		confirm.click();
	}
}
		