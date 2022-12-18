package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.MutualFundsPage7;
import com.educationsolution.pom.ResearchPage8;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResearchStepDefination8 {
	
	static Logger log = LogManager.getLogger(ResearchStepDefination8.class);
		@Given("user is on the Research Menu option on sharekhan website")
		public void user_is_on_the_research_menu_option_on_sharekhan_website() {
			ResearchPage8.cickElement("Research_btn_xpath");
			log.info("User is on Research menu option");
		}

		@When("user clicks on Research Menu button")
		public void user_clicks_on_research_menu_button() {
			ResearchPage8.cickElement("Research_btn_xpath");
			log.info("User is on Research menu option");
		}

		@Then("user now able to see all options Research Menu option on Sharekhan Website")
		public void user_now_able_to_see_all_options_research_menu_option_on_sharekhan_website() {
			ResearchPage8.dashBoardDisplayCheck2();
			log.info("User is able to see Research menu all option");
		}


}
