package pkg_OWM.Workflow_Browser.Dyanamic_Serial_Workflow;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Fuction_Library.FunctionsLibrary;
import Resources.Browsers;

public class Dynamic_Serial_Actions extends Browsers {
	public static ExtentTest test;
	public static ExtentReports report;
	
	@BeforeClass
	public static void startTest()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		report = new ExtentReports(path);
		report.config().documentTitle("Test Result");
		report.config().reportName("Web Automation Result");
		report.addSystemInfo("Tester", "Nidhi");
	}
	
	@Test
	public void IntiliaseDriver() throws IOException 
	{
		test = report.startTest("IntiliaseDriver");
		driver = InvokeDriver();
		driver.get(Env.getProperty("URL"));
		if(driver.getCurrentUrl().equals("https://sat2.onesourcelogin.com/"))
		{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Navigated to different window");
		}
	}
	@Test(dependsOnMethods = {"IntiliaseDriver"})
	public void LoginPageNavigation() throws InterruptedException 
	{
		FunctionsLibrary.fnLogin(driver,Env);
	}
	@Test(dependsOnMethods = {"LoginPageNavigation"})
	public void ClickApplications() 
	{
		FunctionsLibrary.Applicationspf(driver, "WorkFlow Manager");
	}
	@Test(dependsOnMethods = {"ClickApplications"})
	public void NavigatetoTabs() 
	{
		FunctionsLibrary.fnNavigateTab(driver, "WorkFlow Browser");
	}
	@Test(dependsOnMethods = {"NavigatetoTabs"})
	public void NewFolderCreation() throws InterruptedException 
	{
		Thread.sleep(1000);
		FunctionsLibrary.fnOWMActionsMenu(driver,"New Folder");
		FunctionsLibrary.fnNewFolderCreation(driver,prop);
	}
	@Test(dependsOnMethods = {"NewFolderCreation"})
	public void searchWorkflow() 
	{
			FunctionsLibrary.Searchpf(driver,prop);   	
	}
	@Test(dependsOnMethods = {"searchWorkflow"})
	public void WebTable() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.switchTo().frame("viewIFrame");
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='grdWFfolders_dom']/table/tbody/tr"));
		System.out.println("no  of rows are "+rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//div[@id='grdWFfolders_dom']/table/tbody/tr[2]/td"));
		System.out.println("no  of columns are "+columns.size());
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//*[@id='grdWFfolders_dom']/table/tbody/tr[3]/td"))).click().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id='grdWFfolders_dom']/table/tbody/tr[3]/td"))).doubleClick().build().perform();
		report.endTest(test);
		
	}
	
	@AfterTest
	public void logOff() 
	{
		report.flush();
		report.close();
	}
	
}	
	
	

