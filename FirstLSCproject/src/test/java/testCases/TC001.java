package testCases;

import java.awt.AWTException;
import org.testng.annotations.Test;
import commonFun.Login;
import config.Browser;


/**
 * Login to the application as Agency
 * @author pradeep.kumar
 *
 */

public class TC001 extends Browser
{
	
  @Test	
  public void Loginto() throws InterruptedException, AWTException 
  {
	 
	Login sin= new Login();
  	sin.signIn("http://52.27.143.120:8000", "pradeep.kumar@smartdatainc.net", "Password@123");
  	
  	
//  driver1.click(AgencyLogin.doctot);
}
}

