package com.educationsolution.stepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.educationsolution.base.CommonFunctions;
import com.educationsolution.base.Constants;
import com.educationsolution.utilities.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks extends com.educationsolution.base.CommonFunctions {
	
	@Before()
	public void beforeScenario()  {
		browserLaunch(com.educationsolution.utilities.PropertyReader.getProperty(Constants.BROWSER));
		driver.get(com.educationsolution.utilities.PropertyReader.getProperty(Constants.BASEURL));
	}
	
	
	@AfterStep   //after every step
    public void afterStep(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        
        
    }
	
	@After   //after every scenario
	public void afterScenario() {
	driver.quit();
}

}
