package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MasterZonePage extends TestBase {

    // Initializing the PageObject

    public MasterZonePage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//a[contains(text(),'Add Zone')]")
    public static WebElement addZoneBtn;

    @FindBy(xpath = "//h4[contains(text(),'Add Zone')]")
    public static WebElement zoneMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Company')]")
    public static WebElement zoneCompanyHeader;

    @FindBy(xpath = "//select[@id='company_Id']")
    public static WebElement zoneCompanyClick;

    @FindBy(xpath = "//option[contains(text(),'Nirmaan Solution Private Limited')]")
    public static WebElement zoneCompanySelect;

    @FindBy(xpath = "//label[contains(text(),'Zone Code')]")
    public static WebElement zoneCodeHeader;

    @FindBy(xpath = "//input[@id='zone_Code']")
    public static WebElement zoneCodeInput;

    @FindBy(xpath = "//label[contains(text(),'Zone Name')]")
    public static WebElement zoneNameHeader;

    @FindBy(xpath = "//input[@id='zone_Name']")
    public static WebElement zoneNameInput;

    @FindBy(xpath = "//label[@for='checkbox1_3']")
    public static WebElement zoneActiveCheckboxClick;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]/..//button[contains(text(),'Close')]")
    public static WebElement zoneCloseBtn;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
    public static WebElement zoneSaveBtn;

    public void addZoneDetail(){
        try {
            addZoneBtn.click();
            TestUtil.waiting(2000);
            zoneCloseBtn.click();
            TestUtil.waiting(2000);
            addZoneBtn.click();

            TestUtil.waiting(2000);
            Assert.assertTrue(zoneMainHeader.isDisplayed(), "Company Zone Main Header missing");
            Assert.assertTrue(zoneCompanyHeader.isDisplayed(), "Company Header missing");
            zoneCompanyClick.click();
            zoneCompanySelect.click();

            TestUtil.waiting(2000);
            Assert.assertTrue(zoneCodeHeader.isDisplayed(), "Zone Code Header missing");
            zoneCodeInput.sendKeys(data.getProperty("companyZoneCodeInput"));

            TestUtil.waiting(1000);
            Assert.assertTrue(zoneNameHeader.isDisplayed(), "Zone Name Header missing");
            zoneNameInput.sendKeys(data.getProperty("companyZoneNameInput"));

//            TestUtil.isSelected(zoneActiveCheckboxClick);

            TestUtil.actionMethod(zoneActiveCheckboxClick);
            TestUtil.waiting(1000);
            TestUtil.javaScriptClick(zoneActiveCheckboxClick);

            zoneSaveBtn.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
