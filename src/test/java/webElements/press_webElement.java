package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class press_webElement {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/input") public WebElement login_username;
	@FindBy(xpath = "//html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[2]/div/div[1]/label/span") public WebElement login_checkbox;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button") public WebElement username_submit;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/div/input") public WebElement password_login;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button/span/span") public WebElement password_submit;
	@FindBy(xpath="//div[@id='user_list_hover']") public WebElement before_logout;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/m-user-profile/div/div[2]/div/div/div[5]/div[2]") public WebElement logout;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/m-login-warning-dialog/div[2]/div/m-spinner-button/button") public WebElement popup;
	
	//Press App
	
	@FindBy(xpath="/html/body/m-modules/m-header/header/div/div/div[1]/ul/li[3]/a/span") public WebElement operation;
	@FindBy(xpath="//*[@id=\"header_application_list_sub_section\"]/div/div[1]/div/div[1]/div[1]/div[2]") public WebElement pressOption;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[1]/span/span/span/span") public WebElement clientNameSelection;
	
	@FindBy(xpath="//*[@id=\"header_application_search_application_field\"]") public WebElement searchboxpress;
	@FindBy(xpath="//*[@id=\"PartialCBES\"]/span/span/span[1]/input") public WebElement clientNameInputbox;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[2]/ul/li")public WebElement clientNameselect;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[2]/div/span/span[1]/span/span[1]")public WebElement brandselect;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[1]/input") public WebElement brandNameInputbox;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[2]/ul/li")public WebElement brandnameselect;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[3]/button")public WebElement createNewEstimate;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[2]/div[1]/input")public WebElement createNewCampaign;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[13]/div[2]/button[1]")public WebElement newCampaignSubmit;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[6]/div/div/div/div[3]/button")public WebElement campaignSubmit;
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/a/span")public WebElement pressEstimate;

//adding new entries
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[3]/a[2]")public WebElement newEntries;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div[2]/div/div/input[2]")public WebElement publicationCode;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[4]/ul/li[1]")public WebElement PublicationSelection;
@FindBy(xpath="//*[@id=\"Dimension1\"]") public WebElement spaceWidth;
@FindBy(xpath="//*[@id=\"Dimension2\"]") public WebElement spaceHeight;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[7]/div[3]/div/input")public WebElement entryRate;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div/center/div[1]/button[2]")public WebElement editionSelection;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[4]/button[2]")public WebElement entysubmission;
@FindBy(xpath="//*[@id=\"colsemodal\"]")public WebElement entryPopup;

//ApproveEstimate
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/a/span")public WebElement globalEstimateview;
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/ul/li[1]/a")public WebElement pressestimateView;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/label/input")public WebElement globalSearch;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr/td[9]/input")public WebElement estimateApproval;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/form/div/div[9]/div[2]/input")public WebElement PoNumber;
@FindBy(xpath="//input[@id=\"btnSubmitApp\"]")public WebElement ApproveEstimate;

//Seleting existing any estimate
@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/label/input")public WebElement existingEstimatesearchbox;
@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td[1]/input")public WebElement existingEstSelect;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[2]/button[1]")public WebElement estimateSubmit;

//selecting the estimate from dashboard for an existing estimate
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/a/span")public WebElement est1;
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/ul/li[1]/a/span")public WebElement est1view;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/label/input")public WebElement est1searchbox;

@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr/td[1]/input")public WebElement est1selection;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div/div[1]/div[9]/button")public WebElement goToEntry;
	
//adding new entries to existing estimate
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[3]/button[1]")public WebElement addEntry;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div[2]/div/div/input[2]")public WebElement publicationCode2;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[4]/ul/li[1]")public WebElement PublicationSelection2;
@FindBy(xpath="//*[@id=\"Dimension1\"]") public WebElement spaceWidth2;
@FindBy(xpath="//*[@id=\"Dimension2\"]") public WebElement spaceHeight2;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[7]/div[3]/div/input")public WebElement entryRate2;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div/center/div[1]/button[2]")public WebElement editionSelection2;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[4]/button[2]")public WebElement entysubmission2;
@FindBy(xpath="//*[@id=\"colsemodal\"]")public WebElement entryPopup2;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[8]/div/div/div/div[3]/button[2]")public WebElement addAsSuppliPubEntry;

