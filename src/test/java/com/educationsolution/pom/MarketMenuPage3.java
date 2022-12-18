package com.educationsolution.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.educationsolution.utilities.PropertyReader;



import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.educationsolution.utilities.PropertyReader;

@SuppressWarnings("unused")
public class MarketMenuPage3 extends com.educationsolution.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}

/*	public static void cickElement(WebElement market_menu_btn_xpath) {
		 Actions action=new Actions(driver);
		// driver.findElement(By.xpath("market_menu_btn_xpath")).click();
		 driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[1]/a")).click();
		 action.moveToElement(market_menu_btn_xpath).perform();
		 action.click().perform();
		 action.click().build().perform();
		
	}*/
 

	public static void dashBoardDisplayCheck1() {
		Assert.assertTrue(driver.findElement(By.xpath("market_menu_btn_xpath")).isDisplayed());
		
	}


	public static void dashBoardDisplayCheck2() {
		Assert.assertTrue(driver.findElement(By.xpath("market_menu_btn_xpath")).isDisplayed());
		
	}

	public static void cickElement(String market_menu_btn_xpath)
	//public static void cickElement()
	{
		//Actions action=new Actions(driver);
		 driver.findElement(By.xpath("market_menu_btn_xpath")).click();
		// driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[1]/a")).click();
		// driver.findElement(By.xpath("//html/body/div[3]/div[1]/header/nav/ul/li[1]/a")).click();
		// action.moveToElement(market_menu_btn_xpath).perform();
		// action.click().perform();
		// action.click().build().perform();
		
		
	}

	


	//driver.findElement(By.linkText("Double Click")).click();
	// Thread.sleep(2000);
	// WebElement clickbtn=driver.findElement(By.xpath("//button[contains(text(),\"Click Me\")]"));
	//           Actions action=new Actions(driver);
	// action.click(clickbtn).perform();
	// Thread.sleep(1000);
	//         action."doubleClick", ("market_menu_btn_xpath").perform();
	 //Thread.sleep(1000);
	//           action."doubleClick",(market_menu_btn_xpath).click(clickbtn).build().perform(); 


	

}
