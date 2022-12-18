@TransferFundswithDataTable
Feature:  Sharekhan TransferFunds validation 
Scenario:  Verify user is able to Transfer the Funds
Given user is already logged in and is on Dashboard page 
When user click on Account Option and enters the data on Account Option Page 
|BankToEquityAmount|EquityToBankSegment|PaymentModeOption|TransferFunds|BankDetails|
|5|Equity Trading A/C|Netbanking|Transfer funds button is clicked successfully|Add fund report is succeessfully|
And user clicks on Transfer Fund button
Then user should able to see Transfer the Fund successfully
