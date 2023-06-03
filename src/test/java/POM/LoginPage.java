package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  
 public class LoginPage
  {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{      
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	
	
	}
	
	/*@FindBy(xpath=".//a[@class='_1_3w1N']")
	private WebElement hmpage_login1; */
	
	@FindBy(xpath=".//input[@class='_2IX_2- VJZDxU']")
	private WebElement usernametb;
	
    @FindBy(xpath=".//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement passwordtb;
	
	@FindBy(xpath=".//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbtn;
	
	/*public void homepageLogin1()
	{
		hmpage_login1.click();
	}
	*/
	
	public void setUserName(String usernme)
	{
		usernametb.sendKeys(usernme);
	}
	
	public void setPassword(String pass)
	{
		passwordtb.sendKeys(pass);
	}
	
	public void loginbutton()
	{ 
		loginbtn.click();
	}
	
	//trial
	
	//@FindBy(xpath= ".//a[contains(text(),'Login')])[1])")
	//private WebElement loginbtn1;
	
		
	//public void loginhomebtn()
	//{
		//loginbtn1.click();
	//}
	
	
	
}