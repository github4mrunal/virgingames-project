package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

@FindBy(linkText = "Login")
// (xpath = "//a[contains(text() , 'Login')]")
    WebElement loginLnk;

public void clickOnLoginLink(){
    clickOnElement(loginLnk);
    log.info("Clicking on Log in Link" +loginLnk.toString());
}

}
