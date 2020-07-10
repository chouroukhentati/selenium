package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class AddTest extends TestScenario {
	public AddTest() {
		super("https://www.calculator.net/");
	}
	
	public void runTest() throws InterruptedException {
		startScenario();
		
		driver.findElement(By.xpath("//span[text()='9']")).click();
		
		driver.findElement(By.xpath("//span[text()='+']")).click();
		
		driver.findElement(By.xpath("//span[text()='9']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		String resultString = driver.findElement(By.id("sciOutPut")).getText();
		try {
			int resultInt = Integer.parseInt(resultString.trim());
			assertEquals(19, resultInt);
			System.out.println("\t" + this.getClass() + ": test SUCCEEDED");
		} catch (Exception | AssertionError e) {
			exceptionDetected(this, e);
		}
		
		closeBrowser();
		
		endScenario();
	}
}