//create a scheduling 
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/ul/li[3]/a")public WebElement pressScheduling;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input")public WebElement autoScheduling;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div/div[4]/div[2]/input")public WebElement enterIns;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div/div[5]/div[2]/input")public WebElement selectdate;
@FindBy(xpath="/html/body/div[10]/div[1]/table/tbody/tr[3]/td[4]")public WebElement enterdate;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div/div[9]/div/center/input[1]")public WebElement Proceedsch;

//Branch selection
@FindBy(xpath="/html/body/m-modules/modal-container/div[2]/m-application-user-branch/section/div[2]/perfect-scrollbar/div/div[1]/div[1]\r\n")public WebElement MumBranchSelection;

//Exporting the print estimate output
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/button")public WebElement exportButton;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/ul/li[1]/a")public WebElement printEstimateExcelOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement printEstimateExcel;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/div/section/fieldset[1]/legend[1]/span[2]/input")public WebElement printEstimatePDFOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement printEstimatePDF;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/ul/li[1]/a")public WebElement printEstimatePDFOption2;

//Exporting the print original output
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/ul/li[2]/a")public WebElement printOriginalOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement printOriginalExcel;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/ul/li[2]/a")public WebElement printOriginalOption2;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/div/section/fieldset[1]/legend[1]/input")public WebElement printOriginalexcelOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement printOriginalPDF;

//Exporting the est cum schedule output
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/ul/li[4]/a")public WebElement estscheduleOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement estscheduleExcel;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/div/section/fieldset[1]/legend[1]/span[2]/input")public WebElement estschedulePdfOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement estschedulepdf;
//input[(@type="radio" and @value="PDF")]
@FindBy(xpath="//*[@id=\"loadingModal\"]/div/div/div/div/section/fieldset[1]/legend[1]/span[2]/input[1]")public WebElement estSchPDFradio;

//Exporting the RO Export
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[5]/a/span")public WebElement printDoc;
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[5]/ul/li[1]/a/span")public WebElement printdocRO;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div/label/input")public WebElement printdocSearch;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[8]/a[1]")public WebElement roOutput;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div/button[2]")public WebElement roPdfDownload;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/section/fieldset[1]/legend[1]/input")public WebElement roExcelRadio;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div/button[2]")public WebElement roExcelDowwnload;

//Exporting the Client bill output
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[4]/a/span")public WebElement BillingOption;
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[4]/ul/li[3]/a/span")public WebElement clientBillOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/form/div/div[2]/div[2]/div/div/div[1]/div[2]/div/label/input")public WebElement clientBillSearchOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/form/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr/td[7]/a[1]")public WebElement clientBillPDF;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[5]/div/div/div[2]/button")public WebElement OBPdfPrint;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/form/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr/td[7]/a[2]")public WebElement clientBillExcel;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div[3]/button[1]")public WebElement OBExcelprint;

//Exporting the status report
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[7]/a/span")public WebElement reportsOption;
@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[7]/ul/li[1]/a/span")public WebElement statusReportOption;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[1]/div/span/span[1]/span/ul/li/input")public WebElement Client_reports;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[1]/div/input")public WebElement selectAlllclient;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[3]/div/span[2]/input[1]")public WebElement selectAllStatus;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/input")public WebElement fromScheduleDate;
@FindBy(xpath="/html/body/div[9]/div[1]/table/tbody/tr[1]/td[4]")public WebElement fromDate;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/input")public WebElement toScheduleDate;
@FindBy(xpath="/html/body/div[9]/div[1]/table/tbody/tr[5]/td[6]")public WebElement toDate;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[3]/input")public WebElement selectAllEstimate;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div[1]/button")public WebElement printStatusReport;

//automating the supp estimate document
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div[2]/div/ul/li[3]/a")public WebElement suppEstdropdown;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/div/section/fieldset[1]/div/span[2]/span[1]/span/ul/li/input")public WebElement suppEstSelectDropdown;
@FindBy(xpath="/html/body/span/span/span/ul/li")public WebElement suppEstSelet;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement suppexcelDownload;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/div/section/fieldset[1]/legend[1]/span[2]/input")public WebElement suppPdFswitch;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/button[2]")public WebElement suppPdfDownload;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/form/div/div[1]/button")public WebElement generateOBbill;
@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[8]/div/center/button[1]")public WebElement submitobBill;

	public static String clientsearch="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[1]]"; 
	
	public press_webElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
 