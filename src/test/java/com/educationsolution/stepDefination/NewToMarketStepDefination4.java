package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.MarketMenuPage3;
import com.educationsolution.pom.NewToMarketPage4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewToMarketStepDefination4 {
	
	static Logger log = LogManager.getLogger(NewToMarketStepDefination4.class);
	@Given("user is on the NewToMarket Market option on sharekhan website")
	public void user_is_on_the_new_to_market_market_option_on_sharekhan_website() {
		NewToMarketPage4.cickElement("New_to_Market_Menu_btn_xpath");
		log.info("User is on new to market menu option");
	}

	@When("user clicks on NewToMarket menu button")
	public void user_clicks_on_new_to_market_menu_button() {
		NewToMarketPage4.cickElement("New_to_Market_Menu_btn_xpath");
		//MarketMenuPage3.cickElement(WebElement market_menu_btn_xpath);
		//MarketMenuPage3.cickElement(By String);
		log.info("User is on new to market menu option");
	}

	@Then("user now able to see all options NewToMarket menu option on Sharekhan Website")
	public void user_now_able_to_see_all_options_new_to_market_menu_option_on_sharekhan_website() {
		NewToMarketPage4.dashBoardDisplayCheck2();
		log.info("User is able to see new to market menu all option");
	}


}