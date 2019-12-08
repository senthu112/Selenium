package day3.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String [] args)
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\e3022373\\eclipse-workspace\\Senthil\\Drivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
 driver.findElementById("username").sendKeys("DemoSalesManager");	
 driver.findElementById("password").sendKeys("crmsfa");
 driver.findElementByClassName("decorativeSubmit").click();
 driver.findElementByLinkText("CRM/SFA").click();
 driver.findElementByLinkText("Leads").click();
 driver.findElementByLinkText("Create Lead").click();

 driver.findElementById("createLeadForm_companyName").sendKeys("FIS");
 driver.findElementById("createLeadForm_firstName").sendKeys("Senthu");
 driver.findElementById("createLeadForm_lastName").sendKeys("Veni");

	}
	}

