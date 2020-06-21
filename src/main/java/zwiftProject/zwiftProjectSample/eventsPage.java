package zwiftProject.zwiftProjectSample;

import java.awt.List;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import resources.basePage;

public class eventsPage extends basePage {
	public WebDriver driver;
	
public WebElement sportsDropdown(WebDriver driver)
{
	WebElement Sports = driver.findElement(By.xpath("//body[@id='top']//column//column[1]//div[1]//select[1]"));
	return Sports;
	
}
public WebElement intensitiesDropdown(WebDriver driver)
{
	WebElement Intensities=driver.findElement(By.xpath("//column[2]//div[1]//select[1]"));
	return Intensities;
}
public WebElement startTimesDropdown(WebDriver driver)
{
	WebElement StartTimes=driver.findElement(By.xpath("//column[3]//div[1]//select[1]"));
    return  StartTimes;
}
public boolean firstColumnExists(WebDriver driver)
{
	WebElement element= driver.findElement(By.xpath("//*[@id=\"zwift-events-app\"]/column/div"));
	String elementClass= element.getAttribute("class");

	if(elementClass != null && elementClass.contains("listing-no-results")){
	  return false;
	}else{
	  return true;
	}
}

public int getEventsCount(WebDriver driver)
{
	 return driver.findElements(By.cssSelector(".tab-listing")).size();
}

}
