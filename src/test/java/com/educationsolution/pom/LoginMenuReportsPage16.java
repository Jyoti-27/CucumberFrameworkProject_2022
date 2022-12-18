package com.educationsolution.pom;

import org.openqa.selenium.By;

import com.educationsolution.utilities.PropertyReader;

public class LoginMenuReportsPage16 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");

  }
	
	public static void login(String emailLoginId, String br_pwd)  {
		driver.findElement(By.name(PropertyReader.getProperty("LoginID_name"))).sendKeys(emailLoginId);
		driver.findElement(By.id(PropertyReader.getProperty("MembershipPassword_name"))).sendKeys(br_pwd);
		
		}

	public static void clickLobinbtn() {
		driver.findElement(By.xpath(PropertyReader.getProperty("LoginBtn_xpath"))).click();
		
	}

	public static void dashBoardDisplayCheck() {
		driver.findElement(By.xpath(PropertyReader.getProperty("Reports_xpath"))).click();
		
	}
	
}
