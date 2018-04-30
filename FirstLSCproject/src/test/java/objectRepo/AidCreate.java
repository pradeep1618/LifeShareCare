package objectRepo;

import org.openqa.selenium.By;

public class AidCreate {

	public static By addDo = By.xpath("//a[@class='add-more']//following::i[@class='fa fa-plus']");
	public static By firstName = By.xpath("//input[@name='first_name']");
	public static By lastName = By.xpath("//input[@name='last_name']");
	public static By ssnNumber = By.xpath("//input[@placeholder='Enter SSN']");
	public static By address = By.xpath("//input[@name='address']");
	public static By contact = By.xpath("//select[@name='phoneType']");
	public static String value = "object:6632";
	public static By contactNum = By.xpath("//input[@placeholder='Enter Phone Number']");
	public static By email = By.xpath("//input[@name='email']");
	public static By dob = By.xpath("//label[contains(.,'Date Of Birth*')]//following::input[@name='dob']");
	public static By month = By.xpath("//button[@class='btn btn-default']//following::span[contains(.,'August')]");
	public static By monthDate = By.xpath("//button[@id='datepicker-7220-571-title']");
	public static By dateDob = By.xpath("//td[@class='uib-day text-center ng-scope']//following::button[@class='btn btn-default btn-sm']//following::span[contains(.,'30')]");
	
	public static By genderMale = By.xpath("//label[@for='radio02']");
	public static By genderFemale = By.xpath("//label[@for='radio01']");
	public static By genderOther = By.xpath("//label[@for='radio03']");
	public static By selEthinicity = By.xpath("//select[@name='ethnicity']");
	public static String enthinicityvalue = "object:6565";
	
	public static By language = By.xpath("//div[@class='tags']");
	public static By religion = By.xpath("//textarea[@placeholder='Religious Affiliation']");
	public static By licenseNum = By.xpath("//input[@placeholder='Enter Driver License Number']");
	public static By emergencyContactTab = By.xpath("//a[contains(.,'EMERGENCY CONTACT INFORMATION')]");
	public static By representativeName = By.xpath("//input[@name='ecname']");
	public static By representativEmail = By.xpath("//input[@ng-model='eContact.email']");
	public static By representativSelect = By.xpath("//select[@ng-model='eContact.phoneType']");
	public static String cellValue = "object:6632";
	public static By representativNumTex =  By.xpath("//input[@ng-model='eContact.phNo']");
	public static By addBtn = By.xpath("//button[@class='greybtn']");
	public static By availabilityTab = By.xpath("//a[contains(.,'AVAILABILITY')]");
	public static By scheduleWeek =By.xpath("//label[@for='radio2']");
	
	public static By monday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'M')]");
	public static By tuesday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'T')");
	public static By wednesday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'W')]");
	public static By thursday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'T')][2]");
	public static By friday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'F')]");
	public static By saturday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'S')]");
	public static By sunday = By.xpath("//div[@class='day-tags']//following::a[contains(.,'S')][2]");
	
	
	
	
}
