package test_Cases;

import org.testng.annotations.Test;

import base_Class.Url_Login_Logout;
import page_Object.Login_Page;

public class Login_002TestCases extends Url_Login_Logout {
	
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
