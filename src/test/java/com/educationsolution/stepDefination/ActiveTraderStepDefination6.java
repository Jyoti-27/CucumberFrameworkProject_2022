package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.ActiveTraderPage6;
//import com.educationsolution.pom.SuperInvestorPage5;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActiveTraderStepDefination6 {
	
	static Logger log = LogManager.getLogger(ActiveTraderStepDefination6.class);
	@Given("user is on the ActiveTrader Menu option on sharekhan website")
	public void user_is_on_the_active_trader_menu_option_on_sharekhan_website() {
		ActiveTraderPage6.cickElement("Active_Trader_Menu_btn_xpath");
		log.info("User is on ActiveTrader menu option");
	}

	@When("user clicks on ActiveTrader Menu button")
	public void user_clicks_on_active_trader_menu_button() {
		ActiveTraderPage6.cickElement("Active_Trader_Menu_btn_xpath");
		log.info("User is on ActiveTrader menu option");
	}

	@Then("user now able to see all options ActiveTrader Menu option on Sharekhan Website")
	public void user_now_able_to_see_all_options_active_trader_menu_option_on_sharekhan_website() {
		ActiveTraderPage6.dashBoardDisplayCheck2();
		log.info("User is able to see ActiveTrader menu all option");
	}

}
