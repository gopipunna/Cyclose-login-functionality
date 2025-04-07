package page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Monthly_Instalment {
	public WebDriver driver;
	JavascriptExecutor js;
	public Monthly_Instalment(WebDriver driver) {
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
	WebElement Montly;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement Noofinstallments;
	
	@FindBy(xpath="(//div[@class='d-flex label-value-value'])[7]//div[2]")
	WebElement futuredate;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement instalmtdate;

	@FindBy(id="id_5")
	WebElement description;
	
	@FindBy(xpath="//action-button[@class='d-inline-block button']//span")
	WebElement confirm;
	
	
	
	
	public void Setpayuser3() {
		payuser.click();
	}
	
	public void SearchContact3() {
		contactsList.click();
		driver.findElement(By.xpath("(//div[@class='modal-content']//div//a)[3]")).click();
		
	    }
	   
	public void EnterAmount3() {
		amount.sendKeys("1");
	}
	public void ClickMonthlyInstallment() {
		Montly.click();
		//driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[3]")).click();
		
		List<WebElement> ele02=driver.findElements(By.xpath("//div[@role='listbox']//a"));
		int size=ele02.size();
		System.out.println(size);
		
		for(int j=0;j<size;j++)
		{
			String value1=ele02.get(j).getText();
			System.out.println(value1);
			if(value1.equals("Monthly installments"))
			{
				ele02.get(j).click();
			}
			
		}
	}
	public void installments() {
		Noofinstallments.sendKeys("2");
	}
	public void ftrdate() {
		futuredate.click();
	}
	public void instalmentdate() {
		instalmtdate.sendKeys("10/12/2025");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='10/12/2025';",instalmtdate);
	}

	public void descrip3() {
		//description.sendKeys("Payment Done");
		System.out.println(description.getText());
	}
	public void Next3() {
		confirm.click();
	}
}
	

