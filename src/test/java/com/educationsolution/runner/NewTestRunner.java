package com.educationsolution.runner;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import com.educationsolution.stepDefination.BrowserLaunchCloseStepDefination1;
import com.educationsolution.stepDefination.MainMenuStepDefination2;
import com.educationsolution.stepDefination.MarketMenuStepDefination3;
import com.educationsolution.stepDefination.NewToMarketStepDefination4;
import com.educationsolution.stepDefination.SuperInvestorStepDefination5;
import com.educationsolution.stepDefination.ActiveTraderStepDefination6;
import com.educationsolution.stepDefination.MutualFundsStepDefination7;
import com.educationsolution.stepDefination.ResearchStepDefination8;
import com.educationsolution.stepDefination.EducationFirstStepDefination9;
import com.educationsolution.stepDefination.InstaMfStepDefination10;
import com.educationsolution.stepDefination.ProductsAndServicesStepDefination11;
import com.educationsolution.stepDefination.LoginStepDefination12;
import com.educationsolution.stepDefination.LoginMenuBarStepDefination13;
import com.educationsolution.stepDefination.LoginMenuMarketWatchStepDefination14;
import com.educationsolution.stepDefination.LoginMenuTradeNowStepDefination15;
import com.educationsolution.stepDefination.LoginMenuReportsStepDefination16;
import com.educationsolution.stepDefination.LoginMenuFramesStepDefination17;
import com.educationsolution.stepDefination.TransferFundsStepDefination18;
import com.educationsolution.stepDefination.CashTransferStepDefination19;
import com.educationsolution.stepDefination.AddVirtualPortfolioStepDefination20;
import com.educationsolution.stepDefination.CreateVerifyWatchlistStepDefination21;
//import com.educationsolution.stepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@SuppressWarnings("unused")
@RunWith(Cucumber.class)
	
	@CucumberOptions(
			features =  "src\\test\\resources\\FeatureFile",
			//,glue = {"com.educationsolution.BrowserLaunchCloseStepDefination1"},
			//,glue = {"com.educationsolution.MainMenuStepDefination2"},
           // ,glue = {"com.educationsolution.MarketMenuStepDefination3"},
             glue = {"com.educationsolution.stepDefination"},
			
			//,glue = {"com.educationsolution.MainMenuPage2"},
			//name = {"com.educationsolution.BrowserLaunchCloseStepDefination1"},
			
			
			dryRun = true,
			
			monochrome = true,
			//tags = "@smoke and not @ignore"
			//tags = "@OrangeHRMLogin"
		    //tags = "@datatable"
			//tags = "@datawithoutExample"
			//tags="@test and not@Login1"
			//tags="@datawithoutExample or @datawithExample"     
			
			
			//tags = "@OpenCloseBrowser or @MainMenuVerification",
			//tags = "@MainMenuVerification",
							
			
		   //tags = "@OpenCloseBrowser and @MarketMenuVerification",
		   //tags = "@MarketMenuVerification",	
		   //tags = "@OpenCloseBrowser and @MainMenuVerification and @MarketMenuVerification",
		  
			
		
			
			
tags = "@OpenCloseBrowser or @MainMenuVerification or @MarketMenuVerification or @NewToMarketMenuVerification or @SuperInvestorMenuVerification or @ActiveTraderMenuVerification or @MutualFundsMenuVerification or @ResearchMenuVerification or @EducationFirstMenuVerification or @InstaMfMenuVerification or @ProductsAndServicesMenuVerification or @SharekhanLoginDatawithoutExample or @LoginMenuBarDatawithoutExample or @LoginMenuMarketWatchDatawithoutExample or @LoginMenuTradeNowDatawithoutExample or @LoginMenureportsDatawithoutExample or @LoginMenuFramesDatawithoutExample or @TransferFundswithDataTable or @CashTransferwithDataTable or @AddVirtualPortfoliowithDataTable or @CreateVerifyWatchlistwithDataTable",
			
		      // tags =	"@OpenCloseBrowser or @SharekhanLoginDatawithoutExample or @LoginMenuTradeNowDatawithoutExample or @LoginMenureportsDatawithoutExample or @TransferFundswithDataTable or @CashTransferwithDataTable",
		      // tags = "@LoginMenuFramesDatawithoutExample",
		       
//tags = "@OpenCloseBrowser or @MainMenuVerification  or @TransferFundswithDataTable or @CashTransferwithDataTable or @AddVirtualPortfoliowithDataTable or @CreateVerifyWatchlistwithDataTable",

plugin= {"pretty","html:target/cucumber-reports/reports.html",
			                "json:target/cucumber-reports/cucumber.json",
			                  "junit:target/cucumber-reports/cucumber.xml",
			                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
			               
			    
			        )

			public class NewTestRunner {
				
			
				

		}

