package Fuction_Library;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.ClickActionspf;
import ObjectRepository.LaunchApplicationpf;
import ObjectRepository.LoginPagepf;
import ObjectRepository.Navigate;
import ObjectRepository.NewFolderCreationpf;


public class FunctionsLibrary {
	public static Properties prop;
	public static Properties Env;
	
		public static void fnLogin(WebDriver driver,Properties Env)
		{
			LoginPagepf Lp=new LoginPagepf(driver);
			Lp.English().click();
			Lp.UniversalId(Env.getProperty("UniversalId"));
			Lp.Password(Env.getProperty("Password"));
			Lp.Signin().click();
		}
		
		public static void Applicationspf(WebDriver driver, String strAppName ) 

		   {
				driver.switchTo().frame("header");
				LaunchApplicationpf rh=new LaunchApplicationpf(driver);
				rh.Application().click();
				driver.switchTo().parentFrame();
		        driver.switchTo().frame("menuPopup");
						        
		        switch (strAppName) 
		        { 
		        case "Calendar": 
		        	rh.Calendar.click();
		            break; 
		        case "Checkpoint Learning": 
		            rh.Checkpoint_Learning.click();
		            break; 
		        case "Checkpoint World": 
		            rh.Checkpoint_World.click();
		            break; 
		        case "DatatFlow":
		        	rh.DatatFlow.click();
		            break;
		        case "Entity Manager":
		        	rh.Entity_Manager.click();
		            break;
		        case "FileRoom":
		        	rh.FileRoom.clear();
		        	break;
		        case "My Work":
		        	rh.My_Work.click();
		        	break;
		        case "WorkFlow Manager":
		        	rh.WorkFlow_Manager.click();
		        	break;
		        } 
		        System.out.println(strAppName);
		   }
		
		public static void fnOWMActionsMenu(WebDriver driver,String item) throws InterruptedException
		{
		    if(driver.getTitle().equalsIgnoreCase("WorkFlow Manager"))
		    {
		        ClickActionspf actionsMenu = new ClickActionspf(driver);
		        actionsMenu.Actions().click();
		        Thread.sleep(1000);
		        driver.switchTo().frame("viewIFrame");
		        java.util.List<WebElement> menuitems = driver.findElements(By.className("MenuItem"));
		        for(int i=0;i<menuitems.size();i++)
		        {
		            //String name = webelement.getText();
		            if(item.equals(menuitems.get(i).getText()))
		            {
		                String menuitem=menuitems.get(i).getAttribute("id");
		                driver.findElement(By.id(menuitem)).click();
		                System.out.println(item+" is enabled and is selected from actions menu");
		                break;
		            }
		        }
		    }
		}
		
		public static void fnNewFolderCreation(WebDriver driver,Properties prop) throws InterruptedException
		{
			NewFolderCreationpf Nf=new NewFolderCreationpf(driver);
						
			Set<String>ids1=driver.getWindowHandles();
	        java.util.Iterator<String> it1=ids1.iterator();
	        String parentid =it1.next();
	        String childid = it1.next();
	        String childid1=it1.next();
	        driver.switchTo().window(childid1);
	        if(driver.getTitle().equals("New Folder"))
	        {
			   	Nf.Year().selectByVisibleText(prop.getProperty("Year"));
	            Nf.Period().selectByVisibleText(prop.getProperty("Period"));
	            Nf.TaxType().selectByVisibleText(prop.getProperty("TaxType"));
	            Nf.WFTemplate().selectByVisibleText(prop.getProperty("WF_Template"));
	            Nf.EntityName().sendKeys(prop.getProperty("Entity_Name"));
	            Nf.EntityId().sendKeys(prop.getProperty("Entity_Id"));
	        	Nf.Jurisdiction().sendKeys(prop.getProperty("Jurisdiction"));
	        } 
			Nf.Save().click();
		}
		
		public static void fnNavigateTab(WebDriver driver, String tab)
		{
			 Set<String>ids=driver.getWindowHandles();
		       	java.util.Iterator<String> it=ids.iterator();
		     	String parentid =it.next();
		     	String childid = it.next();
		     	driver.switchTo().window(childid);
		     	driver.manage().window().maximize();
		     	System.out.println(driver.getTitle());
		     	
			 if(driver.getTitle().equalsIgnoreCase("WorkFlow Manager"))
		        {
		            driver.switchTo().frame("bottom");//Switch to respective window
		            driver.switchTo().frame("content");
		            driver.switchTo().frame("bottomFrame");
		            WebElement cview = driver.findElement(By.id("navCurrentView"));
		            Navigate tabs = new Navigate(driver);
		            if(cview.getText().equalsIgnoreCase(tab)) 
		            {
		                System.out.println("Navigated to: "+tab);
		            }else {
		                switch(tab)
		                {
		                case "WorkFlow Browser":
		                	tabs.Workflow_Browser().click();
		                	break;
		                case "Documents":
		                    tabs.Documents().click();
		                    break;
		                case "My Work":
		                    tabs.MyWork().click();
		                    break;
		                case "Control Log":
		                    tabs.ControlLog().click();
		                    break;
		                case "Reports":
		                    tabs.Reports().click();
		                    break;
		                case "Calendar":
		                    tabs.Calendar().click();
		                    break;
		                case "Calendar Setup":
		                    tabs.Calendar_Setup().click();
		                    break;
		                case "Entity Browser":
		                    tabs.Entity_Browser().click();
		                    break;
		                case "Setup":
		                    tabs.Setup().click();
		                    break;
		                case "DataFlow":
		                    tabs.DataFlow().click();
		                    break;
		                }
		                System.out.println("Navigated to: "+tab);
		            }
		        }
		}
		
		public static void Searchpf(WebDriver driver,Properties prop) 
		{
			Set<String>ids=driver.getWindowHandles();
	       	java.util.Iterator<String> it=ids.iterator();
	     	String parentid =it.next();
	     	String childid = it.next();
	     	driver.switchTo().window(childid);
	     	//driver.manage().window().maximize();
	     	//System.out.println(driver.getTitle());
	     	
	     	driver.switchTo().frame("bottom");
	     	driver.switchTo().frame("content");
	     	driver.switchTo().frame("bottomFrame");
			
			ObjectRepository.Searchpf Sf=new ObjectRepository.Searchpf(driver);
			Sf.Clear.click();
			Sf.Year().selectByVisibleText(prop.getProperty("Year"));
			Sf.Period().selectByVisibleText(prop.getProperty("Period"));
		    Sf.TaxType().selectByVisibleText(prop.getProperty("TaxType"));
		    Sf.WF_Template().selectByVisibleText(prop.getProperty("WF_Template"));
		    Sf.Entity_Name().sendKeys(prop.getProperty("Entity_Name"));
		    Sf.Entity_Id().sendKeys(prop.getProperty("Entity_Id"));
		    Sf.Jurisdiction.sendKeys(prop.getProperty("Jurisdiction"));
		    //Sf.Workflow_Association().selectByVisibleText(prop.getProperty("Workflow_Association"));
		    Sf.Workflow_Type().selectByVisibleText(prop.getProperty("Workflow_Type"));
		   // Sf.Group_Codes().selectByVisibleText(prop.getProperty("Group_Codes"));
		    Sf.Search().click();
	      
	   }

}

		

