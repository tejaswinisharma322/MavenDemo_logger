//in future if any method , variable should be added it should be added in ReadConfig file 
//From Config.properties file it will take the data and from ReadConfig.java it will fetch the information therefore provide it to BaseClass.java 
//
package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	Properties prop;
	
	public ReadConfig()
	{
		//src variable which is referring to config.properties file
		File src= new File("./Configuration//config.properties");
		
		try
		{
			//src file opening in input mode
			FileInputStream f = new FileInputStream(src);
			prop= new Properties();
			//To load complete file of config.properties 
			prop.load(f);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	//To return value it will use prop.getProperty("baseURL"). by using baseURl it will get the url & return value
	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
}