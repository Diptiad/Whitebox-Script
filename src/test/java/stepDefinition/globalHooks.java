
package stepDefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class globalHooks {
	WebDriver driver;
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Script\\com.aDintelle_pro\\Drivers\\chromedriver1.exe");
		//E:\\Automation\\Script\\com.aDintelle_pro\\Drivers\\chromedriver.exe
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
	   	driver =new ChromeDriver(options);
	   	driver.manage().deleteAllCookies();
	   	driver.get("https://pro.adintelle.com/v7/login");
	   	driver.manage().window().maximize();
	   	
	   	//wrting a code to zoom out the web driver
	   	Robot robot = new Robot();
	   	for (int i = 0; i < 1; i++) {
	   	robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);}
	   	
	   	//passing the username to the app
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	driver.findElement(By.xpath("/html/body/m-auth/div[2]/div[1]/div[1]/m-login/div[3]/form/div/input")).sendKeys("Kashmirar");
	   	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement elements=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"acceptTerms\"]")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elements);
	    driver.findElement(By.xpath("/html/body/m-auth/div[2]/div[1]/div[1]/m-login/div[5]/div/button/div/span")).click();
	    
	    //passing the password to the app
		Thread.sleep(7000);
	    driver.findElement(By.xpath("/html/body/m-auth/div[2]/div[1]/div[1]/m-login/div[3]/form/div/input")).sendKeys("Kashmira@123$");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("/html/body/m-auth/div[2]/div[1]/div[1]/m-login/div[5]/div/button/div/span")).click();
	    
	    //passing the code when the override session popup comes
	    Thread.sleep(5000);
	     try { 
	    	 WebElement ele =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/m-login-warning-dialog/div/div[2]/div[2]/div/button/div/span")); 
	    	 ele.click();
	        }
			catch(NoSuchElementException exception)
			{
		 	 // exception.printStackTrace();
			}
		
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 System.out.println("reached to home page");}
	
	@After(order=1)
	public void tearDown(Scenario scenario) throws InterruptedException
	{
		TakesScreenshot takeScrshot=((TakesScreenshot)driver);
		byte[] data=takeScrshot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(data, "Image/png",scenario.getName());
		//scenario.attach(takeScrshot,"Image/png",scenario.getName() );
		if(scenario.isFailed()) {
			//take screenshot
			final byte[]scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"Image/png",scenario.getName() ) ;
		}
		
	
	//driver.quit();
	Thread.sleep(2000);
	}

	public WebDriver getDriver()
	{
		return driver;
	}
}

