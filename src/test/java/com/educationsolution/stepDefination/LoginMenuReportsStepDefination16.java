package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.LoginMenuReportsPage16;
import com.educationsolution.pom.LoginMenuTradeNowPage15;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMenuReportsStepDefination16 {
	
	static Logger log=LogManager.getLogger(LoginMenuReportsStepDefination16.class);
	@When("user clicks on Reports Button on LoginMenuBar")
	public void user_clicks_on_reports_button_on_login_menu_bar() {
		LoginMenuReportsPage16.clickLobinbtn();
		log.info("LoginMenuReports button is clicked and dashboard is displayed");
	}

	@Then("user should able to see Reports Button page on LoginMenuBar")
	public void user_should_able_to_see_reports_button_page_on_login_menu_bar() {
		LoginMenuReportsPage16.dashBoardDisplayCheck();
		log.info("Reports menu is displayed successful");
	}

}
