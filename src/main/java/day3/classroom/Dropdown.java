package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String [] args)
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\e3022373\\eclipse-workspace\\Senthil\\Drivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Dropdown.html");
	
       WebElement dropdown= driver.findElementById("dropdown1");	
       Select dd=new Select(dropdown);
              dd.selectByValue("3");
              dd.selectByIndex(1);
	}

}
