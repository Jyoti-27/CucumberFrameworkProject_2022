package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.educationsolution.pom.NewToMarketPage4;
import com.educationsolution.pom.SuperInvestorPage5;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuperInvestorStepDefination5 {
	
	static Logger log = LogManager.getLogger(SuperInvestorStepDefination5.class);
	@Given("user is on the SuperInvestor Menu option on sharekhan website")
	public void user_is_on_the_super_investor_menu_option_on_sharekhan_website() {
		SuperInvestorPage5.cickElement("Super_Investor_Menu_btn_xpath");
		log.info("User is on SuperInvestor menu option");
	}

	@When("user clicks on SuperInvestor Menu button")
	public void user_clicks_on_super_investor_menu_button() {
		SuperInvestorPage5.cickElement("Super_Investor_Menu_btn_xpath");
		log.info("User is on SuperInvestor menu option");
	}

	@Then("user now able to see all options SuperInvestor Menu option on Sharekhan Website")
	public void user_now_able_to_see_all_options_super_investor_menu_option_on_sharekhan_website() {
		SuperInvestorPage5.dashBoardDisplayCheck2();
		log.info("User is able to SuperInvestor menu all option");
	}

	

}
