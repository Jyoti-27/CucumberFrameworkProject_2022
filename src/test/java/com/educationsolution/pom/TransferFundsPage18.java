package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.educationsolution.utilities.PropertyReader;

public class TransferFundsPage18 extends com.educationsolution.base.CommonFunctions {
	

	 static String TransferFundsText;

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");

     }
	
	public static void login(String emailLoginId, String br_pwd)  {
	driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
	driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);

   }

	public static void dashBoardDisplayCheck() {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("dashboardMenu_id"))).isDisplayed());
		
	}

	public static void cickElement(String TransferFunds) {
		driver.findElement(By.className("blk-lg-button blksm-active pull-right")).click();
		
	}

	public static void TransferFundsSucessCheck() {
		sleep(2000);
		String TransferFunds=driver.findElement(By.id(PropertyReader.getProperty("TransferFunds_class"))).getText();
		System.out.println("TransferFunds is "+TransferFunds);
		Assert.assertNotEquals(TransferFunds, TransferFundsText);
		
		
	}
	public static void enterTransferFundsForm() {
	
		cickElement(driver.findElement(By.xpath(PropertyReader.getProperty("AccountButton_xpath = //a[@id='menu']/div/nav/ul/li[2]/a "))));			
		driver.findElement(By.name(PropertyReader.getProperty("BankToEquityAmount_name"))).sendKeys("BankToEquityAmount_name");
		visibilityOfListElement(driver.findElements(By.name(PropertyReader.getProperty("PaymentModeOption_name"))));
		for (WebElement result : driver.findElements(By.name(PropertyReader.getProperty("PaymentModeOption_name")))) {
			if (result.getText().equalsIgnoreCase("Netbanking")) {				
				result.click();
				break;
			}
		}	
		driver.findElement(By.name(PropertyReader.getProperty("EquityToBankSegment_name"))).click();
		Select select = new Select(driver.findElement(By.id(PropertyReader.getProperty("EquityToBankSegment_name"))));
		select.selectByIndex(0);	
		sleep(1000);
		
	/*	balanceText=driver.findElement(By.id(PropertyReader.getProperty("balance_id"))).getText();
		System.out.println("current balance is"+balanceText);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.id(PropertyReader.getProperty("fromDate_id"))));
		driver.findElement(By.id(PropertyReader.getProperty("fromDate_id"))).clear();
		driver.findElement(By.id(PropertyReader.getProperty("fromDate_id"))).sendKeys(fromDate);	
		sleep(1000);
		js.executeScript("arguments[0].click();", driver.findElement(By.id(PropertyReader.getProperty("toDate_id"))));
		driver.findElement(By.id(PropertyReader.getProperty("toDate_id"))).clear();
		driver.findElement(By.id(PropertyReader.getProperty("toDate_id"))).sendKeys(toDate);		
		driver.findElement(By.id(PropertyReader.getProperty("comment_textbox_id"))).sendKeys(comment);*/
		
		
	}
	
	

		// TODO Auto-generated method stub
		
	
	
	

	
	private static void cickElement(WebElement TransferFunds) {
		driver.findElement(By.className("blk-lg-button blksm-active pull-right")).click();
		
		
	}

	private static void cickElement(CharSequence[] TransferFunds,CharSequence[]BankDetails)  {
		driver.findElement(By.className(PropertyReader.getProperty("TransferFunds_class"))).sendKeys(TransferFunds);
		driver.findElement(By.className(PropertyReader.getProperty("BankDetails_class"))).sendKeys(BankDetails);
	}

	/*public static void submitLeave() {
		sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].click();", driver.findElement(By.id(PropertyReader.getProperty("assign_btn_id"))));
		visibilityOfElement(driver.findElement(By.id(PropertyReader.getProperty("popup_id"))));
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("popup_id"))).isDisplayed());
		driver.findElement(By.id(PropertyReader.getProperty("ok_btn_id"))).click();
	}*/


	public static void clickLobinbtn() {
		driver.findElement(By.id(PropertyReader.getProperty("LoginBtn_xpath"))).click();
		
	}

	public static void login1(String emailLoginId, String br_pwd)  {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);
		
	}

	

	


		
 }

	

	

	

	

