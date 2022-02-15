package org.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DownTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\admin\\eclipse-workspace\\JavaSelenium\\driv\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();
	     driver.get ("https://adactinhotelapp.com/index.php");
	     driver.manage().window().maximize();
	     
	     WebElement txtUser = driver.findElement(By.id("username"));
	     
	txtUser.sendKeys("rohithkumar47");   
	
	WebElement pass = driver.findElement(By.id("password"));
	
	pass.sendKeys("rohithkumar47");
	
	WebElement btnLogin = driver.findElement(By.id("login"));
	
	btnLogin.click();
	Thread.sleep(5000);
	
	WebElement dDnLoc = driver.findElement(By.id("location"));
    Select select = new Select(dDnLoc);
    select.selectByIndex(1);

     WebElement dDnHot = driver.findElement(By.id("hotels"));
     Select hote = new Select (dDnHot);
 
     hote.selectByIndex(2);

     WebElement dDnRoom = driver.findElement(By.id("room_type"));
     Select room = new Select( dDnRoom );
     room.selectByIndex(2);

     WebElement dDnNos = driver.findElement(By.id("room_nos"));
     Select nos = new Select(dDnNos);
  
   nos.selectByIndex(2);
   
   WebElement dDnAdult =  driver.findElement(By.id("adult_room"));
   Select adult = new Select (dDnAdult);
   adult.selectByIndex(2);
   
   WebElement dDnChild =  driver.findElement(By.id("child_room"));
   Select child = new Select (dDnChild);
   child.selectByIndex(2);
   
   WebElement btnSelect =   driver.findElement(By.id("Submit"));
   btnSelect.click();
   
   Thread.sleep(5000);
	
    WebElement btnClick = driver.findElement(By.id("radiobutton_0"));
    btnClick.click();
    
   WebElement btnContinue = driver.findElement(By.id("continue"));
   btnContinue.click();
   
   
   
   
    WebElement first = driver.findElement(By.id("first_name"));
    first.sendKeys("rohith");
    
    WebElement last = driver.findElement(By.id("last_name"));
    last.sendKeys("kumar");
    
    WebElement address = driver.findElement(By.id("address"));
    address.sendKeys("medavakkam");
    
    
    WebElement card = driver.findElement(By.id("cc_num"));
    card.sendKeys("6703 4444 4444 4449");
    
    WebElement type=  driver.findElement(By.id("cc_type"));
    Select type1 = new Select (type);
    type1.selectByIndex(4);
    
   WebElement month =  driver.findElement(By.id("cc_exp_month"));
   Select mm = new Select(month) ;
   mm.selectByIndex(1);
   
   WebElement year =  driver.findElement(By.id("cc_exp_year"));
   Select yy = new Select(year) ;
   yy.selectByIndex(10);
   
     
   WebElement cc =  driver.findElement(By.id("cc_cvv"));
   
  
   cc.sendKeys("123");
   
   WebElement book =  driver.findElement(By.id("book_now"));
   
   
   book.click();
   
   WebElement order  = driver.findElement(By.id("order_no"));
   
 String data = order.getText();
 System.out.println(data );
   
   

 
     
     
    
    
	}

}
