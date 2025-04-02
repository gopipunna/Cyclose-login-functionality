package test_Cases;

import org.testng.annotations.Test;

import base_Class.Base_Class;
import page_Object.Login_Page;
import page_Object.Pay_User_Page;

public class Pay_User_Page_TestCases extends Base_Class {
	
	public Login_Page lp;
	public Pay_User_Page pup;
	@Test
	public void payUser() throws InterruptedException
	{
		lp=new Login_Page(driver);
		lp.LoginButton();
		lp.user();
		lp.password();
		lp.loginClick();
		
		pup=new Pay_User_Page(driver);
		
		pup.Setpayuser();
		Thread.sleep(2000);
		pup.SearchContact();
		Thread.sleep(1000);
		
		pup.EnterAmount();
		
		pup.ClickPayNow();
		System.out.println("paynow successfully clicked");
		Thread.sleep(3000);
		pup.descrip();
		pup.confirm();
		
	}
	
	

}
