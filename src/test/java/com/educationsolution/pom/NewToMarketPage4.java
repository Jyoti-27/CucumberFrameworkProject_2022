package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educationsolution.utilities.PropertyReader;

public class NewToMarketPage4 extends com.educationsolution.base.CommonFunctions {
	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}

	public static void cickElement(String New_to_Market_Menu_btn_xpath) {
		//driver.findElement(By.xpath("New_to_Market_Menu_btn_xpath")).click();
		driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[2]/a")).click();
		
	}

	public static void dashBoardDisplayCheck2() {
		//Assert.assertTrue(driver.findElement(By.xpath("New_to_Market_Menu_btn_xpath")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[2]/a")).isDisplayed());
		
	}

	
		
}


