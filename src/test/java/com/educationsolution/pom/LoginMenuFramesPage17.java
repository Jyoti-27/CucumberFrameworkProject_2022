package com.educationsolution.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.educationsolution.utilities.PropertyReader;

public class LoginMenuFramesPage17 extends com.educationsolution.base.CommonFunctions {
	

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

	public static void dashBoardDisplayCheck() throws InterruptedException {
	//	driver.findElement(By.xpath(PropertyReader.getProperty("LoginMenuFrame_xpath"))).click();
		
		
		/*	//frameshandling
		driver.switchTo().frame("LoginMenuFrame_xpath");
		List<WebElement> headers = driver.findElements(By.xpath("LoginMenuFrame_xpath"));
		driver.findElement(By.xpath(PropertyReader.getProperty("LoginMenuFrame_xpath"))).click();
		System.out.println(headers.size());
		System.out.println(headers.get(1).getText());

		driver.switchTo().defaultContent();      */
		
		
		/*=============optional
		Thread.sleep(2000);
		WebElement mainheader = driver.findElement(By.className("main-header"));
		System.out.println(mainheader.getText());

		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		WebElement header2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(header2.getText());

		driver.switchTo().defaultContent();
		
		*/
		
		
		
		
		
		//moushoveraction
		List<WebElement> mailLinks=driver.findElements(By.xpath("LoginMenuFrame_xpath"));
		 Thread.sleep(2000);
		 System.out.println(mailLinks.size());
		 mailLinks.get(1).click();
		 
		 
		
		 
		 
/*		 // Click action(Double click)
		 driver.findElement(By.linkText("Double Click")).click();
		 Thread.sleep(2000);
		 WebElement clickbtn=driver.findElement(By.xpath("//button[contains(text(),\"Click Me\")]"));
		 Actions action=new Actions(driver);
		 action.click(clickbtn).perform();
		 Thread.sleep(1000);
		 action.doubleClick(clickbtn).perform();
		 Thread.sleep(1000);
		 action.doubleClick(clickbtn).click(clickbtn).build().perform(); 
		 }         */

		
	}
}
