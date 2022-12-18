package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.AddVirtualPortfolioPage20;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddVirtualPortfolioStepDefination20 {
	
	
	static Logger log=LogManager.getLogger(AddVirtualPortfolioStepDefination20.class);
	@When("user clicks on Portfolio Option to ADD VIRTUAL PORTFOLIO option and enters the data in Portfolio folder")
	public void user_clicks_on_portfolio_option_to_add_virtual_portfolio_option_and_enters_the_data_in_portfolio_folder(io.cucumber.datatable.DataTable dataTable) {
		AddVirtualPortfolioPage20.cickElement("OpenPortfolio_xpath");
		AddVirtualPortfolioPage20.cickElement("AddVirtualPortfolio_class");
		AddVirtualPortfolioPage20.cickElement("VirtualFolder_name");
		AddVirtualPortfolioPage20.cickElement("AddFolderBtn_class");
		
		log.info("Virtual Portfolio is clicked and entered the data");
	}

	@When("user clicks on add scrip for adding the stock")
	public void user_clicks_on_add_scrip_for_adding_the_stock() {
		AddVirtualPortfolioPage20.cickElement("ADDSCRIP_class");
		AddVirtualPortfolioPage20.cickElement("ScripDate_class");
		AddVirtualPortfolioPage20.cickElement("Transaction_class");
		
		
		log.info("Add scrip is clicked for adding the stock");
	}

	@Then("user should able to see the added scrip in virtual portfolio successfully")
	public void user_should_able_to_see_the_added_scrip_in_virtual_portfolio_successfully() {
		AddVirtualPortfolioPage20.dashBoardDisplayCheck("VirtualPortfolio_xpath");
		log.info("Virtual Portfolio is added successfully");
	}
}









