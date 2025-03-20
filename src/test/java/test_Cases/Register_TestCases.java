package test_Cases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base_Class.Url_Login_Logout;
import page_Object.Register_Page;

public class Register_TestCases extends Url_Login_Logout {
	
	public Register_Page rp;
	@Test
	
		public void RegisterTest() throws InterruptedException, IOException
		{
		rp=new Register_Page(driver);
		
		rp.setRegisterClicj();
		System.out.println("registration is clicked");
			rp.SetName();
			rp.SetLoginName();
			rp.SetMailid();
			rp.SetGender();
			System.out.println("entered the data");
			rp.SetNextButton();
			Thread.sleep(3000);
			rp.SetPassword();
			rp.SetConfirmPassword();
			rp.SetDemoTest();
			Thread.sleep(15000);
			rp.SetSubmit();
			Thread.sleep(10000);
			TakesScreenshot tc=(TakesScreenshot)driver;
			File src=tc.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Cyclos_TestNG\\CyclosScreenhot\\wholepage.png");
			FileUtils.copyFile(src, trg);
	}
	
	

}
