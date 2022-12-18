package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.LoginMenuBarPage13;
import com.educationsolution.pom.LoginPage12;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMenuBarStepDefination13 {
static Logger log=LogManager.getLogger(LoginMenuBarStepDefination13.class);
	
	/*@Given("user is login screen")
	public void user_is_login_screen() {
		LoginPage12.loginPageDisplayCheck();
		log.info("login check is completed");
	}

	
	@When("user enters LoginID as {string} and MembershipPassword as {string} on login page")
	public void user_enters_login_id_as_and_membership_password_as_on_login_page(String LoginID, String MembershipPassword) {
		 LoginPage12.login(LoginID,MembershipPassword);
		 log.info("login information is entered");;
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
}*/
	@Given("user is on login screen")
	public void user_is_on_login_screen() {
		LoginMenuBarPage13.loginPageDisplayCheck();
		log.info("login check is completed");
	}

	@When("user clicks on LoginID as {string} and MembershipPassword as {string} on login page")
	public void user_clicks_on_login_id_as_and_membership_password_as_on_login_page(String LoginID, String MembershipPassword) {
		LoginMenuBarPage13.login(LoginID,MembershipPassword);
		 log.info("login information is entered");;
	}

	@When("user clicks on Login button to see dashboard page")
	public void user_clicks_on_login_button_to_see_dashboard_page() {
		LoginMenuBarPage13.clickLobinbtn();
		log.info("login button is clicked and dashboard is displayed");
	}

	@When("user clicks on Accounts Button on LoginMenuBar")
	public void user_clicks_on_accounts_button_on_login_menu_bar() {
		LoginMenuBarPage13.clickAccountnBtn();
		log.info("Account menu is clicked and displayed");
	}

	@Then("user should able to see Accounts Button page on LoginMenuBar")
	public void user_should_able_to_see_accounts_button_page_on_login_menu_bar() {
		LoginPage12.dashBoardDisplayCheck();
		log.info("Account menu is displayed successful");
	}

}
