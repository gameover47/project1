package org.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	private static final TimeUnit Seconds = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\admin\\eclipse-workspace\\JavaSelenium\\driv\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver ();
	     
	     driver.get("https://www.w3schools.com/html/html_tables.asp");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3, Seconds);
	    
	     //locator for table 
	     
	     WebElement tableContent = driver.findElement(By.id("customers"));
	     
	     List<WebElement> rowsContent = tableContent.findElements(By.tagName("tr"));
	     
		

	for (int i = 0; i<rowsContent.size();i++) {
		
		WebElement row = rowsContent.get(i);{
		
		List<WebElement> tableData = row.findElements(By.tagName("td"));
		
		for (int j=0; j<tableData.size();j++) {
			
			WebElement data = tableData.get(j);
	       
			String text = data.getText();		
		System.out.println(text);
		
			
		}
			
		System.out.println();
	
	//	String text = row.getText();
	//	System.out.println(text);
		
		
	}
	}
	}
}
