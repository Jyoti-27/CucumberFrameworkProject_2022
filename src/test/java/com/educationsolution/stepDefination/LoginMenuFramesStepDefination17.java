package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.LoginMenuFramesPage17;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMenuFramesStepDefination17 {
	
	
	static Logger log=LogManager.getLogger(LoginMenuFramesStepDefination17.class);
	@When("user clicks on LoginMenuFrame Button on LoginMenuBar")
	public void user_clicks_on_login_menu_frame_button_on_login_menu_bar() {
		LoginMenuFramesPage17.clickLobinbtn();
		log.info("LoginMenuReports button is clicked and dashboard is displayed");
	}

	@Then("user should able to see LoginMenuFrame Button page on LoginMenuBar")
	public void user_should_able_to_see_login_menu_frame_button_page_on_login_menu_bar() throws InterruptedException {
		LoginMenuFramesPage17.dashBoardDisplayCheck();
		log.info("Reports menu is displayed successful");
	}

}
