package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	
	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\admin\\eclipse-workspace\\JavaSelenium\\driv\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver ();
	    //to launch the browser
	    driver.get ("https://www.facebook.com/");
	   
	    // to maximiz the window 
	  driver.manage().window().maximize();
	
	//capture ss and store img 
	    		
TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		File b = new File("E:\\PHOTOS\\c.png");
		
		FileUtils.copyFile(f, b);
		
		 driver.close();
	
	    
	    
	    
	}

}
