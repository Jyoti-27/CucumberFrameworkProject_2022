package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.educationsolution.utilities.PropertyReader;

public class CreateVerifyWatchlistPage21 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}
	
	public static void login(String emailLoginId, String br_pwd)  {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);

	   }
	
	public static void cickElement() {
		 driver.findElement(By.className(PropertyReader.getProperty("MarketWatchButton_xpath"))).click();
		 driver.findElement(By.className(PropertyReader.getProperty("CreateWatchlist_xpath"))).click();
		 Assert.assertTrue(driver.findElement(By.className(PropertyReader.getProperty("ADDBtn_xpath"))).isDisplayed());
		 driver.findElement(By.className(PropertyReader.getProperty("ADDBtn_xpath"))).click();
		 

	}
	
	public static void enterCreateVerifyWatchlist() {
	cickElement(driver.findElement(By.xpath(PropertyReader.getProperty("MarketWatchButton_xpath"))));
	driver.findElement(By.name(PropertyReader.getProperty("CreateWatchlist_xpath"))).sendKeys("//a[@id='submenu']/li[1]/a");
	visibilityOfListElement(driver.findElements(By.xpath(PropertyReader.getProperty("CreateWatchlist_xpath"))));
	for (WebElement result : driver.findElements(By.name(PropertyReader.getProperty("ADDSCRIP_class")))) {
		if (result.getText().equalsIgnoreCase("Watchlist1")) {				
			result.click();
			break;
		}
		for (WebElement result1 : driver.findElements(By.xpath(PropertyReader.getProperty("OkBtn_xpath")))) {
			if (result.getText().equalsIgnoreCase("Template has been created successfully")) {				
				result1.click();
				break;
			}
			
			for (WebElement result2 : driver.findElements(By.xpath(PropertyReader.getProperty("ADDBtn_xpath")))) {
				if (result.getText().equalsIgnoreCase("Scrip has been added successfully")) {				
					result2.click();
					break;
				}
			}
			
		}
     
		
	}
		
	  
 }
	public static void dashBoardDisplayCheck(String CreateWatchlist_xpath) {
		driver.findElement(By.xpath(PropertyReader.getProperty("CreateWatchlist_xpath"))).click();
		
	}

	

}
