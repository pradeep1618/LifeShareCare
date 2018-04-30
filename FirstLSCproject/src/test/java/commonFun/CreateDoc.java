package commonFun;

import config.Browser;
import customAct.ActionDriver;
import objectRepo.AgencyLogin;

public class CreateDoc extends Browser{
	
	
	
		public void createDoctor() throws Exception
		{
			ActionDriver driver1 = new ActionDriver();
//			driver1.waitUntilElementIsPresent(AgencyLogin.aid);
//			driver1.click(AgencyLogin.doctot);
//			driver1.click(AgencyLogin.aid);
			Thread.sleep(1000);
			driver1.click(AgencyLogin.aid);
			driver1.click(AgencyLogin.careplan);
			
			
		}

}
