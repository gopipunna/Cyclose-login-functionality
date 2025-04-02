package test_Cases;

import org.testng.annotations.Test;

import base_Class.Base_Class;
import page_Object.Login_Page;

public class Login_Page_TestCases extends Base_Class {
	
	public Login_Page lp;
	@Test
	public void LoginTest()
	{
		lp=new Login_Page(driver);
		
		lp.LoginButton();
		lp.user();
		lp.password();
		lp.loginClick();
	}
}
