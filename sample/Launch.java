package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\admin\\eclipse-workspace\\JavaSelenium\\driv\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver ();
    
    driver.get ("https://www.facebook.com/");
    
    WebElement  txtUserName =  driver.findElement(By.id("email"));
  txtUserName.sendKeys("asd");
    
    WebElement txtPass= driver.findElement(By.id("pass"));
    txtPass.sendKeys("1234");
    
    WebElement login = driver.findElement(By.name("login"));
    login.click();
    System.out.println("login");
}
}