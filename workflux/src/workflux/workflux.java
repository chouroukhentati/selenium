package workflux;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workflux {
	public static void main(String[] args) throws InterruptedException {
		
		
	
		  // declaration and instantiation of object/variable
		  System.setProperty("webdriver.chrome.driver" ,"C:\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		  // launch website
		  driver.navigate().to ("http://172.16.10.45/CliniSys");
		 // click on the search text box and send value
		  driver.findElement(By.id("username")).sendKeys("chourouk.clinisys");
		  driver.findElement(By.id("password")).sendKeys("123");
		  
		  // click on the search button
		  driver.findElement(By.id("submit")).click();
		  
		Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[8]/a")).click();//avec x path
		
		  
		 Thread.sleep(5000); // lorsque ona un nv interface il faut un temp d'attante
		  
		 driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[1]/a")).click();//tag +class
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class=\"sous-menus\"]/li[1]/p")).click(); 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='search_dataTable']")).sendKeys("PR2000000027");
         Thread.sleep(2000);
         driver.findElements(By.xpath("//table[@id='demandeAchatTablePHtrue']")).get(0).click();
         Thread.sleep(3000);
         driver.findElements(By.xpath("//div[@id='bntContainer']//a[contains(@class,'buttons-selected btn btn-default btn-edition btn-validate demandeAchatTablePHtrue')]")).get(0).click();
         Thread.sleep(4000);
         driver.findElements(By.xpath("//button[@id='1']")).get(0).click();
         Thread.sleep(3000);
         WebElement el = driver.findElements(By.xpath("//input[@id='radioacceptPHtrue']")).get(0);
         js.executeScript("$('input[id=radioacceptPHtrue]').removeClass()", el);
         Thread.sleep(3000);
         el.click();
         js.executeScript("$('input[id=radioacceptPHtrue]').addClass('radiobox')");
         Thread.sleep(2000);
         driver.findElements(By.xpath("//a[@id='btnValiderDemandeAchatPHtrue']")).get(0).click();
         Thread.sleep(3000);
         
       
         
         
         
         
         driver.findElements(By.xpath("//table[@id='demandeAchatTablePHtrue']")).get(0).click();
         Thread.sleep(3000);
         driver.findElements(By.xpath("//div[@id='bntContainer']//a[contains(@class,'buttons-selected btn btn-default btn-edition btn-validate demandeAchatTablePHtrue')]")).get(0).click();
         Thread.sleep(4000);
         driver.findElements(By.xpath("//button[@id='2']")).get(0).click();
         Thread.sleep(3000);
         WebElement els = driver.findElements(By.xpath("//input[@id='radiorefusPHtrue']")).get(0);
         js.executeScript("$('input[id=radiorefusPHtrue]').removeClass()", els);
         Thread.sleep(3000);
         els.click();
         js.executeScript("$('input[id=radiorefusPHtrue]').addClass('radiobox')");
         Thread.sleep(2000);
         driver.findElements(By.xpath("//a[@id='btnValiderDemandeAchatPHtrue']")).get(0).click();
         Thread.sleep(3000);


}}
