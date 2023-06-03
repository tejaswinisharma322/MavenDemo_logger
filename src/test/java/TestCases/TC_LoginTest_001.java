package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import POM.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{
  @Test
  public void LoginTest() throws InterruptedException    
  {
	   driver.get(baseURL);
	   Thread.sleep(5000);
	   logger.info("URL is Entered");
        driver.manage().window().maximize();
        
      LoginPage lp=new LoginPage(driver);
      //lp.homepageLogin1();
      //Thread.sleep(5000);
     // logger.info("Homepage Login button is clicked");
      
      lp.setUserName(username);
	  logger.info("Username is Entered");
	  Thread.sleep(6000);
	  
	  lp.setPassword(password);
	  logger.info("Password is Entered");
	  //Thread.sleep(5000); 
	 
	  lp.loginbutton();
	  logger.info("login button is clicked");	
	  Thread.sleep(20000);
	  
	  if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
	  {
		Assert.assertTrue(true);  
		logger.info("Homepage is displayed");
	  }
	  
	  else
	  {
		  Assert.assertTrue(false);
		  logger.info("Homepage is not displayed");
	  }
	  
	  Thread.sleep(5000);
  }
  
}