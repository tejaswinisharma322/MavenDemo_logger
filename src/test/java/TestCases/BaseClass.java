package TestCases;
//BaseClass will use all reusable components
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;

public class BaseClass
{
	
	ReadConfig readconfig= new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getusername();
    public String password=readconfig.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
      logger=Logger.getLogger("mavenDemo1");
      PropertyConfigurator.configure("Log4j.properties");
     
   //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	
   		
     	if(br.equals("chrome"))
   		{
   			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
   	   		driver=new ChromeDriver();
   		}
   		else if(br.equals("firefox"))
   		{
   			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
   	   		driver=new FirefoxDriver();
   		}
	}
	
	/*@BeforeClass
	public void setup()
	{
	    //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();
    	
      logger=Logger.getLogger("mavenDemo1");
     PropertyConfigurator.configure("Log4j.properties");  			
	}
	*/
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
