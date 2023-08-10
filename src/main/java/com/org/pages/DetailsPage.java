package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DetailsPage extends utilities{

    public DetailsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id='FurtherInformationDetails']")
            ////*[@id='FurtherInformationDetails']")  //p[@id='remainingC']/preceding-sibling::textarea
    WebElement txtArea;

    @FindBy(xpath ="//p[@id='remainingC']")
    WebElement remaining;

    public void textEntry(String txt){
                send_txt(txtArea,txt);
        System.out.println("-->" + txt.length());
    }

    public void remainingCharacterAssertion(String txt){
       Assert.assertTrue(remaining.isDisplayed());
       String remainingStr=  remaining.getText();
       System.out.println("remaining"+remainingStr);

       String[] temp = remainingStr.split(" ");
       Assert.assertEquals(temp[2],String.valueOf(1000-txt.length()));


    }





}
