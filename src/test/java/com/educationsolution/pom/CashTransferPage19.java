package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educationsolution.utilities.PropertyReader;

public class CashTransferPage19 extends com.educationsolution.base.CommonFunctions {
	

	 static String CashTransferText;
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");

    }
	
	public static void login(String emailLoginId, String br_pwd)  {
	driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
	driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);

  }

	public static void cickElement(String TransferFunds) {
		driver.findElement(By.className("blk-lg-button blksm-active pull-right")).click();
		
	}

	public static void TransferFundsSucessCheck() {
		sleep(2000);
		String TransferFunds=driver.findElement(By.id(PropertyReader.getProperty("TransferFunds_class"))).getText();
		System.out.println("TransferFunds is "+TransferFunds);
		Assert.assertNotEquals(TransferFunds, CashTransferText);
		
		
	}


}
