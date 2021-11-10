package ACADEMY.AENDTOEND;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.base;

public class HomePage extends base {

	@Test
	public void basenavigation() throws InterruptedException,IOException {
		
		driver=intilizebroswer();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l=new LandingPage(driver);
		l.getlogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getusername().sendKeys("maheshmca.babu@gmail.com");
		Thread.sleep(3000);
		lp.getpassword().sendKeys("mahesh");
		lp.getsignin().click();
		Thread.sleep(2000);
		System.out.println("welcome");
		System.out.println("hello");
		System.out.println("wewewe");
		
		
		
	}
}
