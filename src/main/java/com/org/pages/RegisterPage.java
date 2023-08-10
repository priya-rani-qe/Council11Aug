package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage extends utilities{

    public RegisterPage(WebDriver driver) {
//        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath=".//button[contains(text(),'Start now')]")
    WebElement startNow;

    @FindBy(xpath="//h1[@class='heading-large']")
    WebElement headingText;

    public void startNow(){
        click_btn(startNow);
//        startNow.click();
    }
    public void verifyTitle(String txt){
        Assert.assertEquals(headingText.getText(),txt);
    }
}
