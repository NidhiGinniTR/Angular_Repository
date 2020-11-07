package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPagepf {

   WebDriver driver;

	public LoginPagepf(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="en") WebElement English;
	
	@FindBy(id="_txtLogin") WebElement UniversalId;
	
	@FindBy(id="_txtPassword") WebElement Password;
	
	@FindBy(id="btnSignIn") WebElement Signin;
	
	public WebElement English()
	{
		return English;
	}
	
	public void UniversalId(String temp)
	{
		UniversalId.clear();
		Fuction_Library.Framework.fnWebEdit(UniversalId,temp);
	}
	

	public void Password(String temp)
	{
		Fuction_Library.Framework.fnWebEdit(Password,temp);
	}
	
	public WebElement Signin()
	{
		return Signin;
	}
	/*public void fnWebEdit(WebElement element,String Text) {
		if(element.isDisplayed()) {
			element.sendKeys(Text);
			System.out.println(element+" is displayed and "+Text+"is entered");
			Assert.assertTrue(true);
			
		}
	}*/
	
	}
	
 
