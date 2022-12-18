package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.AddVirtualPortfolioPage20;
import com.educationsolution.pom.CreateVerifyWatchlistPage21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateVerifyWatchlistStepDefination21 {
	
	
	static Logger log=LogManager.getLogger(CreateVerifyWatchlistStepDefination21.class);
	@When("user clicks on MarketWatch option and again click on to Create Watchlist option and enters the data and verify watchlist")
	public void user_clicks_on_market_watch_option_and_again_click_on_to_create_watchlist_option_and_enters_the_data_and_verify_watchlist(io.cucumber.datatable.DataTable dataTable) {
		CreateVerifyWatchlistPage21.cickElement("MarketWatchButton_xpath");
		CreateVerifyWatchlistPage21.cickElement("CreateWatchlist_xpath");
		CreateVerifyWatchlistPage21.cickElement("ADDBtn_xpath");
	
		
		log.info("Marketwatch and Create Watchlist option is clicked and entered the data");
	}

	@When("user clicks on OK Button to create and display watchlist")
	public void user_clicks_on_ok_button_to_create_and_display_watchlist() {
		CreateVerifyWatchlistPage21.cickElement("OkBtn_xpath");
		log.info("OK button is clicked to create watchlist");
	}

	@Then("user should be able to see watchlist successfully")
	public void user_should_be_able_to_see_watchlist_successfully() {
		CreateVerifyWatchlistPage21.dashBoardDisplayCheck("VirtualPortfolio_xpath");
		log.info("Create Watchlist is successfully");
	}

}
