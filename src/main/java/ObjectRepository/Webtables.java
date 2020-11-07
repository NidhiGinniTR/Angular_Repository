/*package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Webtables {
	WebDriver driver;
	public Webtables(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//*[@id='grdWFfolders_dom']/table/tbody/tr[2]/td[2]")
	public WebElement Workflow_Table ;
	
	@FindBy(id="grdWFfolders_row_0") public Actions elementLocator;
	
	public WebElement Workflow_Table()
	{
		return Workflow_Table;
	}
	
	/*public WebElement elementLocator()
	{
		return elementLocator;
	}*/

	

	/*public Actions doubleClick(WebElement link) {
		// TODO Auto-generated method stub
		return elementLocator;
	}
}*/


/*package ObjectRepository;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Webtables 
{
	public static void fnLogin(WebDriver driver,Properties Env)
	{
		LoginPagepf Lp=new LoginPagepf(driver);
		//Lp.getTitle.
		Lp.English().click();
		Lp.UniversalId().clear();
		Lp.UniversalId().sendKeys(Env.getProperty("UniversalId"));
		Lp.Password().sendKeys(Env.getProperty("Password"));
		Lp.Signin().click();
	
	}
	public static void fnWebEdit(String object,String Label,String Value)
	{
		@FindBy(class="DisabledMenuItem") public WebElement Entity_Name;
		
	}
}*/

