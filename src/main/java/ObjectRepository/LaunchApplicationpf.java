package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchApplicationpf {
	
	 	WebDriver driver;
		public LaunchApplicationpf(WebDriver driver)  {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="btnApps")
		WebElement Application;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[1]")
		public WebElement Calendar;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[2]")
		public WebElement Checkpoint_Learning;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[3]")
		public WebElement Checkpoint_World;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[4]")
		public WebElement DatatFlow;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[5]")
		public WebElement Entity_Manager;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[6]")
		public WebElement FileRoom;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[7]")
		public WebElement My_Work;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[8]")
		public WebElement WorkFlow_Manager;
		
		
		public WebElement Application()
		{
			return Application;
		}
		
		public WebElement Calendar()
		{
			return Calendar;
		}
		
		public WebElement Checkpoint_Learning()
		{
			return Checkpoint_Learning;
		}
		
		public WebElement Checkpoint_World()
		{
			return Checkpoint_World;
		}
		
		public WebElement DatatFlow()
		{
			return DatatFlow;
		}
		
		public WebElement Entity_Manager()
		{
			return Entity_Manager;
		}
		
		public WebElement FileRoom()
		{
			return FileRoom;
		}
		
		public WebElement My_Work()
		{
			return My_Work;
		}
		
		
		public WebElement WorkFlow_Manager()
		{
			return WorkFlow_Manager;
		}
		

}
