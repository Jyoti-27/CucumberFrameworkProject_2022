package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.CashTransferPage19;
import com.educationsolution.pom.TransferFundsPage18;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CashTransferStepDefination19 {
	
	static Logger log=LogManager.getLogger(CashTransferStepDefination19.class);
	@When("user clicks on Cash Transfer button")
	public void user_clicks_on_cash_transfer_button() {
		CashTransferPage19.cickElement("TransferFunds_class");
		log.info("Transfer Fund button is clicked for transferring cash");
	}

	@Then("user should able to see Cash Transfer successfully")
	public void user_should_able_to_see_cash_transfer_successfully() {
		CashTransferPage19.TransferFundsSucessCheck();
		log.info("TransferFund is applied successfully");
	}

}
