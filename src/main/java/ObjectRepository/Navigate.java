package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigate {
	
	WebDriver driver;
		public Navigate(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="MyWork") WebElement MyWork;
	
	@FindBy(id="Documents") WebElement Documents;
	
	@FindBy(id="DataCollection") WebElement DataFlow;
	
	@FindBy(id="ControlLog") WebElement ControlLog;
	
	@FindBy(id="ReportsFlow") WebElement Reports;
	
	@FindBy(id="TAXCAL_SCHEDULE_EVENTS") WebElement Calendar;
	
	@FindBy(id="TAXCAL_ENTITYTOPICBROWSER") WebElement Entity_Browser;
	
	@FindBy(id="TAXCAL_SETUP") WebElement Calendar_Setup;
	
	@FindBy(id="Setup") WebElement Setup;
	
	@FindBy(id="FolderWorkflows") WebElement Workflow_Browser;
	
	public WebElement MyWork()
	{
		return MyWork;
	}
	
	public WebElement Documents()
	{
		return Documents;
	}
	
	public WebElement DataFlow()
	{
		return DataFlow;
	}
	
	public WebElement ControlLog()
	{
		return ControlLog;
	}
	
	public WebElement Reports()
	{
		return Reports;
	}
	
	public WebElement Calendar()
	{
		return Calendar;
	}
	
	public WebElement Entity_Browser()
	{
		return Entity_Browser;
	}
	
	public WebElement Calendar_Setup()
	{
		return Calendar_Setup;
	}
	
	public WebElement Setup()
	{
		return Setup;
	}
	
	public WebElement Workflow_Browser()
	{
		return Workflow_Browser;
	}
	
	
}
