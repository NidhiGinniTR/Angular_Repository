package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpf {
	WebDriver driver;
	public Searchpf(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnCancel' and @title='Clear'] | //*[@class='btn btn-mini' and @title='Clear Search Criteria']")
	public WebElement Clear;
	
	@FindBy(how = How.ID, using ="fldr_4") public WebElement Year;
	
	@FindBy(id="fldr_5") public WebElement Period;
	
	@FindBy(id="fldr_6") public WebElement TaxType;
	
	@FindBy(id="wt_name") public WebElement WF_Template;
	
	@FindBy(id="wf_14") public WebElement Entity_Name;
	
	@FindBy(id="wf_15") public WebElement Entity_Id;
	
	@FindBy(id="wf_17")	public WebElement Jurisdiction;
	
	@FindBy(id="wf_18") public WebElement Workflow_Association;
	
	@FindBy(id="fw_workflow_type") public WebElement Workflow_Type;
	
	@FindBy(id="gc_group_code_id") public WebElement Group_Codes;
	
	@FindBy(id="btnSearch") public WebElement Search;
		
	public Select Year() 
	{
		  return new Select(Year);
	}
	
	public Select Period()
	{
		return new Select(Period);
	}
	
	public Select TaxType()
	{
		return new Select(TaxType);
	}
	
	public Select WF_Template()
	{
		return new Select(WF_Template);
	}
	
	public WebElement Entity_Name()
	{
		return Entity_Name;
	}
	
	public WebElement Entity_Id()
	{
		return Entity_Id;
	}
	
	public WebElement Jurisdiction()
	{
		return Jurisdiction;
	}
	
	public Select Workflow_Association()
	{
		return new Select(Workflow_Association);
	}
	
	public Select Workflow_Type()
	{
		return new Select(Workflow_Type);
	}
	
	public Select Group_Codes()
	{
		return new Select(Group_Codes);
	}
	
	public WebElement Clear()
	{
		return Clear;
	}
	
	public WebElement Search()
	{
		return Search;
	}
	

	
	
}
