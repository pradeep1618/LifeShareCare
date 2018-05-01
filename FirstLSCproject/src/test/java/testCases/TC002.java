package testCases;

import org.testng.annotations.Test;

import commonFun.Login;
import config.Browser;

public class TC002 extends Browser{
	
	@Test
	public void createDoctor() throws Exception
	{
	
	test= extent.createTest(" Creating Doctor ");
	Login log = new Login();
	log.signIn("http://52.27.143.120:8000", "pradeep.kumar@smartdatainc.net", "Password@123");
	
	
	
		
				  
		  
		  
	}
	
	

}
