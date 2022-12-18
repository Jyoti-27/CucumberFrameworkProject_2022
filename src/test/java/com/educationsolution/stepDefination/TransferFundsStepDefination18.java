package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.educationsolution.pom.TransferFundsPage18;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferFundsStepDefination18 {
	
	static Logger log=LogManager.getLogger(TransferFundsStepDefination18.class);

	
	@Given("user is already logged in and is on Dashboard page")
	public void user_is_already_logged_in_and_is_on_dashboard_page() {
		TransferFundsPage18.login(toString(), toString());
		TransferFundsPage18.clickLobinbtn();
		TransferFundsPage18.dashBoardDisplayCheck();
	    log.info("Login is completed");
		TransferFundsPage18.dashBoardDisplayCheck();
		log.info("Logged Page is displayed successful");
	}

	@When("user click on Account Option and enters the data on Account Option Page")
	public void user_click_on_account_option_and_enters_the_data_on_account_option_page(io.cucumber.datatable.DataTable dataTable) {
	    // throw new io.cucumber.java.PendingException();
		TransferFundsPage18.enterTransferFundsForm();
		log.info("Assign leave form is filled");
	}

	@When("user clicks on Transfer Fund button")
	public void user_clicks_on_transfer_fund_button() {
		TransferFundsPage18.cickElement("TransferFunds_class");
		log.info("Transfer Fund button is clicked");
	}

	@Then("user should able to see Transfer the Fund successfully")
	public void user_should_able_to_see_transfer_the_fund_successfully() {
		TransferFundsPage18.TransferFundsSucessCheck();
		log.info("TransferFund is applied successfully");
	}
}
