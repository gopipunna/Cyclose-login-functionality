package test_Cases;

import org.testng.annotations.Test;

import base_Class.Base_Class;
import page_Object.Login_Page;
import page_Object.Scheduled;

public class Scheduled_TC extends Base_Class{
	public Login_Page lp;
	public Scheduled sd;
	@Test
	public void LoginTest() throws InterruptedException
	{
		lp=new Login_Page(driver);
		
		lp.LoginButton();
		lp.user();
		lp.password();
		lp.loginClick();
		
		sd=new Scheduled (driver);
		sd.Setpayuser2();
		Thread.sleep(3000);
		sd.SearchContact2();
		sd.EnterAmount2();
		sd.ClickSchedul();
		sd.date();
		sd.descrip2();
		sd.confirm2();
		
	}
}


