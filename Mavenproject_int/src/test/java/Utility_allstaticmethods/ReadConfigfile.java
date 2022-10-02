package Utility_allstaticmethods;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

// all configfile values methods maintain here

public class ReadConfigfile {
	Properties pro;
//create file object and load properties file 
	public ReadConfigfile() {
		
		File sourcefile = new File("./Configfile.properties");
		try {
			FileInputStream fis = new FileInputStream(sourcefile);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}	}
//define methods for every config property value

	public String getbrowser() {
		String Decidebrowser=pro.getProperty("browser");
		return Decidebrowser;	}
	
	public String geturl() {
		String url=pro.getProperty("baseurl");
		return url;	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;	}
	
	public String getChromePath()	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
		
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}	
	public String val1() {
		String val1=pro.getProperty("val1");
		return val1;	}
	
	public String val2() {
		String val2=pro.getProperty("val2");
		return val2;	}
	
	public String val3() {
		String val3=pro.getProperty("val3");
		return val3;	}
		
}
