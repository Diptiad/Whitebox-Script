package webElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class radio_webElement 
{
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
	// Radio
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/m-application-list/div/div[2]/div[2]/perfect-scrollbar/div/div[1]/div/div/div[1]") public WebElement radioOption;
	//Radio Menu
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span[2]") public WebElement radiomenubar;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[1]/table/tbody/tr[5]/td/div[2]/ul/li[2]/span/span[1]/img") public WebElement radiooperation;
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[1]") public WebElement radioestimate;
	//Radio client brand 
	@FindBy(xpath="/html/body/form/div[4]/div[5]/table/tbody/tr[3]/td/div/table[1]/tbody/tr/td[1]/table/tbody/tr/td/span[1]/span[1]/span/span[1]") public WebElement radioclientNameSelection;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/m-application-list/div/div[2]/div[1]/div[2]/span/input") public WebElement searchboxradio;
	@FindBy(xpath="/html/body/span/span/span[1]/input") public WebElement radioclientNameInputbox;
	@FindBy(xpath="/html/body/span/span/span[2]/ul")public WebElement radioclientNameselect;
	@FindBy(xpath="/html/body/form/div[4]/div[5]/table/tbody/tr[3]/td/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td/span[1]/span[1]/span/span[1]")public WebElement radiobrandselect;
	@FindBy(xpath="/html/body/span/span/span[1]/input") public WebElement radiobrandNameInputbox;
	@FindBy(xpath="/html/body/span/span/span[2]/ul")public WebElement radiobrandnameselect;
	@FindBy(id="ctl00_grdEstimate_ctl05_chkBox")public WebElement radiocheckcamp;
	@FindBy(xpath="/html/body/form/div[4]/div[5]/table/tbody/tr[3]/td/div/table[2]/tbody/tr[2]/td/div/table/tbody/tr/td/input")public WebElement radioproceedcamp;	
	//Radio click ext estimate for output download	
	@FindBy(name="ctl00$ContentPlaceHolder1$ImageButton7")public WebElement radioexportButton;;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnPrintApproveEst")public WebElement radioexportEstButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnGoToPrint")public WebElement radioexportEstOkButton;	
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnBackupEstPrint")public WebElement radioexportAppEstButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnGoToPrint11")public WebElement radioexportAppEstOkButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSipliPrint")public WebElement radioexportSuppEstButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_BtnGoToPrint12")public WebElement radioexportSuppEstOkButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnsupliprint")public WebElement radioexportSuppEstpropButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_Button3")public WebElement radioexportSuppEstcancelButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[8]/table[2]/tbody/tr/td/center/div/input[6]")public WebElement radioexportExcelButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[8]/table[2]/tbody/tr/td/center/div/input[7]")public WebElement radioestSchButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[3]/div[7]/table/tbody/tr[4]/td/input[1]")public WebElement radioestSchokButton;
	@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[3]/div[7]/table/tbody/tr[4]/td/input[2]")public WebElement radioestSchcloseButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnExcelExport")public WebElement radioestexcelexport;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnExportPDFNew")public WebElement radioestnewPDFButton;
	@FindBy(id="ctl00_ContentPlaceHolder1_btnExportExcelNew")public WebElement radioestnewExcelButton;
	@FindBy(id="imgFormatPrintClose")public WebElement radioexportcloseButton;
//Radio click schdule
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[3]/a")public WebElement radioSchdule;
//Radio click RO
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[1]/a")public WebElement radioRO;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement radioROcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement radioROformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioexportroexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement radioexportropdf;
// Radio Click RE
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[2]/a")public WebElement radioRE;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement radioREcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement radioREformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioexportreexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement radioexportrepdf;
//Radio Click Cancellation	
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[3]/a")public WebElement radioCancellation;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement radioCancellationcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement radioCancellationformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioexportCancellationexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement radioexportCancellationpdf;
//Radio Click MakeGood
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[4]/a")public WebElement radioMakeGood;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement radioMakeGoodcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement radioMakeGoodformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioexportMakeGoodexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement radioexportMakeGoodpdf;
//Radio Click WithHold
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[5]/a")public WebElement radioWithHold;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement radioWithHoldcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement radioWithHoldformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioexportWithHoldexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement radioexportWithHoldpdf;		
//Radio Click Missed
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[6]/a")public WebElement radioMissed;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[7]/td/div/div/table/tbody/tr[2]/td[1]/input")public WebElement radioMissedcheck;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnReportPrint")public WebElement radioMissedformat;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioexportMissedexcel;
		@FindBy(id = "ctl00_ContentPlaceHolder1_BtnPrintPDF")public WebElement radioexportMissedpdf;			
//Radio Ro Bulk Print
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[2]/li[7]/a")public WebElement radioRobulkmenu;
		@FindBy(name="ctl00$ContentPlaceHolder1$txtEstFromDate")public WebElement radioRofromdate;
		@FindBy(name="ctl00$ContentPlaceHolder1$txtEstToDate")public WebElement radioRotodate;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[2]/td[3]/input")public WebElement radioRogo;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table/tbody/tr[5]/td/fieldset/div/table/tbody/tr[1]/th[1]/input")public WebElement radioRobulkcheck;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnDocNOList")public WebElement radioRobulkprint;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[3]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/center/input")public WebElement radioRobulkpdf;
//Radio Client Bill Menu
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[1]/table/tbody/tr[5]/td/div[2]/ul/li[3]") public WebElement radiobilling;
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[3]/a")public WebElement radioclientbill;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table[2]/tbody/tr[5]/td[2]/fieldset/div/table/tbody/tr[2]/td[1]/input")public WebElement radioclientbillcheckbox;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnExportRO")public WebElement radioclientbillexcel;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnExportRO1")public WebElement radioclientbillexcelprint;
		@FindBy(id="ctl00_ContentPlaceHolder1_btnPrintPDF")public WebElement radioclientbillpdf;
		@FindBy(id="ctl00_ContentPlaceHolder1_BtnPrintPDF1")public WebElement radioclientbillpdfprint;
//Radio Vendor Bill Menu
		@FindBy(xpath="/html/body/form/div[4]/div[3]/div[2]/div/div/ul[1]/li[2]/a")public WebElement radiovendortbill;
		@FindBy(xpath="/html/body/form/div[4]/div[4]/table/tbody/tr/td[2]/div[3]/div/div[2]/table[2]/tbody/tr[4]/td/div/table/tbody/tr[2]/td[1]/input")public WebElement radiovendortbillchekbox;
		@FindBy(id="ctl00_ContentPlaceHolder1_btnExcelIB")public WebElement radiovendorbillexcelprint;
	public static String clientsearch="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[1]]"; 
	
	public radio_webElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
 