@SharekhanLoginDatawithoutExample
Feature: Sharekhan Login validation with datawithoutExample
Scenario:  login to Sharekhan application
Given user is login screen
When user enters LoginID as "<3481931>" and MembershipPassword as "<Jy@2714#*>" on login page
And user clicks on Login button
Then user should able to see dashboard page
