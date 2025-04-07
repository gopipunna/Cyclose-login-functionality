package test_Cases;

import org.testng.annotations.Test;

import base_Class.Base_Class;
import page_Object.Login_Page;
import page_Object.Monthly_Instalment;
import page_Object.Pay_User_Page;
import page_Object.Recrurring_Payments;
import page_Object.Schedul_Payments;
import page_Object.Scheduled;

public class Pay_User_Page_TestCases extends Base_Class {
	
	public Login_Page lp;
	public Pay_User_Page pup;
	public Scheduled sd;
	public Monthly_Instalment mi;
	public Recrurring_Payments rp;
	public Schedul_Payments sp;
	@Test
	public void payUser() throws InterruptedException
	{
		lp=new Login_Page(driver);
		lp.LoginButton();
		lp.user();
		lp.password();
		lp.loginClick();
		
		/*pup=new Pay_User_Page(driver);
		
		pup.Setpayuser();
		Thread.sleep(2000);
		pup.SearchContact();
		Thread.sleep(1000);
		
		pup.EnterAmount();
		
		pup.ClickPayNow();
		System.out.println("paynow successfully clicked");
		Thread.sleep(3000);
		pup.descrip();
		pup.confirm();*/
		
		/*sd=new Scheduled (driver);
		sd.Setpayuser2();
		Thread.sleep(3000);
		sd.SearchContact2();
		sd.EnterAmount2();
		sd.ClickSchedul();
		System.out.println("Scheduled clicked");
		sd.date();
		
		sd.descrip2();
		Thread.sleep(3000);
		sd.confirm2();*/
		
		/*mi=new Monthly_Instalment(driver);
		mi.Setpayuser3();
		Thread.sleep(3000);
		mi.SearchContact3();
		mi.EnterAmount3();
		mi.ClickMonthlyInstallment();
		mi.installments();
		mi.ftrdate();
		System.out.println("clicked futuredate");
		mi.instalmentdate();
		mi.descrip3();
		Thread.sleep(3000);
		mi.Next3();*/
		
		/*rp=new Recrurring_Payments(driver);
		rp.Setpayuser4();
		Thread.sleep(3000);
		rp.SearchContact4();
		rp.EnterAmount4();
		rp.Clickrecrurringpayment();
		rp.ftrdate4();
		rp.FristOccuranceDate();
		rp.repeatUntill();
		rp.fixNumofoccurence();
		rp.Days_in_Process();
		rp.Weeks_DropDown();
		rp.descrip4();
		Thread.sleep(3000);
		rp.Next4();*/
		
		sp=new Schedul_Payments(driver);
		sp.setPayuser5();
		sp.Scheduldpayments();
		sp.StatusDropdown();
		sp.SettledData();
		System.out.println();
		
	}
	
	

}
