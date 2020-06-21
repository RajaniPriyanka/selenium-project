package resources;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basePage {

 public static WebDriver driver;
 public	Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		try {
		prop =new Properties();
		//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		FileInputStream fis=new FileInputStream("src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
        String browserName=prop.getProperty("browser");
        //To invoke Chrome browser
       if(browserName.equals("chrome"))
    		   {
    	 
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    		   }   else if (browserName.equals("firefox"))
    		   {
    	 
    	  WebDriverManager.firefoxdriver().setup();
    	  driver=new FirefoxDriver();
    		   }else if (browserName.equals("IE"))
    		   {
    	 
    	  WebDriverManager.iedriver().setup();
    	  driver=new InternetExplorerDriver();
    		   }
       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       return driver;
        
	}
	

	public void getScreenshot(String result) throws IOException
	{
		// Take screenshot and store as a file format
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
	   FileUtils.copyFile(Src,new File("Screenshots\\"+result+".png"));
		}
		catch (IOException e)
		{
		System.out.println(e.getMessage());
		  }
	}
}
