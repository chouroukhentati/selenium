package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario {
	
	public WebDriver driver;
	
	public TestScenario(String url) {
		launchBrowser(url);
//		launchHeadlessBrowser(url);
	}
	
	
	 // Launching the chrome browser
	private void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get(url);
	}

	// Launching the headless chrome browser
//	private void launchHeadlessBrowser(String url) {
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
//		driver = new ChromeDriver(options);
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 driver.manage().window().maximize();
//		driver.get(url);
//	}
	
	protected void exceptionDetected(Object caller, Object e) {
		System.out.println("\t" + e);
		System.out.println("\t" + caller.getClass() + ": test FAILED");
	}
	
	// Close the browser
	protected void closeBrowser() {
		driver.quit();
	}

	
	protected void startScenario() {
		System.out.println("==START " + this.getClass());
	}

	protected void endScenario() {
		System.out.println("==END " + this.getClass() + "\n");
	}
}