package com.virgingames;

import com.cucumber.listener.Reporter;
import com.virgingames.basepage.BasePage;
import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {
    @Before
    public void openBrowser(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Mrunal","Cucumber Report");
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }

}


