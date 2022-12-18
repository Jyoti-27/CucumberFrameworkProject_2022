package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.educationsolution.pom.BrowserLaunchClosePage1;
import com.educationsolution.pom.MainMenuPage2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class MainMenuStepDefination2 {

	static Logger log = LogManager.getLogger(MainMenuStepDefination2.class);

	@Given("user is on the main menu option on sharekhan website")
	public void user_is_on_the_main_menu_option_on_sharekhan_website() {
		MainMenuPage2.cickElement("main_menu_btn_linkText");
		log.info("User is on main menu option");
	}
	
	@When("user clicks on main menu button")
	public void user_clicks_on_main_menu_button() {
		MainMenuPage2.cickElement("main_menu_btn_linkText");
		log.info("User is on main menu option");
	}

    @Then("user now able to see all options main menu option on Sharekhan Website")
    public void user_now_able_to_see_all_options_main_menu_option_on_sharekhan_website() {
    	MainMenuPage2.dashBoardDisplayCheck1();
		log.info("User can able to see main menu option");
    }
    
}

