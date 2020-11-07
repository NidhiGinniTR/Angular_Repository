package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewFolderCreationpf {

	WebDriver driver;
	public NewFolderCreationpf(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="spActions")	WebElement Actions;
	
	public WebElement Actions()
	{
		return Actions;
	}
	
	@FindBy(id="ctlval_fldr_4") WebElement Year;

	public Select Year() {
	  return new Select(Year);
	}
	
	@FindBy(id="ctlval_fldr_5") WebElement Period;

	public Select Period() {
	  return new Select(Period);
	}
	
	@FindBy(id="ctlval_fw_workflow_template_id") WebElement W_F_Template;

	public Select WFTemplate() {
	  return new Select(W_F_Template);
	}
	
	
	@FindBy(id="ctlval_fldr_6") WebElement TaxType;

	public Select TaxType() {
	  return new Select(TaxType);
	}
		
	@FindBy(id="ctlval_fw_workflow_name") WebElement Workflow_Description;

	public WebElement WorkflowDescription() {
	  return Workflow_Description;
	}
	
	@FindBy(name="ctlval_wf_14") WebElement EntityName;

	public WebElement EntityName() {
	  return EntityName;
	}
	
	@FindBy(name="ctlval_wf_15") WebElement EntityId;

	public WebElement EntityId() {
	  return EntityId;
	}
	
	@FindBy(name="ctlval_wf_17") WebElement Jurisdiction;

	public WebElement Jurisdiction() {
	  return Jurisdiction;
	}
	
	@FindBy(name="ctlval_fw_due_date") WebElement DueDate;

	public WebElement DueDate() {
	  return DueDate;
	}
	
	@FindBy(id="btnOK") WebElement Save;

	public WebElement Save() {
	  return Save;
	}
	
	
}
