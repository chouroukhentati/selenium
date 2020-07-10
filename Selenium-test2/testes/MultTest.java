package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class MultTest extends TestScenario {

	public MultTest() {
		super("http://172.16.10.45/CliniSys");
	}

	public void runTest() throws InterruptedException {
		startScenario();
		
		private static WebElement tva_ar1;
		private static double prix_unitaire1_Double;
		private static double expectedprixavectaxe1;
		@SuppressWarnings("deprecation")
/*		public static void main(String[] args) throws InterruptedException {
		  // declaration and instantiation of object/variable
		  System.setProperty("webdriver.chrome.driver" ,"C:\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		  
		  // launch website
		 // driver.navigate().to ("http://172.16.10.45/CliniSys");
		 // click on the search text box and send value
		  driver.findElement(By.id("username")).sendKeys("a");
		  driver.findElement(By.id("password")).sendKeys("a");
		  
		  // click on the search button
		  driver.findElement(By.id("submit")).click();
		  
		Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[8]/a")).click();//avec x path
		
		  
		 Thread.sleep(5000); // lorsque ona un nv interface il faut un temp d'attante
		  
		 driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[1]/a")).click();//tag +class
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class=\"sous-menus\"]/li[1]/p")).click(); 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//*[@id=\"bntContainer\"]/div/a")).click(); 
		 driver.findElement(By.id("delaiPHtrue")).sendKeys("10"); 
		 Thread.sleep(5000);
		
		   driver.findElements(By.xpath("//div[@id='input_servicePHtrue1']//span[@class='select-arrow']")).get(0).click();
	       Thread.sleep(5000);
	     driver.findElements(By.xpath("//table[@id='tableSelect_servicePHtrue']//tr[@numero='0']")).get(0).click();
		 
	     Thread.sleep(5000);
		 

		 
		 
		 driver.findElements(By.xpath("//div[contains(@id,'input_liste_articlePHtrue-select')][contains(@id,'-0-11')][@class='select-choice']//span[@class='select-chosen']")).get(0).click(); 
		 Thread.sleep(5000);
	   driver.findElements(By.xpath("//table[contains(@id,'tableSelect_liste_articlePHtrue-select')][contains(@id,'-0-1')]//tr[@numero='10']")).get(0).click();
	   Thread.sleep(5000);

	   Actions action = new Actions(driver);
	   WebElement qte1 = driver.findElements(By.xpath("//table[@id='liste_articlePHtrue']//td[@class=' contenteditable text-right LTR']")).get(0);
	   action.click(qte1).perform();
	   Thread.sleep(5000);
	   qte1.clear();
	   qte1.sendKeys("100");
	   
	   qte1.sendKeys(Keys.RETURN);
	   Thread.sleep(5000);
	  
	  
	   driver.findElements(By.xpath("//table[contains(@id,'tableSelect_liste_articlePHtrue-select')][contains(@id,'-1-1')]//tr[@numero='2']")).get(0).click();
	   Thread.sleep(5000);
	   
	 
	   
	   Actions action2 = new Actions(driver);
	   WebElement qte2 = driver.findElements(By.xpath("//table[@id='liste_articlePHtrue']//td[@class=' contenteditable text-right LTR']")).get(1);
	   action2.doubleClick(qte2).perform();
	   Thread.sleep(2000);
	   qte2.clear();
	   qte2.sendKeys("40");
	   Thread.sleep(2000);
	   //     suprimer ligne 
	    Thread.sleep(5000);
	   driver.findElements(By.xpath("//table[@id='liste_articlePHtrue']//tr[contains(@class,'odd')]")).get(0).click();
	   Thread.sleep(5000);
	   driver.findElements(By.xpath("//button[contains(@class,'deleteRowDatatables')][@type='button']//i[@class='far fa-trash-alt fa-lg ']")).get(0).click();

	   WebElement prix = driver.findElements(By.xpath("//table[@id='calcultotalPHtrue']//td[3]")).get(0);
	   Thread.sleep(3000);

	   WebElement prix_uni = driver.findElements(By.xpath("//table[@id='liste_articlePHtrue']//td[15]")).get(0);
	   Thread.sleep(3000);

	   tva_ar1  = driver.findElements(By.xpath("//table[@id='liste_articlePHtrue']//td[16]")).get(0);
	   Thread.sleep(3000);
	 ///prix unitaire  article 1 
	   String prix_unitaire1 = prix_uni.getText().replaceAll("[^0123456789.]", "");
	   prix_unitaire1_Double = Double.parseDouble(prix_unitaire1);
	   float quantité2 = Float.parseFloat(qte2.getText().trim());
	   // double prix1 hors taxe 
	   String str_prix= prix.getText().replaceAll("[^0123456789.]", "");
	   double prix_Double = Double.parseDouble(str_prix);
	  float tva_ar11 =  Float.parseFloat( tva_ar1.getText().trim());
	 
	   
	   
	   System.out.println("str: " + str_prix);
	   
	   System.out.println("tva_ar11: " + tva_ar11);
	   System.out.println(" prix_unitaire1: " + prix_unitaire1);
	   System.out.println("quantité2: " +quantité2);
	   
	   System.out.println("prix_Double: " +prix_Double);
	   
	 
	   expectedprixavectaxe1 = (prix_unitaire1_Double * quantité2) + ((prix_unitaire1_Double *tva_ar11* quantité2*2  ) / 100);
	   
	   System.out.println("expectedprixavectaxe1: " + expectedprixavectaxe1);
	   
	   Assert.assertEquals( "le prix avec taxe est correct",prix_Double, expectedprixavectaxe1,0.000);
	   Thread.sleep(3000);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  //Bouton Valider
	   driver.findElements(By.xpath("//a[@id='btnValiderDemandeAchatPHtrue']")).get(0).click(); 
	   Thread.sleep(3000);

	  
	  
		  
	}

	private static By adresse(String string) {
		// TODO Auto-generated method stub
		return null;
	}}

		
		String resultString = driver.findElement(By.id("sciOutPut")).getText();
		try {
			int resultInt = Integer.parseInt(resultString.trim());
			assertEquals(81, resultInt);
			System.out.println("\t" + this.getClass() + ": test SUCCEEDED");
		} catch (Exception | AssertionError e) {
			exceptionDetected(this, e);
		}
		
		closeBrowser();
		endScenario();
	}
	
}
