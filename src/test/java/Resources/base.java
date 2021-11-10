package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	
	public WebDriver intilizebroswer() throws IOException
	{
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\AENDTOEND\\src\\test\\java\\Resources\\data.properties");
	prop.load(fis);
	
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 
	}
		
	
	else if(browsername.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	

	
		else if(browsername.equals("internetexplorer")){
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			 driver=new EdgeDriver();
	
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;
	
	}}
	


