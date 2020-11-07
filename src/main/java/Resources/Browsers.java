package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	public WebDriver driver;
	public Properties prop;
	public Properties Env;
	public WebDriver InvokeDriver() throws IOException {
		Env=new Properties();
		prop=new Properties();
		FileInputStream EnvFile = new FileInputStream("C:\\Users\\X017406\\eclipse-workspace\\Angular\\src\\main\\java\\Resources\\Environment.Properties");
		FileInputStream fis = new FileInputStream("C:\\Users\\X017406\\eclipse-workspace\\Angular\\src\\main\\java\\Resources\\DataTable.Properties");
		prop.load(fis);
		Env.load(EnvFile);
		String BrowserName=Env.getProperty("Browser");
		//String BrowserName=prop.getProperty("Browser");
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
		}
		else if(BrowserName.equals("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	        driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		return driver;
	}

}
