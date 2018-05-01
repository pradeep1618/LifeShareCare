package commonFun;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import config.Browser;
import customAct.ActionDriver;
import objectRepo.AgencyLogin;
import objectRepo.HomePage;
import objectRepo.MainPage;

public class Login extends Browser

{
	/**
	 * Sign in to the application
	 * @param url
	 * @param userName
	 * @param password
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void signIn(String url, String userName, String password) throws InterruptedException, AWTException
	{
		ActionDriver driver1 = new ActionDriver();
		  driver1.launchApplication(url);//"http://52.27.143.120:8000"
		  driver1.click(HomePage.linkAgency);
		  driver1.type(AgencyLogin.emailID, userName);//"pradeep.kumar@smartdatainc.net"
		  Thread.sleep(800	);
		 /* Robot robo = new Robot();
		  robo.keyPress(KeyEvent.VK_TAB);
		  robo.keyRelease(KeyEvent.VK_TAB);*/
		  driver1.click(AgencyLogin.password);
		  driver1.type(AgencyLogin.password, password);//"Password@123"
		  driver1.click(AgencyLogin.signIN);
		  driver1.waitUntilVisibilityOfElement(MainPage.agencylogo, 15);
		  System.out.println(driver.getTitle());
		  Assert.assertEquals(driver.getTitle(), "LifeShareCare | Agency");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  if(driver.findElement(AgencyLogin.helpTogg).isDisplayed())
		  {
			  for (int i = 0; i<=4; i++)
			  {
			 driver1.waitUntilElementIsPresent(AgencyLogin.next);
			 Thread.sleep(1000);
			 driver1.click(AgencyLogin.next);	
			  }	
		  }
		  
	}
	
	public void signout() throws Exception
	{
		ActionDriver driver1 = new ActionDriver();
		driver1.waitForLoad(driver);
		Thread.sleep(800);
		driver1.click(AgencyLogin.sigouts);
	}
	

}
