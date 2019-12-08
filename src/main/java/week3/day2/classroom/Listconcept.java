package week3.day2.classroom;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Listconcept
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		    //Loading a url
		    driver.get("https://erail.in/");
		    
		    //implicit wait is used to wait till all the elements get loaded
		    
		    
		    driver.manage().window().maximize();
		    WebElement elesource = driver.findElementById("txtStationFrom");
		    elesource.clear();
		    elesource.sendKeys("MAS",Keys.TAB);
		    WebElement eledestiny = driver.findElementById("txtStationTo");
		    eledestiny.clear();
		    eledestiny.sendKeys("SBC",Keys.TAB);
		    Thread.sleep(3000);
		    driver.findElementById("chkSelectDateOnly").click();
		  List<WebElement> allTrainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		   	    
		   //count of all trains
		    System.out.println("All train names are :"+allTrainNames.size());
		  
		   //Create a set for train names
		   
		   Set<String> UniqueTrainnames=new HashSet<String>();
		  // 
		   
		   
		    List<WebElement> row = eletable.findElements(By.tagName("tr"));
		    
		   for (int i = 0; i < row.size(); i++) {
		    	List<WebElement> coldata = row.get(i).findElements(By.tagName("td"));
		    //	System.out.println(coldata.get(1).getText());
		    	
		    		    	
		    	//System.out.println(coldata.get(0).getText());

		    }*/
		    
		   
		    
	}
	
	
	
}
