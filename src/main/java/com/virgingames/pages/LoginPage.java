package com.virgingames.pages;

import com.gargoylesoftware.htmlunit.Page;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "field-username")
    WebElement userName;

    @FindBy(id = "field-password")
    WebElement passWord;

    @FindBy(xpath = "//button[@class = 'button button-login']")
    WebElement loginBtn;

    @FindBy(xpath = "//body/div[@id='app-main']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/a[1]/*[1]")
    WebElement loginPageTxt;

    @FindBy(xpath = "//div[text() = 'Please try again, your username/email or password has not been recognised']")
    WebElement errorMessage;

    public void enterUserName(String email){
    sendTextToElement(userName,email);
    log.info("Entering username as a Email" + email + "to username field" + userName.toString());
    }
    public void enterPassWord(String password){
        sendTextToElement(passWord,password);
        log.info("Entering password" + password + "to password field" + passWord.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    log.info("Clicking on Login Button" + loginBtn.toString());
    }

    public String getloginPgTxt(){
        log.info("Verifying Login Page Text" + loginPageTxt.toString());
        return getTextFromElement(loginPageTxt);
    }

    public String verifyErrorMessage(){
        log.info("Verifying Error Message" + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }
}
