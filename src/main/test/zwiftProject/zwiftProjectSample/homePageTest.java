package zwiftProject.zwiftProjectSample;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.basePage;

public class homePageTest extends basePage {
			homepage hpage=new homepage();
			@BeforeTest
			public void initialize() throws IOException
			{
				driver=initializeDriver();
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			}
			@Test(priority=0)
			public void validateHomePageLoad()
			{
			try {
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				System.out.println("HomePageload Success");
			}catch(Exception e)
			    {
					System.out.println("HomePageload delayed");
			    }
				
			}
			@Test(priority=1)
			public void validatePageTitle() throws IOException
			{
		      
		                String Title=hpage.pagetitle();
			         String Expected="The at Home Cycling & Running Virtual Training App";
		        if (Title.equals(Expected)) {
		                   System.out.println("Pagetitle verification Test Passed");
		        } else {
		                   System.out.println("Pagetitle verification Test Failed");
		                   hpage.getScreenshot("PageTitleVerificationFailed");
		        }
			}
			@Test(priority=2)
			public void validateCreateAccountPresent() throws IOException
			{
		        if (hpage.createAccount(driver).isDisplayed()) {
		                  System.out.println("CreateAccount webelement is present");
		        } else {
		                  System.out.println("CreateAccount webelement is not present");
		                  hpage.getScreenshot("ValidationCreateAccountFailed");
		        }
			}
			@Test(priority=3)
			public void EventsNavigationbar()
			{
			try {
			        hpage.eventsNavbar(driver).click();
			         System.out.println("Events navigation link has been clicked");
			}catch(Exception e)
			    {
				e.printStackTrace();
			    }
					
			}
			
			@AfterTest
			public void teardown()
			{
				driver.close();
			}
		
		}






