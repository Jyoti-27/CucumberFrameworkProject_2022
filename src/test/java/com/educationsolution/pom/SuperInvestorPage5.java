package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educationsolution.utilities.PropertyReader;

public class SuperInvestorPage5 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}

	public static void cickElement(String Super_Investor_Menu_btn_xpath) {
		driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[3]/a")).click();
		
	}

	public static void dashBoardDisplayCheck2() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[3]/a")).isDisplayed());
		
	}
}
