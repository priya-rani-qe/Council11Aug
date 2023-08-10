package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class utilities {
    public static WebDriver driver;
    public String url = "https://services-act.leeds.gov.uk/SkinPiercing/ServiceRequest";
    private String webDriver_location = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

    @BeforeMethod
    public  void setup_browser(){
        System.setProperty("webdriver.chrome.driver", webDriver_location);
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @AfterMethod
    public void tear_down(){

        if (driver!=null){
            driver.quit();
        }
    }

    private void load_wait(){

        if(driver!=null) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loader"))));
            wait.pollingEvery(Duration.ofMillis(10));
        }
        else
            Assert.assertTrue(false,"unknown");
    }

    public void click_btn(WebElement element){

        element.click();
        load_wait();
    }

    public void send_txt(WebElement element, String txt){

        element.sendKeys(txt);
    }

    public void select_dropdown(WebElement element, String txt){

        Select sel=new Select(element);
        sel.selectByVisibleText(txt);
        load_wait();
    }
}
