package commandeapartirdunedemande;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class commandedemande {
	
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
	
		  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[8]/a")).click();//tag +class
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[5]/a")).click();//tag +class
	
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@adresse=\"bonCommande/PH\"]/p")).click(); 
			
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"bntContainer\"]/div/a")).click();
			 Thread.sleep(3000);
			   Actions action = new Actions(driver);
			   WebElement el = driver.findElement(By.xpath("//input[@id='search_dataTable']"));
			   action.click(el);
			   Thread.sleep(2000);
			   el.sendKeys("PR2000000011");
			   Thread.sleep(2000);
	     
			
	         //Thread.sleep(3000);   
				//driver.findElement(By.xpath("//table[@id='liste_DemandeAchatPHtrue']//tr[1]")).click();
	            //Thread.sleep(2000);
	            //JavascriptExecutor("$('input[class=checkbox]').removeClass('checkbox')");
	            //driver.findElements(By.xpath("//table[@id='liste_DemandeAchatPHtrue']//tr[1]//td[@class=' datatablesCheckbox']")).get(0).click();
	            Thread.sleep(2000);
		
	

}

	private static void JavascriptExecutor(String string) {
		// TODO Auto-generated method stub
		
	}}
