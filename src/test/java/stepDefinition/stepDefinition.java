package stepDefinition;
import org.openqa.selenium.WebDriver;
import action.common_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
//import webElements.webElements;
public class stepDefinition
{
	//webElements element; 
	WebDriver driver;
	//driver = new chromeDriver();
	globalHooks globalhook;
	common_actions act;
	
	public stepDefinition(common_actions act)
	{
		this.act=act;
	}
	
	@Then("user is able to search the TV App in Operation Drop Down")
	public void user_is_able_to_search_the_TV_App_in_Operation_Drop_Down(DataTable dataTable) throws InterruptedException{	
		act.TVApp(dataTable.cell(0,0));
	}
	@Then("user is able to select tv operation menu")
	public void user_is_able_to_select_tv_operation_menu() throws InterruptedException{	
		act.operationmenu();
	}

	@Then("user is able to select client in TV App")
	public void user_is_able_to_select_client_in_TV_App(DataTable dataTable) throws InterruptedException{
		act.clientBrandSelection(dataTable.cell(1,0),dataTable.cell(1,1));
	}
	
	@Then("user is able to click on export button in estimate entries page")
	public void user_is_able_to_click_on_export_button_in_estimate_entries_page()throws InterruptedException{	
		act.estimateOutputDownload();
	}
	
	@Then("user is able to export print Estimate option")
	public void user_is_able_to_export_print_Estimate_option()throws InterruptedException{	
		act.FileDownload();	
		}
	
	@Then("user is able to select tv Schedule menu")
	public void user_is_able_to_select_tv_Schedule_menu() throws InterruptedException{	
		act.Schedulemenu();
	}
	@Then("user is able to select tv Release order menu")
	public void user_is_able_to_select_tv_Release_order_menu() throws InterruptedException{	
		act.ReleaseOrdermenu();
	}
	@Then("user is able to export print RO option")
	public void user_is_able_to_export_print_RO_option()throws InterruptedException{	
		act.FileRODownload();	
		}
	@Then("user is able to select tv RE menu")
	public void user_is_able_to_select_tv_RE_menu() throws InterruptedException{	
		act.REmenu();
	}
	@Then("user is able to export print RE option")
	public void user_is_able_to_export_print_RE_option()throws InterruptedException{	
		act.FileREDownload();	
		}
	@Then("user is able to select tv Cancellation menu")
	public void user_is_able_to_select_tv_Cancellation_menu() throws InterruptedException{	
		act.Cancellationmenu();
	}
	@Then("user is able to export print Cancellation option")
	public void user_is_able_to_export_print_Cancellation_option()throws InterruptedException{	
		act.FileCancellationDownload();	
		}
	@Then("user is able to select tv MakeGood menu")
	public void user_is_able_to_select_tv_MakeGood_menu() throws InterruptedException{	
		act.MakeGoodmenu();
	}
	@Then("user is able to export print MakeGood option")
	public void user_is_able_to_export_print_MakeGood_option()throws InterruptedException{	
		act.FileMakeGoodDownload();	
		}
	@Then("user is able to select tv WithHold menu")
	public void user_is_able_to_select_tv_WithHold_menu() throws InterruptedException{	
		act.WithHoldmenu();
	}
	@Then("user is able to export print WithHold option")
	public void user_is_able_to_export_print_WithHold_option()throws InterruptedException{	
		act.FileWithHoldDownload();	
		}
	@Then("user is able to select tv Missed menu")
	public void user_is_able_to_select_tv_Missed_menu() throws InterruptedException{	
		act.Missedmenu();
	}
	@Then("user is able to export print Missed option")
	public void user_is_able_to_export_print_Missed_option()throws InterruptedException{	
		act.FileMissedDownload();	
		}
	@Then("user is able to export RO Bulk print menu")
	public void user_is_able_to_export_RO_Bulk_print_menu() throws InterruptedException{	
	//	act.Robulkmenu();
	}
	@Then("user pass the RO Date")
	public void user_pass_the_RO_Date(DataTable dataTable) throws InterruptedException {
	//	act.PrintRobulk(dataTable.cell(1,0),dataTable.cell(1,1));	
		}
	@Then("user is able to select TV Monitoring menu")
	public void user_is_able_to_select_TV_Monitoring_menu()throws InterruptedException{	
		act.TvMonitoringmenu();	
		}
	@Then("user is able to select Client Bill menu")
	public void user_is_able_to_select_Client_Bill_menu()throws InterruptedException{	
		act.clientbillmenu();	
		}
	@Then("user is able to select Vendor Bill menu")
	public void user_is_able_to_select_Vendor_Bill_menu()throws InterruptedException{	
		act.vendorbillmenu();	
		}
	
}
