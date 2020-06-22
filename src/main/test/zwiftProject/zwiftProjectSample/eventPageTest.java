package zwiftProject.zwiftProjectSample;

import java.io.IOException;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.basePage;

public class eventPageTest extends basePage{
	public WebDriver driver;

@BeforeTest
	public void intialize() throws IOException
	{
	    driver=initializeDriver();
	    driver.get(prop.getProperty("url"));
	    driver.manage().window().maximize();
	    homepage hpage=new homepage();
	    hpage.eventsNavbar(driver).click();;
	    
	}
@Test
public void validateEventsPageLoad()
{
	try {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("EventPageload Success");
	}catch(Exception e)
	    {
		System.out.println("EventPageload delayed");
	    }

}
@Test
public void validateDropdownEvents() 
	{
		eventsPage epage=new eventsPage();
		//Get All Drowdowns
		Select selectSports=new Select(epage.sportsDropdown(driver));
		Select selectIntensities=new Select(epage.intensitiesDropdown(driver));
	        Select selectStartTimes=new Select(epage.startTimesDropdown(driver));	
		//Get All Options in a Sports Drowdown
		List<WebElement> options = selectSports.getOptions();  
		for(int i=1;i<options.size(); i++) {
		 //Set each option as selected
		 selectSports.selectByVisibleText(options.get(i).getText());
		 //Get All Options in a Insenties Drowdown
		 List<WebElement> optionsI = selectIntensities.getOptions(); 
		 for (int j=1; j<optionsI.size(); j++){
			//Set each option as selected
		 selectIntensities.selectByVisibleText(optionsI.get(j).getText());
			//Get All Options in a Start Times Drowdown
		 List<WebElement> optionsS = selectStartTimes.getOptions();
		 for(int k=1;k<optionsS.size();k++) {
			//Set each option as selected 
		 selectStartTimes.selectByVisibleText(optionsS.get(k).getText());
			//Determine if a selection has events
                 boolean hasEvents=epage.firstColumnExists(driver);
                 int total=0;	
			//Calculate total number of events only if there are events
		 if(hasEvents) 
		 total = epage.getEventsCount(driver);					    	
			
	          //Print no return events based on the dropdown selection
		 else
	         System.out.println("Events in Sports Category: "+options.get(i).getText()+", Intensity: "+optionsI.get(j).getText()+", with start times of : "+optionsS.get(k).getText()+" has "+total+" events");
		 }
	       }
             }	
        }
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
