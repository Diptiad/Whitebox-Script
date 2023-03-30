package action;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinition.globalHooks;
import webElements.tv_webElement;
//import webElements.webElements;

public class tv_action {
	private WebDriver driver;
	tv_webElement element;
	WebDriverWait wait;
public tv_action(globalHooks globalhook) {
	this.driver = globalhook.getDriver();
	element = new tv_webElement(driver);
	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
}
public void TVApp(String string) throws InterruptedException {
	Thread.sleep(1000);
	element.operation.click();
	Thread.sleep(1000);
	element.searchboxTV.sendKeys(string);
	element.TVOption.click();
	Thread.sleep(10000);
}
public void operationmenu() throws InterruptedException {
	driver.switchTo().frame("appIframe");
	Thread.sleep(1000);	
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvestimate.click();
	Thread.sleep(1000);	
}
public void clientBrandSelection(String client1, String brand1) throws InterruptedException 
{
	Thread.sleep(5000);
	element.clientNameSelection.click();
	Thread.sleep(1000);
	element.clientNameInputbox.click();
	element.clientNameInputbox.sendKeys("ABC");
	Thread.sleep(1000);
	element.clientNameselect.click();
	Thread.sleep(1000);
	// brand selection
	element.brandselect.click();
	Thread.sleep(3000);
	element.brandNameInputbox.sendKeys("ABC Brand");
	Thread.sleep(3000);
	element.brandnameselect.click();
	Thread.sleep(3000);
	element.checkcamp.click();
	Thread.sleep(3000);
	element.proceedcamp.click();
}
public void estimateOutputDownload() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.exportButton);
}
public void FileDownload() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String parenHandle = driver.getWindowHandle();
	js.executeScript("arguments[0].click();", element.exportEstButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportEstOkButton);   
    Thread.sleep(4000);
	driver.switchTo().window(parenHandle);
	driver.switchTo().frame("appIframe");
	Thread.sleep(4000);   	
	js.executeScript("arguments[0].click();", element.exportButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportAppEstButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportAppEstOkButton);
	Thread.sleep(4000);
	driver.switchTo().window(parenHandle);
	driver.switchTo().frame("appIframe");
	Thread.sleep(4000);
	js.executeScript("arguments[0].click();", element.exportButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportSuppEstButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportSuppEstOkButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportSuppEstpropButton);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", element.exportSuppEstcancelButton);
	Thread.sleep(4000);
	driver.switchTo().window(parenHandle);
	driver.switchTo().frame("appIframe");
	Thread.sleep(4000);
	js.executeScript("arguments[0].click();", element.exportButton);
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();", element.estnewPDFButton);
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();", element.estnewExcelButton);
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();", element.exportcloseButton);
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();", element.estexcelexport);
	Thread.sleep(3000);
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

public void Schedulemenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvSchdule.click();
	Thread.sleep(1000);	
}
public void ReleaseOrdermenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvRO.click();
	Thread.sleep(1000);	
	element.tvROcheck.click();
	Thread.sleep(1000);		
}	
public void FileRODownload() throws InterruptedException
{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.tvROformat);
	String parenHandleR = driver.getWindowHandle();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.exportroexcel);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleR);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	element.tvROcheck.click();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.tvROformat);
	Thread.sleep(2000);		
	js.executeScript("arguments[0].click();", element.exportropdf);
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
	
