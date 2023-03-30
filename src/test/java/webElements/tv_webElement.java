package webElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class tv_webElement {
	WebDriver driver;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/input") public WebElement login_username;
	@FindBy(xpath = "//html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[2]/div/div[1]/label/span") public WebElement login_checkbox;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button") public WebElement username_submit;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/div/input") public WebElement password_login;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button/span/span") public WebElement password_submit;
	@FindBy(xpath="//div[@id='user_list_hover']") public WebElement before_logout;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/m-user-profile/div/div[2]/div/div/div[5]/div[2]") public WebElement logout;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/m-login-warning-dialog/div[2]/div/m-spinner-button/button") public WebElement popup;
	@FindBy(xpath="/html/body/m-modules/m-header/header/div/div/div[1]/ul/li[3]/a") public WebElement operation;
	// TV
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/m-application-list/div/div[2]/div[2]/perfect-scrollbar/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/span") public WebElement TVOption;	
	//TV Menu
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span[2]") public WebElement menubar;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[1]/table/tbody/tr[5]/td/div[2]/ul/li[2]/span/span[1]/img") public WebElement tvoperation;
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[1]/a") public WebElement tvestimate;
	//TV client brand 
	@FindBy(xpath="/html/body/form/div[4]/div[5]/table/tbody/tr[3]/td/div/table[1]/tbody/tr/td[1]/table/tbody/tr/td/span[1]/span[1]/span/span[1]") public WebElement clientNameSelection;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/m-application-list/div/div[2]/div[1]/div[2]/span/input") public WebElement searchboxTV;
	@FindBy(xpath="/html/body/span/span/span[1]/input") public WebElement clientNameInputbox;
	@FindBy(xpath="/html/body/span/span/span[2]/ul")public WebElement clientNameselect;
	@FindBy(xpath="/html/body/form/div[4]/div[5]/table/tbody/tr[3]/td/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td/span[1]/span[1]/span/span[1]")public WebElement brandselect;
	@FindBy(xpath="/html/body/span/span/span[1]/input") public WebElement brandNameInputbox;
	@FindBy(xpath="/html/body/span/span/span[2]/ul")public WebElement brandnameselect;
	@FindBy(id="ctl00_grdEstimate_ctl04_chkBox")public WebElement checkcamp;
	@FindBy(xpath="/html/body/form/div[4]/div[5]/table/tbody/tr[3]/td/div/table[2]/tbody/tr[2]/td/div/table/tbody/tr/td/input")public WebElement proceedcamp;
	//click ext estimate for output download	
	@FindBy(name="ctl00$ContentPlaceHolder1$ImageButton7")public WebElement exportButton;;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnPrintApproveEst")public WebElement exportEstButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnGoToPrint")public WebElement exportEstOkButton;	
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnBackupEstPrint")public WebElement exportAppEstButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnGoToPrint11")public WebElement exportAppEstOkButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSipliPrint")public WebElement exportSuppEstButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnGoToPrint12")public WebElement exportSuppEstOkButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnsupliprint")public WebElement exportSuppEstpropButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_Button3")public WebElement exportSuppEstcancelButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[8]/table[2]/tbody/tr/td/center/div/input[6]")public WebElement exportExcelButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[8]/table[2]/tbody/tr/td/center/div/input[7]")public WebElement estSchButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[3]/div[7]/table/tbody/tr[4]/td/input[1]")public WebElement estSchokButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[3]/div[7]/table/tbody/tr[4]/td/input[2]")public WebElement estSchcloseButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnExcelExport")public WebElement estexcelexport;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnExportPDFNew")public WebElement estnewPDFButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnExportExcelNew")public WebElement estnewExcelButton;
	@FindBy(id="imgFormatPrintClose")public WebElement exportcloseButton;
//click schdule
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[3]/a")public WebElement tvSchdule;
//click RO
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[1]/a")public WebElement tvRO;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement tvROcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement tvROformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement exportroexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement exportropdf;
//Click RE
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[2]/a")public WebElement tvRE;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement tvREcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement tvREformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement exportreexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement exportrepdf;
//Click Cancellation	
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[3]/a")public WebElement tvCancellation;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement tvCancellationcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement tvCancellationformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement exportCancellationexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement exportCancellationpdf;
//Click MakeGood
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[4]/a")public WebElement tvMakeGood;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement tvMakeGoodcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement tvMakeGoodformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement exportMakeGoodexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement exportMakeGoodpdf;
//Click WithHold
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[5]/a")public WebElement tvWithHold;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement tvWithHoldcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement tvWithHoldformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement exportWithHoldexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement exportWithHoldpdf;		
//Click Missed
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[6]/a")public WebElement tvMissed;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement tvMissedcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement tvMissedformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement exportMissedexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement exportMissedpdf;			
//Ro Bulk Print
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[7]/a")public WebElement tvRobulkmenu;
		@FindBy(name="ctl00$ContentPlaceHolder1$txtEstFromDate")public WebElement tvRofromdate;
		@FindBy(name="ctl00$ContentPlaceHolder1$txtEstToDate")public WebElement tvRotodate;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[2]/td[3]/input")public WebElement tvRogo;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[5]/td/fieldset/div/table/tbody/tr[1]/th[1]/input")public WebElement tvRobulkcheck;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnDocNOList")public WebElement tvRobulkprint;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[3]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/center/input")public WebElement tvRobulkpdf;
//TV Monitore Menu
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[3]/li/a")public WebElement Monitoringmenu;
//TV Client Bill Menu
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[1]/table/tbody/tr[5]/td/div[2]/ul/li[3]") public WebElement billing;
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[3]/a")public WebElement clientbill;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table[2]/tbody/tr[5]/td[2]/fieldset/div/table/tbody/tr[2]/td[1]/input")public WebElement clientbillcheckbox;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement clientbillexcel;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnExportRO1")public WebElement clientbillexcelprint;
		@FindBy(id="ctl00_ContentPlaceHolder1_btnPrintPDF")public WebElement clientbillpdf;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnPrintPDF1")public WebElement clientbillpdfprint;
//TV Vendor Bill Menu
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[2]/a")public WebElement vendortbill;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table[2]/tbody/tr[4]/td/div/table/tbody/tr[2]/td[1]/input")public WebElement vendortbillchekbox;
		@FindBy(id="ctl00_ContentPlaceHolder1_btnExcelIB")public WebElement vendorbillexcelprint;
	public static String clientsearch="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[1]]"; 
	public tv_webElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
 