package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.educationsolution.pom.MutualFundsPage7;
import com.educationsolution.pom.ProductsAndServicesPage11;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsAndServicesStepDefination11 {
	
	static Logger log = LogManager.getLogger(ProductsAndServicesStepDefination11.class);
	@Given("user is on the ProductsAndServices Menu option on sharekhan website")
	public void user_is_on_the_products_and_services_menu_option_on_sharekhan_website() {
		ProductsAndServicesPage11.cickElement("products_and_services_menu_btn_xpath");
		log.info("User is on ProductsAndServices menu option");
	}

	@When("user clicks on ProductsAndServices Menu button")
	public void user_clicks_on_products_and_services_menu_button() {
		ProductsAndServicesPage11.cickElement("products_and_services_menu_btn_xpath");
		log.info("User is on ProductsAndServices menu option");
	}

	@Then("user now able to see all options ProductsAndServices Menu option on Sharekhan Website")
	public void user_now_able_to_see_all_options_products_and_services_menu_btn_option_on_sharekhan_website() {
		ProductsAndServicesPage11.dashBoardDisplayCheck2();
		log.info("User is able to see ProductsAndServices menu all option");
	}

}
