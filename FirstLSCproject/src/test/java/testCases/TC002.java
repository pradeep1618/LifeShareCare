package testCases;

import org.testng.annotations.Test;

import commonFun.CreateDoc;
import commonFun.Login;
import config.Browser;

public class TC002 extends Browser{
	
	@Test
	public void createDoctor() throws Exception
	{
	
//	test= extent.startTest("Creating Doctor");
	Login log = new Login();
	log.signIn("http://52.27.143.120:8000", "pradeep.kumar@smartdatainc.net", "Password@123");
	CreateDoc doc = new CreateDoc();
	doc.createDoctor();
	
	
	
	
		
				  
		  
		  
	}
	
	

}
