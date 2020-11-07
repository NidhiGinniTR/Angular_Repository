package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClickActionspf {
	
	WebDriver driver;
	public ClickActionspf(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="spActions")
	WebElement Actions;
	
	@FindBy(id="mnuWFfolders_0")
	WebElement New_Folder;
	
	@FindBy(id="mnuWFfolders_1")
	WebElement New_RuleBased_Workflow;
	
	@FindBy(id="mnuWFfolders_2")
	WebElement Roll_Forward_Workflow;
	
	@FindBy(id="mnuWFfolders_5")
	WebElement Control_Sheet;
	
	@FindBy(id="mnuWFfolders_7")
	WebElement New_Workflow;
	
	@FindBy(id="mnuWFfolders_8")
	WebElement Workflow_Properties;
	
	@FindBy(id="mnuWFfolders_9")
	WebElement Delete_Workflows;
	
	@FindBy(id="mnuWFfolders_10")
	WebElement Workflow_History;
	
	@FindBy(id="mnuWFfolders_13")
	WebElement Assignements;
	
	@FindBy(id="mnuWFfolders_18")
	WebElement Reset_All_Checklists;
	
	@FindBy(id="mnuWFfolders_20")
	WebElement Import;
	
	@FindBy(id="mnuWFfolders_24")
	WebElement Export;
	
	@FindBy(id="mnuWFfolders_26")
	WebElement Customize_View;
	
	@FindBy(id="mnuWFfolders_27")
	WebElement Save_Preferences;
	
	@FindBy(id="mnuWFfolders_28")
	WebElement Save_Preferences_For_All;
	
	public WebElement Actions()
	{
		return Actions;
	}
	
	public WebElement New_Folder()
	{
		return New_Folder;
	}
	
	public WebElement New_RuleBased_Workflow()
	{
		return New_RuleBased_Workflow;
	}
	
	public WebElement Roll_Forward_Workflow()
	{
		return Roll_Forward_Workflow;
	}
	
	public WebElement Control_Sheet()
	{
		return Control_Sheet;
	}
	
	public WebElement New_Workflow()
	{
		return New_Workflow;
	}
	
	public WebElement Workflow_Properties()
	{
		return Workflow_Properties;
	}
	
	public WebElement Delete_Workflows()
	{
		return Delete_Workflows;
	}
	
	public WebElement Workflow_History()
	{
		return Workflow_History;
	}
	
	public WebElement Assignements()
	{
		return Assignements;
	}
	
	public WebElement Reset_All_Checklists()
	{
		return Reset_All_Checklists;
	}
	
	public WebElement Import()
	{
		return Import;
	}
	
	public WebElement Export()
	{
		return Export;
	}
	
	public WebElement Customize_View()
	{
		return Customize_View;
	}
	
	public WebElement Save_Preferences()
	{
		return Save_Preferences;
	}
	
	public WebElement Save_Preferences_For_All()
	{
		return Save_Preferences_For_All;
	}
	
	
}
