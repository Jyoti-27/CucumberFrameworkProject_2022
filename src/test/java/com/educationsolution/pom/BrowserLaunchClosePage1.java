package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educationsolution.base.CommonFunctions;
import com.educationsolution.utilities.PropertyReader;

@SuppressWarnings("unused")
public class BrowserLaunchClosePage1 extends com.educationsolution.base.CommonFunctions {
	
	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}
	
	public static void dashBoardDisplayCheck(String browser, String baseUrl)  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys(browser);
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys(baseUrl);
		
	}
	
	public static void dashBoardDisplayCheck1()  {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).isDisplayed());
		
	}
	
	/*public static void dashBoardDisplayCheck2() {
        Assert.assertTrue(driver.findElement(By.id("logInPanelHeading")).isDisplayed());
    }*/
		    

}
