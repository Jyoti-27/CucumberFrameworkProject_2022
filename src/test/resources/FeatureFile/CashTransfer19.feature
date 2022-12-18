@CashTransferwithDataTable
Feature:  Sharekhan CashTransfer validation 
Scenario:  Verify user is able to Cash Transfer 
Given user is already logged in and is on Dashboard page 
When user click on Account Option and enters the data on Account Option Page 
|BankToEquityAmount|EquityToBankSegment|PaymentModeOption|IPOA/C|TransferFunds|BankDetails|
|1|IPOToBank|Netbanking|IPO A/C is selected|Cash Transfer button is clicked successfully|Add cash report is succeessfully|
And user clicks on Cash Transfer button 
Then user should able to see Cash Transfer successfully
