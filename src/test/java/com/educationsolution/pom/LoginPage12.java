package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educationsolution.utilities.PropertyReader;

public class LoginPage12 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}
/*	public static void login()  {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys("3481931");
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys("br_pwd");
		
	}*/

	
	public static void loginPageDisplayCheck() {
		Assert.assertTrue(driver.findElement(By.className("ng-scope")).isDisplayed());
		
	}
/*	public static void login(String emailLoginId, String br_pwd) {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys("emailLoginId");
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys("br_pwd");
		
	}
	*/
	
	public static void login(String LoginId, String Password) {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys("LoginId");
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys("Password");
		
	}
	public static void clickLobinbtn() {
		driver.findElement(By.xpath(PropertyReader.getProperty("LoginBtn_xpath"))).click();
		
	}
	public static void dashBoardDisplayCheck() {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("dashboardMenu_class"))).isDisplayed());
		
	}
}
