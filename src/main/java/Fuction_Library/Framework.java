package Fuction_Library;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Framework {
	
	public static void fnWebEdit(WebElement element,String Text) {
		//Logger = report.startTest("IntiliaseDriver");
		
		if(element.isDisplayed()) {
			element.sendKeys(Text);
			//System.out.println(element+" is displayed and "+Text+"is entered");
			Assert.assertTrue(true);
			//Logger.log(LogStatus.PASS, element+" is displayed and "+Text+"is entered");	
			
		}
	}

}
