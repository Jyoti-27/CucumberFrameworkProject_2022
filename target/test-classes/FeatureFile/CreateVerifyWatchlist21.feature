Feature:  To Create and verify Watchlist validation on sharekhan's website 
@CreateVerifyWatchlistwithDataTable
Scenario:  Verify user is able to Create and verify Watchlist
Given user is already logged in and is on Dashboard page 
When user clicks on MarketWatch option and again click on to Create Watchlist option and enters the data and verify watchlist 
|Enter Watchlist name|Scrip Name1|Scrip Name2|
|Watchlist1|WINPRO|WILLAMAGOR|
And user clicks on OK Button to create and display watchlist  
Then user should be able to see watchlist successfully 