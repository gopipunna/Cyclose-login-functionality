package test_Cases;

import org.testng.annotations.Test;

import base_Class.Url_Login_Logout;
import page_Object.Login_Page;
import page_Object.Pay_User_Function;

public class Pay_User_003TestCases extends Url_Login_Logout {
	
	public Login_Page lp;
	public Pay_User_Function puf;
	@Test
	public void payUser() throws InterruptedException
	{
		lp=new Login_Page(driver);
		lp.LoginButton();
		lp.user();
		lp.password();
		lp.loginClick();
		
		puf=new Pay_User_Function(driver);
		
		puf.Setpayuser();
		Thread.sleep(2000);
		puf.SearchContact();
		Thread.sleep(10000);
		
		puf.EnterAmount();
		
		puf.ClickPayNow();
		System.out.println("paynow clicked");
		puf.descrip();
		puf.confirm();
		
	}
	
	

}
