package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.LoginPage12;
import com.educationsolution.stepDefination.LoginStepDefination12;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class LoginStepDefination12 {
		
	static Logger log=LogManager.getLogger(LoginStepDefination12.class);
	
	@Given("user is login screen")
	public void user_is_login_screen() {
		LoginPage12.loginPageDisplayCheck();
		log.info("login check is completed");
	}

	
	@When("user enters LoginID as {string} and MembershipPassword as {string} on login page")
	public void user_enters_login_id_as_and_membership_password_as_on_login_page(String LoginID, String MembershipPassword) {
		 LoginPage12.login(LoginID,MembershipPassword);
		 log.info("login information is entered");
	}


	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		LoginPage12.clickLobinbtn();
		log.info("login button is clicked");
	}
	

	@Then("user should able to see dashboard page")
	public void user_should_able_to_see_dashboard_page() {
		LoginPage12.dashBoardDisplayCheck();
		log.info("login is successful");
	}
}