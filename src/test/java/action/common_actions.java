package action;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.globalHooks;
//import webElements.webElements;
import webElements.webElements;

public class common_actions {
	private WebDriver driver;
	webElements element;
	WebDriverWait wait;

	public common_actions(globalHooks globalhook) {
		this.driver = globalhook.getDriver();
		element = new webElements(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void pressApp(String string) throws InterruptedException {
		Thread.sleep(2000);
		element.operation.click();
		Thread.sleep(5000);
		element.searchboxpress.sendKeys(string);
		element.pressOption.click();
		Thread.sleep(10000);
	}
	public void clientBrandSelection(String client1, String brand1) throws InterruptedException {

		// client selection
		driver.switchTo().frame("appIframe");
		element.clientNameSelection.click();
		Thread.sleep(10000);

		element.clientNameInputbox.click();
		element.clientNameInputbox.sendKeys(client1);
		Thread.sleep(5000);
		element.clientNameselect.click();
		Thread.sleep(3000);

		// brand selection
		element.brandselect.click();
		Thread.sleep(3000);
		element.brandNameInputbox.sendKeys(brand1);
		Thread.sleep(3000);
		element.brandnameselect.click();
		Thread.sleep(3000);
	}
	public void existingEstimate(String estimateName) throws InterruptedException
	{
		Thread.sleep(3000);
		element.existingEstimatesearchbox.click();
		element.existingEstimatesearchbox.sendKeys(estimateName);
		Thread.sleep(5000);
		element.existingEstSelect.click();}
	public void GoToElement() throws InterruptedException
	{
		Thread.sleep(2000);
		element.goToEntry.click();
		Thread.sleep(2000);}
	public void Branch_Selection()  
	{
	try
		{
		element.MumBranchSelection.isDisplayed();
		element.MumBranchSelection.click();}
	catch(NoSuchElementException exception)
		{
	 	 // exception.printStackTrace();
		}
	}
	public void estimateOutputDownload() throws InterruptedException
	{
		Thread.sleep(2000);
		element.exportButton.click();
		Thread.sleep(2000);	}
	
	public void FileDownload()
	{
		try{//downloading the excel file
		Thread.sleep(2000);
		element.printEstimateExcelOption.click();
		Thread.sleep(2000);
		element.printEstimateExcel.click();
		//downloading the pdf file
		Thread.sleep(2000);
		element.exportButton.click();
		Thread.sleep(2000);
		element.printEstimatePDFOption2.click();
		Thread.sleep(2000);
		element.printEstimatePDFOption.click();
		Thread.sleep(2000);
		element.printEstimatePDF.click();
		Thread.sleep(3000);
		System.out.println("print Estimate file is downloaded succesfully");}
		catch(Exception exception) {
			exception.printStackTrace();
			System.out.println("print Estimate file is not downloaded");}}
		
	public void printOriginalFileDownload(){
		try {
			element.exportButton.click();
			Thread.sleep(3000);
			element.printOriginalOption.click();
			Thread.sleep(3000);
			element.printOriginalPDF.click();
			Thread.sleep(3000);
			element.exportButton.click();
			Thread.sleep(3000);
			element.printOriginalOption2.click();
			Thread.sleep(3000);
			element.printOriginalexcelOption.click();
			Thread.sleep(3000);
			element.printOriginalExcel.click();
			Thread.sleep(3000);
			System.out.println("print Estimate file is downloaded succesfully");}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("print Estimate file is not downloaded");}}
			
	public void printEstscheduleFile() {
		try {
			element.exportButton.click();
			Thread.sleep(3000);
			element.estscheduleOption.click();
			Thread.sleep(3000);
			element.estscheduleExcel.click();
			Thread.sleep(3000);
			element.exportButton.click();
			Thread.sleep(3000);
			element.estscheduleOption.click();
			Thread.sleep(3000);
			element.estSchPDFradio.click();
			//element.estschedulePdfOption.click();
			Thread.sleep(5000);
			element.estschedulepdf.click();
			Thread.sleep(3000);
			System.out.println("estimate cum schedule file is downloaded successfully");}
		catch(Exception e) {
			System.out.println("estimate cum schedule file is not downloaded");
		}
	}
	public void printDocument() throws InterruptedException
	{
		element.printDoc.click();
		Thread.sleep(5000);
		element.printdocRO.click();
		Thread.sleep(3000);
		element.printdocSearch.click();
		Thread.sleep(3000);
		element.printdocSearch.sendKeys("1028");
		Thread.sleep(3000);
		element.roOutput.click();
		Thread.sleep(3000);
		element.roPdfDownload.click();
		Thread.sleep(3000);
		element.roOutput.click();
		Thread.sleep(50000);
		element.roExcelRadio.click();
		Thread.sleep(3000);
		element.roExcelDowwnload.click();
		Thread.sleep(3000);	}
	
	public void OBprint() throws InterruptedException{
		element.BillingOption.click();
		Thread.sleep(3000);
		element.clientBillOption.click();
		Thread.sleep(3000);
		element.clientBillSearchOption.click();
		Thread.sleep(3000);
		element.clientBillSearchOption.sendKeys("008");
		Thread.sleep(3000);
		element.clientBillPDF.click();
		Thread.sleep(3000);
		element.OBPdfPrint.click();
		Thread.sleep(3000);
		element.clientBillExcel.click();
		Thread.sleep(3000);
		element.OBExcelprint.click();
		Thread.sleep(3000);}
	
	public void statusReport() throws InterruptedException{
	
		//element.reportsOption.sendKeys(Keys.PAGE_UP);
		element.generateOBbill.click();
		Thread.sleep(3000);
		element.submitobBill.sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);	
		element.reportsOption.click();
		Thread.sleep(5000);
		element.statusReportOption.click();
		Thread.sleep(5000);
		element.selectAlllclient.click();
		Thread.sleep(5000);
		element.selectAllStatus.click();
		Thread.sleep(5000);
		element.fromScheduleDate.click();
		Thread.sleep(5000);
		element.fromDate.click();
		Thread.sleep(5000);
		element.toScheduleDate.click();
		Thread.sleep(5000);
		element.toDate.click();
		Thread.sleep(5000);
		element.selectAllEstimate.click();
		Thread.sleep(5000);
		element.printStatusReport.click();
		Thread.sleep(5000);}
	
	public void printsuppEstimate() throws InterruptedException
	{
		Thread.sleep(3000);
		element.exportButton.click();
		Thread.sleep(3000);
		element.suppEstdropdown.click();
		Thread.sleep(3000);
		element.suppEstSelectDropdown.click();
		Thread.sleep(3000);
		element.suppEstSelet.click();
		Thread.sleep(3000);
		element.suppexcelDownload.click();
		Thread.sleep(3000);
		element.exportButton.click();
		Thread.sleep(3000);
		element.suppEstdropdown.click();
		Thread.sleep(3000);
		element.suppEstSelectDropdown.click();
		Thread.sleep(3000);
		element.suppEstSelet.click();
		Thread.sleep(3000);
		element.suppPdFswitch.click();
		Thread.sleep(3000);
		element.suppPdfDownload.click();
		Thread.sleep(3000);}
	
	






}
