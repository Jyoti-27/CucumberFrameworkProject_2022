Feature:  To add and verify Virtual Portfolio validation on sharekhan's website 
@AddVirtualPortfoliowithDataTable
Scenario:  Verify user is able to Add Virtual Portfolio
Given user is already logged in and is on Dashboard page 
When user clicks on Portfolio Option to ADD VIRTUAL PORTFOLIO option and enters the data in Portfolio folder 
|ADD VIRTUAL PORTFOLIO|ADD SCRIP|ADD SCRIP|Transaction|Transaction|Price|Price|Quantity|Quantity|MyPortfolio|
|Test|WINPRO|WILLAMAGOR|Buy|Buy|3.65|19.65|1|1|stock added successfully|
And user clicks on add scrip for adding the stock  
Then user should able to see the added scrip in virtual portfolio successfully 




