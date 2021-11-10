package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By login=By.xpath("//span[text()='Login']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getlogin() {
		return driver.findElement(login);
	}

}
