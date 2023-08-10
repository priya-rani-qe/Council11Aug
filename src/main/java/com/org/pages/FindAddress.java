package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class FindAddress extends utilities{
//WebDriver driver;
    @FindBy(xpath="//input[@id='Search']")
    WebElement postCodeBox;

    @FindBy(xpath="//input[@value='Find address']")
    WebElement findAddrBtn;

    @FindBy(xpath="//select[@id='addresses']")
    WebElement addressDropDown;

    @FindBy(xpath = "//button[@value='Continue']")
    WebElement ContinueButton;

    @FindBy(xpath="//span[text()='Enter the postcode or street name']")
    WebElement firstMsg;

    @FindBy(xpath="//span[text()='Enter a valid postcode/street name within the Leeds city council area']")
    WebElement secondMsg;

    public FindAddress(WebDriver driver){
//        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterPostCode(String txt){
        send_txt(postCodeBox,txt);
//        postCodeBox.sendKeys(txt);

    }
    public void findAddressBtnClick(){

        click_btn(findAddrBtn);
//        findAddrBtn.click();
    }

    public void selectAddressDropDown(String txt){
        select_dropdown(addressDropDown,txt);
//        Select sel=new Select(addressDropDown);
//        sel.selectByVisibleText(txt);
    }
    public void continueBtnClick(){
        click_btn(ContinueButton);

    }
    public void verifyErrorMsg(){

        int i;
        List<WebElement> aa = postCodeBox.findElements(By.xpath("./../child::*"));
        for(i =0; i< aa.size();i++)
//        {
//            System.out.println("->" + aa.get(i).getAttribute("class"));

            if(aa.get(i).getAttribute("class").contains("error-message"))
                break;

//        }
//        System.out.println("%%" + postCodeBox.findElement(By.xpath("./..")));
        System.out.println("&&" + i);
        Assert.assertFalse((i==aa.size()));

//       Assert.assertTrue(firstMsg.isDisplayed());
//        Assert.assertTrue(secondMsg.isDisplayed());
    }







}
