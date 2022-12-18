package com.educationsolution.stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooksDemo {
	@Before (order=0)
	public void beforeScenario()  {
		System.out.println("In Before Scenario");
		
		
	}
	
   @Before (value = "@OpenCloseBrowser",  order=1)
	public void beforetag1()  {
		System.out.println("In Before OpenCloseBrowser Scenario");
		
		
	}
	
	
	@Before (value = "@MainMenuVerification",  order=2)
	public void beforetag2()  {
		System.out.println("In Before MainMenu2 Scenario");
		
		
	}
	
	@Before (value = "@MarketMenuVerification",  order=3)
	public void beforetag3()  {
		System.out.println("In Before MarketMenu3 Scenario");
		
		
	}
	
	@Before (value = "@NewToMarketMenuVerification",  order=4)
	public void beforetag4()  {
		System.out.println("In Before NewToMarketMenu3 Scenario");
		
		
	}
	
	
	@Before (value = "@SuperInvestorMenuVerification",  order=5)
	public void beforetag5()  {
		System.out.println("In Before SuperInvestorMenu5 Scenario");
		
		
	}
	
	@Before (value = "@ActiveTraderMenuVerification",  order=6)
	public void beforetag6()  {
		System.out.println("In Before ActiveTraderMenu6 Scenario");
		
		
	}
	
	@Before (value = "@MutualFundsMenuVerification",  order=7)
	public void beforetag7()  {
	System.out.println("In Before MutualFundsMenu7 Scenario");
	}
	
	@Before (value = "@ResearchMenuVerification",  order=8)
	public void beforetag8()  {
	System.out.println("In Before ResearchMenu8 Scenario");
	}
	
	@Before (value = "@EducationFirstMenuVerification",  order=9)
	public void beforetag9()  {
	System.out.println("In Before EducationFirstMenu9 Scenario");
	}
	
	@Before (value = "@InstaMfMenuVerification",  order=10)
	public void beforetag10()  {
	System.out.println("In Before InstaMfMenu10 Scenario");
	}
	
	@Before (value = "@ProductsAndServicesMenuVerification",  order=11)
	public void beforetag11()  {
	System.out.println("In Before ProductsAndServicesMenu11 Scenario");
	}
	
	@Before (value = "@SharekhanLoginDatawithoutExample",  order=12)
	public void beforetag12()  {
	System.out.println("In Before SharekhanLoginDatawithoutExample12 Scenario");
	}
	
	@Before (value = "@LoginMenuBarDatawithoutExample",  order=13)
	public void beforetag13()  {
	System.out.println("In Before LoginMenuBarDatawithoutExample13 Scenario");
	}
	
	@Before (value = "@LoginMenuMarketWatchDatawithoutExample",  order=14)
	public void beforetag14()  {
	System.out.println("In Before LoginMenuMarketWatchDatawithoutExample14 Scenario");
	}
	
	@Before (value = "@LoginMenuTradeNowDatawithoutExample",  order=15)
	public void beforetag15()  {
	System.out.println("In Before LoginMenuTradeNowDatawithoutExample15 Scenario");
	}
	
	@Before (value = "@LoginMenureportsDatawithoutExample",  order=16)
	public void beforetag16()  {
	System.out.println("In Before LoginMenureportsDatawithoutExample16 Scenario");
	}
	
	@Before (value = "@LoginMenuFramesDatawithoutExample",  order=17)
	public void beforetag17()  {
	System.out.println("In Before LoginMenuFramesDatawithoutExampleDatawithoutExample17 Scenario");
	}
	
	@Before (value = "@TransferFundswithDataTable",  order=18)
	public void beforetag18()  {
	System.out.println("In Before TransferFundswithDataTable18 Scenario");
	}
	
	
	@Before (value = "@CashTransferwithDataTable",  order=19)
	public void beforetag19()  {
	System.out.println("In Before CashTransferwithDataTable Scenario");
	}
	
	@Before (value = "@AddVirtualPortfoliowithDataTable",  order=20)
	public void beforetag20()  {
	System.out.println("In Before AddVirtualPortfoliowithDataTable Scenario");
	}
	
	@Before (value = "@CreateVerifyWatchlistwithDataTable",  order=21)
	public void beforetag21()  {
	System.out.println("In Before CreateVerifyWatchlistwithDataTable Scenario");
	}
	
	
	
	@After
	public void afterScenario()  {
		System.out.println("In After OpenCloseBrowser Scenario");
	}
	
	
	@After
	public void afterScenario1()  {
		System.out.println("In After MarketMenu3 Scenario");
	}
	
	@After
	public void afterScenario3()  {
		System.out.println("In After New To Market Menu Scenario");
	}
	
	@After (value = "@MarketMenuVerification",  order=5)
	public void aftertag5()  {
		System.out.println("In After MarketMenu3 Scenario");  
		

    }
	
	
	@After (value = "@MainMenuVerification",  order=3)
	public void aftertag3()  {
		System.out.println("In After MainMenu2 Scenario");
		

    }
	
	
	@After
	public void afterScenario4()  {
		System.out.println("In After New To SuperInvestor Scenario");
	}
	
	@After
	public void afterScenario5()  {
		System.out.println("In After ActiveTrder Scenario");
	}
	
	@After
	public void afterScenario6()  {
		System.out.println("In After MutualFunds Scenario");
	}
	
	@After
	public void afterScenario7()  {
		System.out.println("In After ActiveTrader Scenario");
	}
	
	@After
	public void afterScenario8()  {
		System.out.println("In After MutualFunds Scenario");
	}
	
	@After
	public void afterScenario9()  {
		System.out.println("In After Research Scenario");
	}
	
	@After
	public void afterScenario10()  {
		System.out.println("In After EducationFirst Scenario");
	}
	
	@After
	public void afterScenario11()  {
		System.out.println("In After InstaMf Scenario");
	}
	
	@After
	public void afterScenario12()  {
		System.out.println("In After ProductsAndServices Scenario");
	}
	@After
	public void afterScenario13()  {
		System.out.println("In After SharekhanLoginDatawithoutExample12 Scenario");
	}
	
	@After
	public void afterScenario14()  {
		System.out.println("In After LoginMenuBarDatawithoutExample13 Scenario");
	}
	
	@After
	public void afterScenario15()  {
		System.out.println("In After LoginMenuMarketWatchDatawithoutExample14 Scenario");
	}
	
	@After
	public void afterScenario16()  {
		System.out.println("In After LoginMenuTradeNowDatawithoutExample15 Scenario");
	}
	
	@After
	public void afterScenario17()  {
		System.out.println("In After LoginMenureportsDatawithoutExample16 Scenario");
	}
	
	@After
	public void afterScenario18()  {
		System.out.println("In After LoginMenuFramesDatawithoutExample17 Scenario");
	}
	
	@After
	public void afterScenario19()  {
		System.out.println("In After TransferFundswithDataTable18 Scenario");
	}
	
	@After
	public void afterScenario20()  {
		System.out.println("In After CashTransferwithdataTable19 Scenario");
	}
	
	@After
	public void afterScenario21()  {
		System.out.println("In After AddVirtualPortfoliowithdataTable20 Scenario");
	}
	
	@After
	public void afterScenario22()  {
		System.out.println("In After CreateVerifyWatchlistwithdataTable21 Scenario");
	}
	
}
