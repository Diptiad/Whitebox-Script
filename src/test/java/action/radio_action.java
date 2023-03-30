package action;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinition.globalHooks;
import webElements.radio_webElement;

public class radio_action {
	private WebDriver driver;
	radio_webElement element;
	WebDriverWait wait;

	public radio_action(globalHooks globalhook) {
		this.driver = globalhook.getDriver();
		element = new radio_webElement(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	public void radioApp(String string) throws InterruptedException {
		Thread.sleep(1000);
		element.operation.click();
		Thread.sleep(1000);
		element.searchboxradio.sendKeys(string);
		Thread.sleep(2000);
		element.radioOption.click();
		Thread.sleep(10000);
	}
	public void radiooperationmenu() throws InterruptedException {
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioestimate.click();
		Thread.sleep(1000);	
	}
	public void radioclientBrandSelection(String client1, String brand1) throws InterruptedException 
	{
		Thread.sleep(5000);
		element.radioclientNameSelection.click();
		Thread.sleep(1000);
		element.radioclientNameInputbox.click();
		element.radioclientNameInputbox.sendKeys("ABC");
		Thread.sleep(4000);
		element.radioclientNameselect.click();
		Thread.sleep(4000);
		// brand selection
		element.radiobrandselect.click();
		Thread.sleep(4000);
		element.radiobrandNameInputbox.sendKeys("ABC Brand");
		Thread.sleep(4000);
		element.radiobrandnameselect.click();
		Thread.sleep(4000);
		element.radiocheckcamp.click();
		Thread.sleep(3000);
		element.radioproceedcamp.click();
	}
	public void radioestimateOutputDownload() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioexportButton);
	}
	public void radioFileDownload() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String parenHandle = driver.getWindowHandle();
		js.executeScript("arguments[0].click();", element.radioexportEstButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportEstOkButton);   
	    Thread.sleep(4000);
		driver.switchTo().window(parenHandle);
		driver.switchTo().frame("appIframe");
		Thread.sleep(4000);   	
		js.executeScript("arguments[0].click();", element.radioexportButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportAppEstButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportAppEstOkButton);
		Thread.sleep(4000);
		driver.switchTo().window(parenHandle);
		driver.switchTo().frame("appIframe");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", element.radioexportButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportSuppEstButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportSuppEstOkButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportSuppEstpropButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportSuppEstcancelButton);
		Thread.sleep(4000);
		driver.switchTo().window(parenHandle);
		driver.switchTo().frame("appIframe");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", element.radioexportButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioestexcelexport);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioestnewPDFButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioestnewExcelButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element.radioexportcloseButton);
		Thread.sleep(2000);
	    driver.switchTo().window(parenHandle);
		driver.switchTo().frame("appIframe");
	    Thread.sleep(1000);
	    Set<String> handels = driver.getWindowHandles();	
		int count=handels.size();
		for(String child : handels) 
		{
			if(!parenHandle.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);
				Thread.sleep(1000);	
				driver.close();				
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parenHandle);
		driver.switchTo().frame("appIframe");
	    Thread.sleep(2000);
	}

	public void radioSchedulemenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioSchdule.click();
		Thread.sleep(1000);	
	}
	public void radioReleaseOrdermenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioRO.click();
		Thread.sleep(1000);	
		element.radioROcheck.click();
		Thread.sleep(1000);		
	}	
	public void radioFileRODownload() throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioROformat);
		String parenHandleR = driver.getWindowHandle();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioexportroexcel);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleR);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		element.radioROcheck.click();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioROformat);
		Thread.sleep(2000);		
		js.executeScript("arguments[0].click();", element.radioexportropdf);
		Thread.sleep(2000);	
		Set<String> handel5 = driver.getWindowHandles();	
		int count5=handel5.size();
		System.out.println("total window - "+count5);
		for(String child5 : handel5) 
		{
			if(!parenHandleR.equalsIgnoreCase(child5)) 
			{
				driver.switchTo().window(child5);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleR);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}
		
	public void radioREmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioRE.click();
		Thread.sleep(1000);	
		element.radioREcheck.click();
		Thread.sleep(1000);		
	}	
	public void radioFileREDownload() throws InterruptedException
	{		
		String parenHandleRE = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioREformat);
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioexportreexcel);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleRE);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		element.radioREcheck.click();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioREformat);
		Thread.sleep(2000);		
		js.executeScript("arguments[0].click();", element.radioexportrepdf);
		Thread.sleep(2000);	
		Set<String> handelRE = driver.getWindowHandles();	
		int countRE=handelRE.size();
		System.out.println("total window - "+countRE);
		for(String childRE : handelRE) 
		{
			if(!parenHandleRE.equalsIgnoreCase(childRE)) 
			{
				driver.switchTo().window(childRE);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleRE);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}
	public void radioCancellationmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioCancellation.click();
		Thread.sleep(1000);	
		element.radioCancellationcheck.click();
		Thread.sleep(1000);		
	}	
	public void radioFileCancellationDownload() throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioCancellationformat);
		String parenHandleRC = driver.getWindowHandle();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioexportCancellationexcel);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleRC);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		element.radioCancellationcheck.click();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioCancellationformat);
		Thread.sleep(2000);		
		js.executeScript("arguments[0].click();", element.radioexportCancellationpdf);
		Thread.sleep(2000);	
		Set<String> handel5 = driver.getWindowHandles();	
		int count5=handel5.size();
		System.out.println("total window - "+count5);
		for(String child5 : handel5) 
		{
			if(!parenHandleRC.equalsIgnoreCase(child5)) 
			{
				driver.switchTo().window(child5);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleRC);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}
	public void radioMakeGoodmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioMakeGood.click();
		Thread.sleep(1000);	
		element.radioMakeGoodcheck.click();
		Thread.sleep(1000);		
	}	
	public void radioFileMakeGoodDownload() throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioMakeGoodformat);
		String parenHandleRM = driver.getWindowHandle();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioexportMakeGoodexcel);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleRM);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		element.radioMakeGoodcheck.click();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioMakeGoodformat);
		Thread.sleep(2000);		
		js.executeScript("arguments[0].click();", element.radioexportMakeGoodpdf);
		Thread.sleep(2000);	
		Set<String> handel5 = driver.getWindowHandles();	
		int count5=handel5.size();
		for(String child5 : handel5) 
		{
			if(!parenHandleRM.equalsIgnoreCase(child5)) 
			{
				driver.switchTo().window(child5);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleRM);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}
	public void radioWithHoldmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioWithHold.click();
		Thread.sleep(1000);	
		element.radioWithHoldcheck.click();
		Thread.sleep(1000);		
	}	
	public void radioFileWithHoldDownload() throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioWithHoldformat);
		String parenHandleRH = driver.getWindowHandle();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioexportWithHoldexcel);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleRH);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		element.radioWithHoldcheck.click();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioWithHoldformat);
		Thread.sleep(2000);		
		js.executeScript("arguments[0].click();", element.radioexportWithHoldpdf);
		Thread.sleep(2000);	
		Set<String> handel5 = driver.getWindowHandles();	
		int count5=handel5.size();
		System.out.println("total window - "+count5);
		for(String child5 : handel5) 
		{
			if(!parenHandleRH.equalsIgnoreCase(child5)) 
			{
				driver.switchTo().window(child5);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleRH);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}
	public void radioMissedmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioMissed.click();
		Thread.sleep(1000);	
		element.radioMissedcheck.click();
		Thread.sleep(1000);		
	}	
	public void radioFileMissedDownload() throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioMissedformat);
		String parenHandleRM = driver.getWindowHandle();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioexportMissedexcel);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleRM);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		element.radioMissedcheck.click();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioMissedformat);
		Thread.sleep(2000);		
		js.executeScript("arguments[0].click();", element.radioexportMissedpdf);
		Thread.sleep(2000);	
		Set<String> handel5 = driver.getWindowHandles();	
		int count5=handel5.size();
		System.out.println("total window - "+count5);
		for(String child5 : handel5) 
		{
			if(!parenHandleRM.equalsIgnoreCase(child5)) 
			{
				driver.switchTo().window(child5);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleRM);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}
	public void radioRobulkmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiooperation.click();
		Thread.sleep(1000);		
		element.radioRobulkmenu.click();
		Thread.sleep(1000);		
	}	
	public void radioPrintRobulk(String From,String To) throws InterruptedException
	{
		String parenHandleR = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click();", element.radioRofromdate);
		js.executeScript("arguments[0]. value='1/3/2023';", element.radioRofromdate);
		//element.radioRofromdate.sendKeys(From);	
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", element.radioRotodate);
		js.executeScript("arguments[0]. value='31/3/2023';", element.radioRotodate);
//		element.radioRofromdate.sendKeys(To);	
		Thread.sleep(3000);	
		element.radioRogo.click();
		Thread.sleep(3000);	
		element.radioRobulkcheck.click();
		Thread.sleep(3000);	
		element.radioRobulkprint.click();
		Thread.sleep(3000);	
		element.radioRobulkpdf.click();
		driver.switchTo().window(parenHandleR);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}

	public void radioclientbillmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(1000);	
		element.radiobilling.click();
		Thread.sleep(1000);		
		element.radioclientbill.click();
		Thread.sleep(1000);		
		element.radioclientbillcheckbox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radioclientbillexcel);
		String parenHandleRB = driver.getWindowHandle();
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioclientbillexcelprint);
		Thread.sleep(2000);			
		driver.switchTo().window(parenHandleRB);
		driver.switchTo().frame("appIframe");
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioclientbillpdf);
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click();", element.radioclientbillpdfprint);
		Thread.sleep(2000);	
		Set<String> handel5 = driver.getWindowHandles();	
		int count5=handel5.size();
		for(String child5 : handel5) 
		{
			if(!parenHandleRB.equalsIgnoreCase(child5)) 
			{
				driver.switchTo().window(child5);
				Thread.sleep(1000);	
				driver.close();				
			}
		}	
		driver.switchTo().window(parenHandleRB);
		driver.switchTo().frame("appIframe");
		Thread.sleep(1000);	
	}	
	public void radiovendorbillmenu() throws InterruptedException {
		element.radiomenubar.click();
		Thread.sleep(2000);	
		element.radiobilling.click();
		Thread.sleep(2000);		
		element.radiovendortbill.click();
		Thread.sleep(2000);		
		element.radiovendortbillchekbox.click();
		Thread.sleep(2000);		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element.radiovendorbillexcelprint);
	}		
	
}
