import com.org.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomatedTest extends utilities {

    @Test(testName = "TestScenario1", priority = 1,enabled = false)
    public  void TestScenario1(){

        driver.get(url);
        RegisterPage reg=new RegisterPage(driver);
        reg.startNow();
       reg.verifyTitle("What is the address of the premises where treatments will be given?");

    }


    @Test(testName="TestScenario2", priority = 2,enabled = false)
    public void testScenario2() {
        driver.get(url);
        RegisterPage reg=new RegisterPage(driver);
        reg.startNow();

        FindAddress findAddrObj = new FindAddress(driver);
        findAddrObj.enterPostCode("LS1 1UR");
        findAddrObj.findAddressBtnClick();

        findAddrObj.selectAddressDropDown("LEEDS CITY COUNCIL, CIVIC HALL, CALVERLEY STREET, LEEDS, LS1 1UR");
         findAddrObj.continueBtnClick();
    }
    @Test(testName = "TestScenario3",priority = 3,enabled = false)
    public void testScenario3() throws InterruptedException {
        driver.get(url);
        RegisterPage reg=new RegisterPage(driver);
        reg.startNow();

        FindAddress findAddrObj = new FindAddress(driver);
        findAddrObj.enterPostCode("LS1 1UR");
        findAddrObj.findAddressBtnClick();

        findAddrObj.selectAddressDropDown("LEEDS CITY COUNCIL, CIVIC HALL, CALVERLEY STREET, LEEDS, LS1 1UR");
        findAddrObj.continueBtnClick();

        BusinessOffering businessObj=new BusinessOffering(driver);
//        businessObj.OfferingCheckBoxSelection();
        businessObj.setCheckBox("Acupuncture");
        businessObj.setCheckBox("Tattoo parlour");
        businessObj.setCheckBox("Electrolysis");
        businessObj.setCheckBox("Acupuncture");
        Thread.sleep(300);
        findAddrObj.continueBtnClick();
    }
    @Test(testName = "TestScenario4",priority='3',enabled = true)
    public void testScenario4() throws InterruptedException {
        driver.get(url);
        RegisterPage reg=new RegisterPage(driver);
        reg.startNow();

        FindAddress findAddrObj = new FindAddress(driver);
        findAddrObj.enterPostCode("LS1 1UR");
        findAddrObj.findAddressBtnClick();

        findAddrObj.selectAddressDropDown("LEEDS CITY COUNCIL, CIVIC HALL, CALVERLEY STREET, LEEDS, LS1 1UR");
        findAddrObj.continueBtnClick();

        BusinessOffering businessObj=new BusinessOffering(driver);
//        businessObj.OfferingCheckBoxSelection();
        businessObj.setCheckBox("Acupuncture");
        businessObj.setCheckBox("Tattoo parlour");
        businessObj.setCheckBox("Electrolysis");
        businessObj.setCheckBox("Acupuncture");
        findAddrObj.continueBtnClick();
        DetailsPage detailsObj=new DetailsPage(driver);
        detailsObj.textEntry("This is test details");
        detailsObj.remainingCharacterAssertion("This is test details");
    }
    @Test(testName = "verifyErrorMsg",enabled = false)
    public void verifyErrorMsg(){
        driver.get(url);
        RegisterPage regObj=new RegisterPage(driver);
        regObj.startNow();
        FindAddress findAddrObj = new FindAddress(driver);
       // findAddrObj.enterPostCode("LS1 1UR");
        findAddrObj.findAddressBtnClick();
        findAddrObj.verifyErrorMsg();




    }


    }





