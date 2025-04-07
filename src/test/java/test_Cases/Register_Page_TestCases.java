package test_Cases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base_Class.Base_Class;
import page_Object.Register_Page;

public class Register_Page_TestCases extends Base_Class {
	
	public Register_Page rp;
	@Test
	
		public void RegisterTest() throws InterruptedException, IOException
		{
		rp=new Register_Page(driver);
		
		rp.setRegisterClicj();
		
			rp.SetName();
			rp.SetLoginName();
			rp.SetMailid();
			rp.SetGender();
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
			File trg=new File("C:\Users\USER\Downloads\Cyclos_TestNG share1\Cyclos_TestNG\CyclosScreenhot\cyclos.png");
			FileUtils.copyFile(src, trg);
	}
	
	

}
