package mahtharfahs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mfahsplusestelem {
	
	public static void main(String[] args) throws InterruptedException {
		  // declaration and instantiation of object/variable
		  System.setProperty("webdriver.chrome.driver" ,"C:\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  // launch website
		  driver.navigate().to ("http://172.16.10.45/CliniSys");
		 // click on the search text box and send value
		  driver.findElement(By.id("username")).sendKeys("chourouk.clinisys");
		  driver.findElement(By.id("password")).sendKeys("123");
		   
		  // click on the search button
		  driver.findElement(By.id("submit")).click();
		  
		Thread.sleep(5000);	
	
		  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[11]/a")).click();//tag +class
		  Thread.sleep(5000);
		  ((WebElement) driver.findElements(By.xpath("//*[@class=\"tile w2 h1 subMenu\"]/a"))).click();
          Thread.sleep(3000);
          
	

         
	
	
	
	

} }
