package zwiftProject.zwiftProjectSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.basePage;

public class homepage extends basePage {


public WebElement eventsNavbar(WebDriver driver) {
	WebElement eventElement =  driver.findElement(By.xpath("//div[contains(@class,'znv-d-none znv-d-lg-flex')]//a[contains(@class,'znv-d-inline-block')][contains(text(),'Events')]"));
	return eventElement;
}

public WebElement createAccount(WebDriver driver) {
	WebElement accountElement =  driver.findElement(By.cssSelector("#znv-header-register-button"));
	return accountElement;
}

public String pagetitle()
{
	return driver.getTitle();
}
}
