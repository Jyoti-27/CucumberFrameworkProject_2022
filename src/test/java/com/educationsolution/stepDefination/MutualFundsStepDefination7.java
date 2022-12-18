package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.educationsolution.pom.ActiveTraderPage6;
import com.educationsolution.pom.MutualFundsPage7;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MutualFundsStepDefination7 {
	
	static Logger log = LogManager.getLogger(MutualFundsStepDefination7.class);
	@Given("user is on the MutualFunds Menu option on sharekhan website")
	public void user_is_on_the_mutual_funds_menu_option_on_sharekhan_website() {
		MutualFundsPage7.cickElement("Mutual_Funds_Menu_btn_xpath=");
		log.info("User is on MutualFunds menu option");
	}

	@When("user clicks on MutualFunds Menu button")
	public void user_clicks_on_mutual_funds_menu_button() {
		MutualFundsPage7.cickElement("Mutual_Funds_Menu_btn_xpath=");
		log.info("User is on MutualFunds menu option");
	}

	@Then("user now able to see all options MutualFunds Menu option on Sharekhan Website")
	public void user_now_able_to_see_all_options_mutual_funds_menu_option_on_sharekhan_website() {
		MutualFundsPage7.dashBoardDisplayCheck2();
		log.info("User is able to see MutualFunds menu all option");
	}

}
