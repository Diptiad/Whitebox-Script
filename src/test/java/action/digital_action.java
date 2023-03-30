package action;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.globalHooks;
import webElements.webElements;

public class digital_action {
	private WebDriver driver;
	webElements element;
	WebDriverWait wait;

	public digital_action(globalHooks globalhook) {
		this.driver = globalhook.getDriver();
		element = new webElements(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
		
	






}
