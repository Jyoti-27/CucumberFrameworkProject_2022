package com.educationsolution.runner;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.educationsolution.stepDefination.BrowserLaunchCloseStepDefination1;
//import com.educationsolution.stepDefination.MainMenuStepDefination2;
import com.educationsolution.stepDefination.MarketMenuStepDefination3;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@SuppressWarnings("unused")
@SuppressWarnings("unused")
@RunWith(Cucumber.class)
	
	@CucumberOptions(
			features =  "src\\test\\resources\\FeatureFile"
			//,glue = {"com.educationsolution.BrowserLaunchCloseStepDefination1"},
			//,glue = {"com.educationsolution.MainMenuStepDefination2"},
            ,glue = {"com.educationsolution.MarketMenuStepDefination3"},
			
			
			//,glue = {"com.educationsolution.MainMenuPage2"},
			//name = {"com.educationsolution.BrowserLaunchCloseStepDefination1"},
			
			
			dryRun = true,
			
			//monochrome = false,
			//tags = "@smoke and not @ignore"
			//tags = "@OrangeHRMLogin"
		    //tags = "@datatable"
			//tags = "@datawithoutExample"
			//tags="@test and not@Login1"
			//tags="@datawithoutExample or @datawithExample"     
			
			
			//tags = "@OpenCloseBrowser or @MainMenuVerification",
			//	tags = "@MainMenuVerification",
							
			
		//tags = "@OpenCloseBrowser and @MarketMenuVerification",
				tags = "@MarketMenuVerification",	
					
					plugin= {"pretty","html:target/cucumber-reports/reports.html",
			                "json:target/cucumber-reports/cucumber.json",
			                  "junit:target/cucumber-reports/cucumber.xml",
			                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
			               
			    
			        )

			public class TestRunner {
				
			
				

		}

/*

///html/body/div[3]/div[1]/header/nav/ul/li[1]/a=xpath
//  //*[@id="mainHeader"]/nav/ul/li[1]/a=half xpath    tag-=a.attribute=href
 
 ////div[@class='ac_results'][2]/ul/li   //a[@id='mainHeader']/nav/ul/li[1]/a
 
 
		 // Click action(Double click)
		 driver.findElement(By.linkText("Double Click")).click();
		 Thread.sleep(2000);
		 WebElement clickbtn=driver.findElement(By.xpath("//button[contains(text(),\"Click Me\")]"));
		 Actions action=new Actions(driver);
		 action.click(clickbtn).perform();
		 Thread.sleep(1000);
		 action.doubleClick(clickbtn).perform();
		 Thread.sleep(1000);
		 action.doubleClick(clickbtn).click(clickbtn).build().perform(); 
		 
		 
		
		 
		 
		 
		 //MouseHover events-dropdown
		 driver.get("https://stqatools.com/demo/MouseHover.php");
		 Thread.sleep(2000);
		 WebElement mouseHoverbtn=driver.findElement(By.className("dropbtn"));
		 action.moveToElement(mouseHoverbtn).perform();
		 List<WebElement> listelements=driver.findElements(By.xpath("//a[@type='button']"));
		 listelements.get(0).click();
		 Thread.sleep(1000);
		
		 */

/*// Single Frame
		driver.switchTo().frame("frame1");
		List<WebElement> headers = driver.findElements(By.id("sampleHeading"));
		System.out.println(headers.size());
		System.out.println(headers.get(0).getText());
*/
			
			
	/*
	 package com.educationsolution.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.educationsolution.pom.BrowserLaunchClosePage1;
import com.educationsolution.pom.MarketMenu3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.When;

@SuppressWarnings("unused")
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
	log.info("User is on market menu option");
}

@When("user sees all options on Market menu")
public void user_sees_all_options_on_market_menu() {
	MarketMenuPage3.
	log.info("User is on market menu option");
}

@Then("user now able to see all options Market menu option on Sharekhan Website")
public void user_now_able_to_see_all_options_market_menu_option_on_sharekhan_website() {
	MarketMenuPage3.cickElement("market_menu_btn_xpath");
	log.info("User is on market menu option");
}	
	 */




/*• Launch Internet Explorer
• Type www.sharekhan.com in Address bar
• Click "LOGIN/TRADE" button (As shown in test case 1)
• Enter valid login id or email id and click Next.
• Enter membership password and click Login. User should be navigated to Portfolio page as 
shown belo
Click View Detailed Portfolio as shown above. User should be navigated to page as shown 
below-
Click ADD VIRTUAL PORTFOLIO as highlighted above. Below dialog should be displayed-
Enter the Name as shown below-
lick ADD FOLDER. Below page should be displayed-
Validate the message “Success” and click CLOSE button. Also validate that portfolio name(i.e. TEST1)
gets added to Menu 
• STEP# - Click ADD SCRIP. Below dialog box should be displayed
Validate the title “Virtual Portfolio”
• Enter the values as shown below-
Click ADD SCRIP. Below dialog box is displayed
Validate the message “stock added successfully” and the scrip added in the Virtual Portfolio as marked 
in yellow background as above
• Click CLOSE button
• Click ADD SCRIP as shown in below page
Validate that the added scrip(s) & quantity appears correctly in the table   */



/* Launch Internet Explorer
• Type www.sharekhan.com in Address bar
• Click "LOGIN/TRADE" button (As shown in test case 1)
• Enter valid login id or email id and click Next.
• Enter membership password and click Login. User should be navigated to Portfolio page as 
shown below
• Click MARKETWATCH. Below page should be displayed

Click CREATE WATCHLIST as highlighted above. Below dialog box should be displayed

Validate the title as “Create Watchlist”, OK button is disabled and CANCEL button is enabled.
• Enter the value “WATCHLIST” in “Enter Watchlist name” edit box as shown below

Validate the message “Template has been successfully created” in the dialog box and click Close 
button. The page is displayed as below

Validate that “WATCHLIST” appears in drop down & ADD button is disabled as shown above
• STEP@ Enter the scrip name as shown below-


STEP$ Click ADD button. Below page should be displayed

Repeat STEP@ & STEP$ to add other 4 scripts. Page should be displayed as below-

*/