public void REmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvRE.click();
	Thread.sleep(1000);	
	element.tvREcheck.click();
	Thread.sleep(1000);		
}	
public void FileREDownload() throws InterruptedException
{		
	String parenHandleRE = driver.getWindowHandle();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.tvREformat);
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.exportreexcel);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleRE);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	element.tvREcheck.click();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.tvREformat);
	Thread.sleep(2000);		
	js.executeScript("arguments[0].click();", element.exportrepdf);
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
public void Cancellationmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvCancellation.click();
	Thread.sleep(1000);	
	element.tvCancellationcheck.click();
	Thread.sleep(1000);		
}	
public void FileCancellationDownload() throws InterruptedException
{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.tvCancellationformat);
	String parenHandleRC = driver.getWindowHandle();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.exportCancellationexcel);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleRC);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	element.tvCancellationcheck.click();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.tvCancellationformat);
	Thread.sleep(2000);		
	js.executeScript("arguments[0].click();", element.exportCancellationpdf);
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
public void MakeGoodmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvMakeGood.click();
	Thread.sleep(1000);	
	element.tvMakeGoodcheck.click();
	Thread.sleep(1000);		
}	
public void FileMakeGoodDownload() throws InterruptedException
{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.tvMakeGoodformat);
	String parenHandleRM = driver.getWindowHandle();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.exportMakeGoodexcel);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleRM);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	element.tvMakeGoodcheck.click();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.tvMakeGoodformat);
	Thread.sleep(2000);		
	js.executeScript("arguments[0].click();", element.exportMakeGoodpdf);
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
public void WithHoldmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvWithHold.click();
	Thread.sleep(1000);	
	element.tvWithHoldcheck.click();
	Thread.sleep(1000);		
}	
public void FileWithHoldDownload() throws InterruptedException
{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.tvWithHoldformat);
	String parenHandleRH = driver.getWindowHandle();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.exportWithHoldexcel);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleRH);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	element.tvWithHoldcheck.click();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.tvWithHoldformat);
	Thread.sleep(2000);		
	js.executeScript("arguments[0].click();", element.exportWithHoldpdf);
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
public void Missedmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvMissed.click();
	Thread.sleep(1000);	
	element.tvMissedcheck.click();
	Thread.sleep(1000);		
}	
public void FileMissedDownload() throws InterruptedException
{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.tvMissedformat);
	String parenHandleRM = driver.getWindowHandle();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.exportMissedexcel);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleRM);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	element.tvMissedcheck.click();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.tvMissedformat);
	Thread.sleep(2000);		
	js.executeScript("arguments[0].click();", element.exportMissedpdf);
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
public void Robulkmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.tvRobulkmenu.click();
	Thread.sleep(1000);		
}	
public void PrintRobulk(String From,String To) throws InterruptedException
{
	String parenHandleR = driver.getWindowHandle();
	JavascriptExecutor js = (JavascriptExecutor)driver;		
	js.executeScript("arguments[0].click();", element.tvRofromdate);
	js.executeScript("arguments[0]. value='1/3/2023';", element.tvRofromdate);
	//element.tvRofromdate.sendKeys(From);	
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();", element.tvRotodate);
	js.executeScript("arguments[0]. value='31/3/2023';", element.tvRotodate);
//	element.tvRofromdate.sendKeys(To);	
	Thread.sleep(3000);	
	element.tvRogo.click();
	Thread.sleep(3000);	
	element.tvRobulkcheck.click();
	Thread.sleep(3000);	
	element.tvRobulkprint.click();
	Thread.sleep(3000);	
	element.tvRobulkpdf.click();
	driver.switchTo().window(parenHandleR);
	driver.switchTo().frame("appIframe");
	Thread.sleep(1000);	
}
public void TvMonitoringmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.tvoperation.click();
	Thread.sleep(1000);		
	element.Monitoringmenu.click();
	Thread.sleep(1000);		
}	
public void clientbillmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(1000);	
	element.billing.click();
	Thread.sleep(1000);		
	element.clientbill.click();
	Thread.sleep(1000);		
	element.clientbillcheckbox.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.clientbillexcel);
	String parenHandleRB = driver.getWindowHandle();
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.clientbillexcelprint);
	Thread.sleep(2000);			
	driver.switchTo().window(parenHandleRB);
	driver.switchTo().frame("appIframe");
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.clientbillpdf);
	Thread.sleep(2000);	
	js.executeScript("arguments[0].click();", element.clientbillpdfprint);
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
public void vendorbillmenu() throws InterruptedException {
	element.menubar.click();
	Thread.sleep(2000);	
	element.billing.click();
	Thread.sleep(2000);		
	element.vendortbill.click();
	Thread.sleep(2000);		
	element.vendortbillchekbox.click();
	Thread.sleep(2000);		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element.vendorbillexcelprint);
}	
}
