package objectRepo;

import org.openqa.selenium.By;

public class AgencyLogin 
{
	public static By emailID = By.xpath("//input[@type='email']");
	
	public static By password = By.xpath("//input[@ng-model='user.password']");
	
	public static By signIN	=By.xpath("//button[@type='submit']");
	
	public static By loginlogo = By.xpath("//div[@class='login-logo']"); 
	
	public static By next = By.xpath("//button[@id='nzTour-next']");
	
	public static By yes = By.xpath("//button[contains(.,'Next')]");
	
	public static By header = By.xpath("//div[@class='headericon-box'][1]");
	
	public static By doctot = By.xpath("//div[@class='tab-pane tab-pane-aides active']");
	
	public static By aid = By.xpath("//i[@class='fa flaticon-help-the-elderly']");  //div[@class='tab-pane tab-pane-aides active']//child::
	
	public static By helpTogg = By.xpath("//div[@id='nzTour-content']");
	
	public static By sigouts = By.xpath("//div[@class='headericon-box'][2]");
	
}
	