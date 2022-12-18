package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educationsolution.utilities.PropertyReader;

public class LoginMenuBarPage13 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}
	
	public static void login1(String emailLoginId, String br_pwd)  {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);
		
		}

	public static void loginPageDisplayCheck() {
		//Assert.assertTrue(driver.findElement(By.className("ng-scope")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.className("dashboardMenu_class")).isDisplayed());
		
	}  

	public static void login(String loginID, String membershipPassword) {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys("LoginId");
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys("Password");
		
	}

	public static void clickLobinbtn() {
		driver.findElement(By.xpath(PropertyReader.getProperty("LoginBtn_xpath"))).click();
	}

	
	public static void clickAccountnBtn() {
		driver.findElement(By.xpath(PropertyReader.getProperty("AccountButton_xpath"))).click();
		//driver.findElement(By.xpath(PropertyReader.getProperty("AccountButton_class"))).click();
	}

}
