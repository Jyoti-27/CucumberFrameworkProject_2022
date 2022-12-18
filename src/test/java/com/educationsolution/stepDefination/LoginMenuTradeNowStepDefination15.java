package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.LoginMenuTradeNowPage15;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMenuTradeNowStepDefination15 {
	
	
	static Logger log=LogManager.getLogger(LoginMenuTradeNowStepDefination15.class);
	@When("user clicks on TradeNow Button on LoginMenuBar")
	public void user_clicks_on_trade_now_button_on_login_menu_bar() {
		LoginMenuTradeNowPage15.clickLobinbtn();
		//LoginMenuTradeNowPage15.cickElement("TradeNow_xpath");
		log.info("LoginMenuTradeNow button is clicked and dashboard is displayed");
	}

	@Then("user should able to see TradeNow Button page on LoginMenuBar")
	public void user_should_able_to_see_trade_now_button_page_on_login_menu_bar() {
		LoginMenuTradeNowPage15.dashBoardDisplayCheck();
		log.info("TradeNow menu is displayed successful");
	}

}
