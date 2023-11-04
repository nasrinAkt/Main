package Main_StepDefinition;

import Main_PageAction.Main_LoginPageAction;
import Main_Utility.Main_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Main_Login extends Main_Base {
	Main_LoginPageAction main_LoginPageAction = new Main_LoginPageAction();
	
	@Given("^Open <\"([^\"]*)\"> mai$")
	public void open_mai(String URL) throws Throwable {
		MaiLaunchURL(URL);
	}

	@Then("^click mai paychex login link$")
	public void click_mai_paychex_login_link() throws Throwable {
		main_LoginPageAction.clickmaipaychexloginlink(); 
	}

	@Then("^goto next come back to first window$")
	public void goto_next_come_back_to_first_window() throws Throwable {
		main_LoginPageAction.gotonextcomebacktofirstwindow();
	}



	

}
