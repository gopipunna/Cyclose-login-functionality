package base_Class;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;




public class Url_Login_Logout {
	public static WebDriver driver;
	@BeforeClass
	
	public void OpenApplication()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
}


