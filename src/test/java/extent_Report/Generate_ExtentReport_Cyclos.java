package extent_Report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Generate_ExtentReport_Cyclos implements ITestListener

{
	public ExtentSparkReporter rp;//document name, report name, theme
	public ExtentReports er;//host name, user name, os, browser, environment
	public ExtentTest et;//pass, fail, skipped
	
	//predefined methods(Onstart, ontest success, on test skipped, on test finish, on test failure)
	
	public void onStart(ITestContext tr)
	{
		rp=new ExtentSparkReporter("C:\\Users\\USER\\Downloads\\Cyclos_TestNG share1\\Cyclos_TestNG\\report_Cyclos\\cyclos.html");
		rp.config().setDocumentTitle("Cyclos");
		rp.config().setReportName("register");
		rp.config().setTheme(Theme.STANDARD);
		
		er = new ExtentReports();
		er.attachReporter(rp);
		
		er.setSystemInfo("username","nishi");
		er.setSystemInfo("hostname","local host");
		er.setSystemInfo("os","windows10");
		er.setSystemInfo("browser","Chrome,edge,firefox");
		er.setSystemInfo("Environment","QA");
		
	}
		public void onTestSuccess(ITestResult tr) {
			et = er.createTest(tr.getName());
			et.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
			
		}
		
		public void onTestFailure(ITestResult tr) {
			et = er.createTest(tr.getName());
			et.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
			
		}
		
		public void onTestSkipped(ITestResult tr) {
			et = er.createTest(tr.getName());
			et.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREY));
			
		}
		
		public void onFinish(ITestContext context) {
			er.flush();
		}
		
		
		
	
}