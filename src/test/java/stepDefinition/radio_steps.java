package stepDefinition;
import org.openqa.selenium.WebDriver;
import action.radio_action;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
public class radio_steps
{
	WebDriver driver;
	globalHooks globalhook;
	radio_action act;
	
	public radio_steps(radio_action act)
	{
		this.act=act;
	}
	@Then("user is able to search the radio App in Operation Drop Down")
	public void user_is_able_to_search_the_radio_App_in_Operation_Drop_Down(DataTable dataTable) throws InterruptedException{	
		act.radioApp(dataTable.cell(0,0));
	}
	@Then("user is able to select radio operation menu")
	public void user_is_able_to_select_radio_operation_menu() throws InterruptedException{	
		act.radiooperationmenu();
	}

	@Then("user is able to select client in radio App")
	public void user_is_able_to_select_client_in_radio_App(DataTable dataTable) throws InterruptedException{
		act.radioclientBrandSelection(dataTable.cell(1,0),dataTable.cell(1,1));
	}
	
	@Then("user is able to click on radio export button in estimate entries page")
	public void user_is_able_to_click_on_radio_export_button_in_estimate_entries_page()throws InterruptedException{	
		act.radioestimateOutputDownload();
	}
	
	@Then("user is able to radio export radio print Estimate option")
	public void user_is_able_to_radio_export_radio_print_Estimate_option()throws InterruptedException{	
		act.radioFileDownload();	
		}
	
	@Then("user is able to select radio Schedule menu")
	public void user_is_able_to_select_radio_Schedule_menu() throws InterruptedException{	
		act.radioSchedulemenu();
	}
	@Then("user is able to select radio Release order menu")
	public void user_is_able_to_select_radio_Release_order_menu() throws InterruptedException{	
		act.radioReleaseOrdermenu();
	}
	@Then("user is able to export radio print RO option")
	public void user_is_able_to_export_radio_print_RO_option()throws InterruptedException{	
		act.radioFileRODownload();	
		}
	@Then("user is able to select radio RE menu")
	public void user_is_able_to_select_radio_RE_menu() throws InterruptedException{	
		act.radioREmenu();
	}
	@Then("user is able to export radio print RE option")
	public void user_is_able_to_export_radio_print_RE_option()throws InterruptedException{	
		act.radioFileREDownload();	
		}
	@Then("user is able to select radio Cancellation menu")
	public void user_is_able_to_select_radio_Cancellation_menu() throws InterruptedException{	
		act.radioCancellationmenu();
	}
	@Then("user is able to export radio print Cancellation option")
	public void user_is_able_to_export_radio_print_Cancellation_option()throws InterruptedException{	
		act.radioFileCancellationDownload();	
		}
	@Then("user is able to select radio MakeGood menu")
	public void user_is_able_to_select_radio_MakeGood_menu() throws InterruptedException{	
		act.radioMakeGoodmenu();
	}
	@Then("user is able to export radio print MakeGood option")
	public void user_is_able_to_export_radio_print_MakeGood_option()throws InterruptedException{	
		act.radioFileMakeGoodDownload();	
		}
	@Then("user is able to select radio WithHold menu")
	public void user_is_able_to_select_radio_WithHold_menu() throws InterruptedException{	
		act.radioWithHoldmenu();
	}
	@Then("user is able to export radio print WithHold option")
	public void user_is_able_to_export_radio_print_WithHold_option()throws InterruptedException{	
		act.radioFileWithHoldDownload();	
		}
	@Then("user is able to select radio Missed menu")
	public void user_is_able_to_select_radio_Missed_menu() throws InterruptedException{	
		act.radioMissedmenu();
	}
	@Then("user is able to export radio print Missed option")
	public void user_is_able_to_export_radio_print_Missed_option()throws InterruptedException{	
		act.radioFileMissedDownload();	
		}
	@Then("user is able to export radio RO Bulk print menu")
	public void user_is_able_to_export_radio_RO_Bulk_print_menu() throws InterruptedException{	
	//	act.radioRobulkmenu();
	}
	@Then("user pass the radio RO Date")
	public void user_pass_the_radio_RO_Date(DataTable dataTable) throws InterruptedException {
	//	act.radioPrintRobulk(dataTable.cell(1,0),dataTable.cell(1,1));	
		}
	@Then("user is able to select radio Client Bill menu")
	public void user_is_able_to_select_radio_Client_Bill_menu()throws InterruptedException{	
		act.radioclientbillmenu();	
		}
	@Then("user is able to select radio Vendor Bill menu")
	public void user_is_able_to_select_radio_Vendor_Bill_menu()throws InterruptedException{	
		act.radiovendorbillmenu();	
		}
	
}
