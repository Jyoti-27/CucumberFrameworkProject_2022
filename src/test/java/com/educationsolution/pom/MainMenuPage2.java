package com.educationsolution.pom;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.educationsolution.utilities.PropertyReader;

public class MainMenuPage2 extends com.educationsolution.base.CommonFunctions {
	
		public static void browserLaunch()  {
			driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
			driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
			
		}
		
	
		//public static void cickElement(String hamburgerMenu)
		//public void clickLinkByHref(String href){
			//driver.findElement(By.name(PropertyReader.getProperty("main_menu_btn_className"))).sendKeys(hamburgerMenu);
			
	      //  Assert.assertTrue(driver.findElement(By.className("hamburgerMenu")).isDisplayed());
	  //  }


		public static void cickElement(String src) {
			driver.findElement(By.linkText("src")).click();
			
		}


		public static void dashBoardDisplayCheck1() {
			Assert.assertTrue(driver.findElement(By.linkText("src")).isDisplayed());
			
		}
		
		//public static void dashBoardDisplayCheck1() {
	    //    Assert.assertTrue(driver.findElement(By.className("hamburgerMenu")).isDisplayed());
	   // }
		
	
		
/*public void clickLinkByHref(String href) {
    List<WebElement> mainmenu = driver.findElements(By.tagName("a");
    Iterator<WebElement> i = mainmenu.iterator();

    while(i.hasNext()) {
        WebElement mainmenu1 = i.next();
        if(mainmenu1.getAttribute("href").contains(href)) {
        	mainmenu1.click();
            break;
        }
    }   */
}

		
	/*	public static void cickElement(String hamburgerMenuIcon) {
			driver.findElement(By.name(PropertyReader.getProperty("main_menu_btn_className"))).sendKeys(hamburgerMenuIcon);
	        Assert.assertTrue(driver.findElement(By.className("hamburgerMenuIcon")).isDisplayed());
	    }  */  // *[@id="mainHeader"]/div/div[2]/div[2]/ul/li[7]/a/img
		
		
		/*public static void cickElement(String Main_Menu) {
			driver.findElement(By.name(PropertyReader.getProperty("main_menu_btn_id"))).sendKeys(Main_Menu);
	        Assert.assertTrue(driver.findElement(By.className("hamburgerMenu")).isDisplayed());
	    }*/
		
		
		
		/*public static void cickElement(String Main_Menu) {
			driver.findElement(By.name(PropertyReader.getProperty("main_menu_btn_className"))).sendKeys(Main_Menu);
	        Assert.assertTrue(driver.findElement(By.xpath("*[@id=\"mainHeader\"]/div/div[2]/div[2]/ul/li[7]/a/img")).isDisplayed());
	    }*/
		
		/*public static void dashBoardDisplayCheck1() {
	        Assert.assertTrue(driver.findElement(By.xpath("*[@id=\"mainHeader\"]/div/div[2]/div[2]/ul/li[7]/a/img")).isDisplayed());
	    }*/
		
		
		/*	public static void dashBoardDisplayCheck(String browser, String baseUrl)  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys(browser);
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys(baseUrl);
		
	    }
	
	    public static void dashBoardDisplayCheck3()  {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).isDisplayed());
		
	    }*/
			    

	



