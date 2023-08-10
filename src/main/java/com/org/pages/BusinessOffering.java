package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessOffering extends  utilities{
    @FindBy(xpath="//label[@data-target='radio-Acupuncture']")
    WebElement acupuncture;

    String ele_checkBox = ".//input[@value='";

    public BusinessOffering(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

//    public void OfferingCheckBoxSelection(){
//        acupuncture.click();
//    }

    public void setCheckBox(String txt){

        WebElement ele = driver.findElement(By.xpath(ele_checkBox+txt + "']"));

        if(!ele.isSelected())
            click_btn(ele);

    }








}
