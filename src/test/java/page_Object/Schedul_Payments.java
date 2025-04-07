package page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedul_Payments {
	public WebDriver driver;
	public Schedul_Payments(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="(//a[@class='quick-access-item'])[1]")
    WebElement payuser;
	
	@FindBy(xpath="//div[@class='card mx-auto shadow-sm']//a[6]/div")
	WebElement SchedulPayments;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement status;
	
	@FindBy(xpath="(//table[@class='table table-hover cursor-pointer'])//td")
	WebElement settledata;
	
	/*@FindBy(xpath="")
	WebElement futuredate;
	
	@FindBy(xpath="")
	WebElement fristDate;*/
	
	
	public void setPayuser5() {
		payuser.click();
	}

	public void Scheduldpayments() {
		SchedulPayments.click();
	}
	public void StatusDropdown() {
		status.click();
		List<WebElement>ele=driver.findElements(By.xpath("//div[@role='listbox']//a"));
		int size=ele.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			String values=ele.get(i).getText();
			System.out.println(values);
			if (values.equals("Settled")) {
				ele.get(i).click();
			}
		}
	}
	public void SettledData() {
		//System.out.println(settledata.getText());
		List<WebElement>ele1=settledata.findElements(By.xpath("(//table[@class='table table-hover cursor-pointer'])//td"));
		int size=ele1.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			String values=ele1.get(i).getText();
			System.out.println(values);
			
			}
	}

}

