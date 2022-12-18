package com.educationsolution.stepDefination;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.LoginMenuMarketWatchPage14;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMenuMarketWatchStepDefination14 {
	
	static Logger log=LogManager.getLogger(LoginMenuMarketWatchStepDefination14.class);
	@When("user clicks on MarketWatch Button on LoginMenuBar")
	public void user_clicks_on_market_watch_button_on_login_menu_bar() {
		LoginMenuMarketWatchPage14.clickLobinbtn();
		log.info("LoginMenuMarketWatch button is clicked and dashboard is displayed");
	}

	@Then("user should able to see MarketWatch Button page on LoginMenuBar")
	public void user_should_able_to_see_market_watch_button_page_on_login_menu_bar() {
		LoginMenuMarketWatchPage14.dashBoardDisplayCheck();
		log.info("MarketWatch menu is displayed successful");
	}

}
