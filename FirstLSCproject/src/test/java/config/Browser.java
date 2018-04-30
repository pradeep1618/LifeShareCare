package config;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
 
		public static WebDriver driver;

		
		
  @BeforeClass
  public void beforeClass() 
  {
	System.setProperty("webdriver.chrome.driver", "D:\\backup\\Softwares\\Driver\\chromedriver.exe");  
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	  
  }
  
  @AfterClass
  public void quite()
  {
	  driver.quit();
  }

  

}
