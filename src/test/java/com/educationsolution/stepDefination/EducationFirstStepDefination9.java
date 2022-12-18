package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.EducationFirstPage9;
import com.educationsolution.pom.MutualFundsPage7;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EducationFirstStepDefination9 {
	
	static Logger log = LogManager.getLogger(EducationFirstStepDefination9.class);
	@Given("user is on the EducationFirst Menu option on sharekhan website")
	public void user_is_on_the_education_first_menu_option_on_sharekhan_website() {
		EducationFirstPage9.cickElement("EducationFirst_btn_xpath");
		log.info("User is on EducationFirst menu option");
	}

	@When("user clicks on EducationFirst Menu button")
	public void user_clicks_on_education_first_menu_button() {
		EducationFirstPage9.cickElement("EducationFirst_btn_xpath");
		log.info("User is on EducationFirst menu option");
	}

	@Then("user now able to see all options EducationFirst Menu option on Sharekhan Website")
	public void user_now_able_to_see_all_options_education_first_menu_option_on_sharekhan_website() {
		EducationFirstPage9.dashBoardDisplayCheck2();
		log.info("User is able to see EducationFirst menu all option");
	}

}
