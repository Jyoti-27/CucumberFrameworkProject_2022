package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.educationsolution.utilities.PropertyReader;

public class AddVirtualPortfolioPage20 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}
	
	public static void login(String emailLoginId, String br_pwd)  {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);

	   }

	public static void cickElement(String AddVirtualPortfolio_class,String myPortfolioFolder,String ADDSCRIP_class,String ValidateSuccess_class,String ScripDate_class,String AddFolderBtn_class,String Transaction_class ) {
		// TODO Auto-generated method stub
		
	}
////a[@id='menu']/div/nav/ul/li[2]/a "))));     AddFolderBtn_class = blk-lg-button
	
	public static void enterAddVirtualPortfolio() {
	cickElement(driver.findElement(By.className(PropertyReader.getProperty("AddVirtualPortfolio_class"))));
	driver.findElement(By.name(PropertyReader.getProperty("VirtualFolder_name"))).sendKeys("myPortfolioFolder");
	visibilityOfListElement(driver.findElements(By.className(PropertyReader.getProperty("ADDSCRIP_class"))));
	for (WebElement result : driver.findElements(By.name(PropertyReader.getProperty("ADDSCRIP_class")))) {
		if (result.getText().equalsIgnoreCase("Test")) {				
			result.click();
			break;
		}
		for (WebElement result1 : driver.findElements(By.className(PropertyReader.getProperty("ValidateSuccess_class")))) {
			if (result.getText().equalsIgnoreCase("stock added successfully")) {				
				result1.click();
				break;
			}
			
			Assert.assertTrue(driver.findElement(By.className(PropertyReader.getProperty("ValidateSuccess_class"))).isDisplayed());
		//	driver.findElement(By.id(PropertyReader.getProperty("ok_btn_id"))).click();
     
    driver.findElement(By.className(PropertyReader.getProperty("AddFolderBtn_class"))).click();
    driver.findElement(By.className(PropertyReader.getProperty("ScripDate_class"))).click();
    driver.findElement(By.className(PropertyReader.getProperty("AddFolderBtn_class"))).click();
	driver.findElement(By.name(PropertyReader.getProperty("Transaction_class"))).click();
	Select select = new Select(driver.findElement(By.id(PropertyReader.getProperty("Transaction_class"))));
	select.selectByIndex(0);	
	sleep(1000);
		}
	  }
	}

	public static void cickElement(Object AddFolderBtn_class) {
		 driver.findElement(By.className(PropertyReader.getProperty("AddFolderBtn_class"))).click();

		
	}

	public static void dashBoardDisplayCheck(String string) {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("VirtualPortfolio_xpath"))).isDisplayed());
		
	}

	
	}
	
	

/*	private static void cickElement(Object click) {
	// TODO Auto-generated method stub
	
}

	private static void cickElement(Object click) {
		// TODO Auto-generated method stub
		
	}

	private static void cickElement(Object object) {
		// TODO Auto-generated method stub
		
	}

	public static void dashBoardDisplayCheck(String string) {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("VirtualPortfolio_xpath"))).isDisplayed());
		
	}*/





/*public static void login(String emailLoginId, String br_pwd)  {
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
		*/
