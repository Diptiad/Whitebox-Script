package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import action.common_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import webElements.webElements;
public class press_steps {
	// webElements element;
	WebDriver driver;
	// driver = new chromeDriver();
	globalHooks globalhook;
	common_actions act;

	public press_steps(common_actions act) {
		this.act = act;
	}

	// opening the press app in the app
	// ---------------------------------------------X------------------------------------------------------------------------------

	@Then("user is able to search the Press App in Operation Drop Down")
	public void user_is_able_to_search_the_Press_App_in_Operation_Drop_Down(DataTable dataTable)
			throws InterruptedException {
		act.pressApp(dataTable.cell(0, 0));
	}

	@Then("user is able to select any one Branch")
	public void user_is_able_to_select_any_one_Branch() throws InterruptedException {
		act.Branch_Selection();

	}

	@Then("user is able to select client in press App")
	public void user_is_able_to_select_client_in_press_App(DataTable dataTable) throws InterruptedException {
		act.clientBrandSelection(dataTable.cell(1, 0), dataTable.cell(1, 1));
	}

	@Then("user is able to select Brand and click on Existing Estimate")
	public void user_is_able_to_select_Brand_and_click_on_Existing_Estimate(DataTable dataTable)
			throws InterruptedException {
		act.existingEstimate(dataTable.cell(0, 0));
		act.GoToElement();
	}

	@Then("user is able to click on export button in estimate entries page")
	public void user_is_able_to_click_on_export_button_in_estimate_entries_page() throws InterruptedException {
		act.estimateOutputDownload();
	}

	@Then("user is able to export print Estimate option")
	public void user_is_able_to_export_print_Estimate_option() throws InterruptedException {
		act.FileDownload();
	}

	@Then("user is able to export print original output")
	public void user_is_able_to_export_print_original_output() throws InterruptedException {
		act.printOriginalFileDownload();
	}

	@Then("user is able to export est cum schedule output")
	public void user_is_able_to_export_est_cum_schedule_output() throws InterruptedException {
		act.printOriginalFileDownload();
	}

	@Then("user clicks on print document to download RO output")
	public void user_clicks_on_print_document_to_download_RO_output() throws InterruptedException {
		act.printDocument();
	}
	// user clicks on Client bill option to download client bill outputs

	@Then("user clicks on Client bill option to download client bill outputs")
	public void user_clicks_on_Client_bill_option_to_download_client_bill_outputs() throws InterruptedException {
		act.OBprint();
	}

	@Then("user downloads the status report")
	public void user_downloads_the_status_report() throws InterruptedException {

		act.statusReport();// commenting the code as this thorws class cast exception
	}

	@Then("user is able to export print supp estimate")
	public void user_is_able_to_export_print_supp_estimate() throws InterruptedException {
		act.printsuppEstimate();
	}

}
