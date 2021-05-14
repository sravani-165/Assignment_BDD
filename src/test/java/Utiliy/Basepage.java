package Utiliy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Basepage {

	public static WebDriver driver;
    
	@Before
	public void webBroswer() 
	{
     driver= new ChromeDriver();
      System.out.println("Broswer is opened");
	 }
   
	//@After
    public void webBroswerclose() {
    	   driver.quit();
    	   System.out.println("Broswer is Closed");
    		}
}
