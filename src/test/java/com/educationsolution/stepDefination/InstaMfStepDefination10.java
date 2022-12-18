package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.InstaMfPage10;
import com.educationsolution.pom.MutualFundsPage7;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstaMfStepDefination10 {
	
static Logger log = LogManager.getLogger(InstaMfStepDefination10.class);
@Given("user is on the InstaMf Menu option on sharekhan website")
public void user_is_on_the_insta_mf_menu_option_on_sharekhan_website() {
	InstaMfPage10.cickElement("InstaMf_btn_xpath");
	log.info("User is on InstaMf menu option");
}

@When("user clicks on InstaMf Menu button")
public void user_clicks_on_insta_mf_menu_button() {
	InstaMfPage10.cickElement("InstaMf_btn_xpath");
	log.info("User is on InstaMf menu option");
}

@Then("user now able to see all options InstaMf Menu option on Sharekhan Website")
public void user_now_able_to_see_all_options_insta_mf_menu_option_on_sharekhan_website() {
	InstaMfPage10.dashBoardDisplayCheck2();
	log.info("User is able to see InstaMf menu all option");
}

}
