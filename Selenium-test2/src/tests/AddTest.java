package tests;

import org.openqa.selenium.By;

public class AddTest extends TestScenario {
	public AddTest() {
		super("http://172.16.10.45/CliniSys");
	}
	
	public void runTest() throws InterruptedException {
		startScenario();
			
	/*
	 * public static void main(String[] args) throws InterruptedException { //
	 * declaration and instantiation of object/variable
	 * System.setProperty("webdriver.chrome.driver" ,"C:\\chromedriver.exe");
	 * WebDriver driver= new ChromeDriver();*/
	 
		
		try {
				  
				  // launch website
				  //driver.navigate().to ("http://172.16.10.45/CliniSys");
				 // click on the search text box and send value
				  driver.findElement(By.id("username")).sendKeys("a");
				  driver.findElement(By.id("password")).sendKeys("a");
				  
				  // click on the search button
				  driver.findElement(By.id("submit")).click();
				  
				Thread.sleep(5000);
				
				  
				  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[8]/a")).click();//avec x path
				
				  
				  driver.findElement(By.xpath("//*[@id=\"listModules\"]/ul/li[5]/a")).click();//tag +class
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@adresse=\"bonCommande/PH\"]/p")).click(); 
					
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@id=\"bntContainer\"]/div/a")).click(); 


						 
					       Thread.sleep(5000);	
				
					       //lister DA
				         
					       Integer nombreFinal = driver.findElement(By.xpath("//table[@id='liste_DemandeAchatPHtrue']")).findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size();
					      
							driver.findElement(By.xpath("//table[@id='liste_DemandeAchatPHtrue']//tr[" + (nombreFinal-3) + "]")).click();
				            Thread.sleep(2000);
				            JavascriptExecutor("$('input[class=checkbox]').removeClass('checkbox')");
				            driver.findElements(By.xpath("//table[@id='liste_DemandeAchatPHtrue']//tr[" + (nombreFinal-3) + "]//td[@class=' datatablesCheckbox']")).get(0).click();
				            Thread.sleep(2000);
				//qte gratuite
				           // Actions action = new Actions(driver);
				           // WebElement qte1 = driver.findElements(By.xpath("//table[@id='liste_detailBonCommandePHtrue']//td[@class='contenteditable quantite text-right LTR']")).get(0);
				            //action.click(qte1).perform();
				           // Thread.sleep(5000);
				            //qte1.clear();
				           // qte1.sendKeys("100");	
				
				            //Bouton Valider
				           
				            driver.findElements(By.xpath("//a[@id='btnValiderBonCommandePHtrue']")).get(0).click();
				        
				            Thread.sleep(3000);
				            driver.findElements(By.xpath("//a[@id='btnValiderPHtrue']")).get(0).click();
				            Thread.sleep(3000);
//				            driver.findElement(By.xpath("//input[@id='search_dataTable']")).sendKeys("PO20000060");
//				            Thread.sleep(2000);
//				            /*click*/
//				            driver.findElements(By.xpath("//table[@id='bonCommandeTablePHtrue']//tr[@role='row']//td")).get(2).click();
//				            Thread.sleep(3000);
//				            //Bouton Consult
//				            driver.findElements(By.xpath("//div[@id='bntContainer']//a[contains(@class,'btn-consult')]")).get(0).click();
//				            Thread.sleep(4000);
				
				
				
		} catch (Exception e) {
			exceptionDetected(this, e);
		}


				    		
				    		/*String resultString = driver.findElement(By.id("sciOutPut")).getText();
				    		try {
				    			int resultInt = Integer.parseInt(resultString.trim());
				    			assertEquals(19, resultInt);
				    			System.out.println("\t" + this.getClass() + ": test SUCCEEDED");
				    		} catch (Exception | AssertionError e) {
				    			exceptionDetected(this, e);
				    		}*/
				    		
				    		closeBrowser();
				    		
				    		endScenario();
				
				
				
				

		}

	private static void JavascriptExecutor(String string) {
		// TODO Auto-generated method stub
		
	}



}

