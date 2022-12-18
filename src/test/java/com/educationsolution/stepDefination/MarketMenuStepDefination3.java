package com.educationsolution.stepDefination;

import com.educationsolution.pom.MarketMenuPage3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MarketMenuStepDefination3 {
	
	static Logger log = LogManager.getLogger(MarketMenuStepDefination3.class);


@Given("user is on the main Market option on sharekhan website")
public void user_is_on_the_main_market_option_on_sharekhan_website() {
	MarketMenuPage3.cickElement("market_menu_btn_xpath");
	log.info("User is on market menu option");
}

@When("user clicks on Market menu button")
public void user_clicks_on_market_menu_button() {
	MarketMenuPage3.cickElement("market_menu_btn_xpath");
	//MarketMenuPage3.cickElement(WebElement market_menu_btn_xpath);
	//MarketMenuPage3.cickElement(By String);
	log.info("User is on market menu option");
}

@When("user sees all options on Market menu")
public void user_sees_all_options_on_market_menu() {
	MarketMenuPage3.dashBoardDisplayCheck1();
	log.info("User is on market menu option");
}

@Then("user now able to see all options Market menu option on Sharekhan Website")
public void user_now_able_to_see_all_options_market_menu_option_on_sharekhan_website() {
	MarketMenuPage3.dashBoardDisplayCheck2();
	log.info("User is able to see market menu all option");
}

}
