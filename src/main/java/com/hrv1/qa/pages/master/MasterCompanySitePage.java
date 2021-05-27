package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MasterCompanySitePage extends TestBase {

    // Initializing the PageObject

    public MasterCompanySitePage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//a[contains(text(),'Add Company Site')]")
    public static WebElement companyAddCompanySiteBtn;

    @FindBy(xpath = "//h4[contains(text(),'Add Company Site')]")
    public static WebElement companySiteMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Company')]")
    public static WebElement companySiteCompanyHeader;

    @FindBy(xpath = "//ng-select2[@id='company_Id']")
    public static WebElement companySiteCompanyClick;

    @FindBy(xpath = "//option[contains(text(),'GHPL')]")
    public static WebElement companySiteCompany1Select;

    @FindBy(xpath = "//option[contains(text(),'GRPL')]")
    public static WebElement companySiteCompany2Select;

    @FindBy(xpath = "//option[contains(text(),'SyriMed')]")
    public static WebElement companySiteCompany3Select;

    @FindBy(xpath = "//label[contains(text(),'Site Code')]")
    public static WebElement companySiteCodeHeader;

    @FindBy(xpath = "//input[@id='site_Code']")
    public static WebElement companySiteCodeInput;

    @FindBy(xpath = "//label[contains(text(),'Site Name')]")
    public static WebElement companySiteNameHeader;

    @FindBy(xpath = "//input[@id='site_Name']")
    public static WebElement companySiteNameInput;

    @FindBy(xpath = "//label[contains(text(),'Address1')]")
    public static WebElement companySiteAddress1Header;

    @FindBy(xpath = "//input[@id='address1']")
    public static WebElement companySiteAddress1Input;

    @FindBy(xpath = "//label[contains(text(),'Address2')]")
    public static WebElement companySiteAddress2Header;

    @FindBy(xpath = "//input[@id='address2']")
    public static WebElement companySiteAddress2Input;

    @FindBy(xpath = "//label[contains(text(),'Address3')]")
    public static WebElement companySiteAddress3Header;

    @FindBy(xpath = "//input[@id='address3']")
    public static WebElement companySiteAddress3Input;

    @FindBy(xpath = "//label[contains(text(),'Address4')]")
    public static WebElement companySiteAddress4Header;

    @FindBy(xpath = "//input[@id='address4']")
    public static WebElement companySiteAddress4Input;

    @FindBy(xpath = "//label[contains(text(),'City')]")
    public static WebElement companySiteCityHeader;

    @FindBy(xpath = "//input[@id='city']")
    public static WebElement companySiteCityInput;

    @FindBy(xpath = "//label[contains(text(),'State')]")
    public static WebElement companySiteStateHeader;

    @FindBy(xpath = "//input[@id='state']")
    public static WebElement companySiteStateInput;

    @FindBy(xpath = "//label[contains(text(),'Country')]")
    public static WebElement companySiteCountryHeader;

    @FindBy(xpath = "//select[@id='country_Id']")
    public static WebElement companySiteCountryClick;

    @FindBy(xpath = "//option[contains(text(),'India')]")
    public static WebElement companySiteCountrySelect;

    @FindBy(xpath = "//option[contains(text(),'United Kingdom')]")
    public static WebElement companySite2CountrySelect;

    @FindBy(xpath = "//label[contains(text(),'Post Code')]")
    public static WebElement companySitePostCodeHeader;

    @FindBy(xpath = "//input[@id='postCode']")
    public static WebElement companySitePostCodeInput;

    @FindBy(xpath = "//input[@id='checkbox1_3']")
    public static WebElement companySiteActiveCheckboxClick;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]/..//button[contains(text(),'Close')]")
    public static WebElement companySiteCloseBtn;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
    public static WebElement companySiteSaveBtn;


    // Actions

    public void addCompanySiteDetail11() {
        try {
            TestUtil.highlightElement(companyAddCompanySiteBtn);
            TestUtil.waiting(1000);
            TestUtil.javaScriptClick(companyAddCompanySiteBtn);
//            companyAddCompanySiteBtn.click();
            TestUtil.waiting(2000);

            TestUtil.scrollTo(companySiteCloseBtn);

            TestUtil.highlightElement(companySiteCloseBtn);
            companySiteCloseBtn.click();
            TestUtil.waiting(2000);

            TestUtil.highlightElement(companyAddCompanySiteBtn);
            companyAddCompanySiteBtn.click();
            TestUtil.waiting(2000);
            Assert.assertTrue(companySiteMainHeader.isDisplayed(), "Company Site Main Header missing");
            Assert.assertTrue(companySiteCompanyHeader.isDisplayed(), "Company Company Header missing");
            TestUtil.highlightElement(companySiteCompanyClick);
            companySiteCompanyClick.click();
            TestUtil.actionMethod(companySiteCompany1Select);
//            companySiteCompany1Select.click();

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteCodeHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteCodeInput);
            companySiteCodeInput.sendKeys(data.getProperty("companySiteCodeInput11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteNameHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteNameInput);
            companySiteNameInput.sendKeys(data.getProperty("companySiteNameInput11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress1Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress1Input);
            companySiteAddress1Input.sendKeys(data.getProperty("companySiteAddress1Input11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress2Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress2Input);
            companySiteAddress2Input.sendKeys(data.getProperty("companySiteAddress2Input11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress3Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress3Input);
            companySiteAddress3Input.sendKeys(data.getProperty("companySiteAddress3Input11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress4Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress4Input);
            companySiteAddress4Input.sendKeys(data.getProperty("companySiteAddress4Input11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteCityHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteCityInput);
            companySiteCityInput.sendKeys(data.getProperty("companySiteCityInput11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteStateHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteStateInput);
            companySiteStateInput.sendKeys(data.getProperty("companySiteStateInput11"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteCountryHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteCountryClick);
            companySiteCountryClick.click();
            companySiteCountrySelect.click();

            TestUtil.waiting(1000);
            Assert.assertTrue(companySitePostCodeHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySitePostCodeInput);
            companySitePostCodeInput.sendKeys(data.getProperty("companySitePostCodeInput11"));

            TestUtil.highlightElement(companySiteActiveCheckboxClick);
            TestUtil.actionMethod(companySiteActiveCheckboxClick);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companySiteActiveCheckboxClick);
            TestUtil.javaScriptClick(companySiteActiveCheckboxClick);

            companySiteSaveBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCompanySiteDetail12() {
        try {

            TestUtil.scrollToTop();
            TestUtil.waiting(2000);
            TestUtil.highlightElement(companyAddCompanySiteBtn);
            TestUtil.waiting(1000);
            TestUtil.javaScriptClick(companyAddCompanySiteBtn);
//            companyAddCompanySiteBtn.click();
            TestUtil.waiting(2000);

            TestUtil.scrollTo(companySiteCloseBtn);

            TestUtil.highlightElement(companySiteCloseBtn);
            companySiteCloseBtn.click();
            TestUtil.waiting(2000);

            TestUtil.highlightElement(companyAddCompanySiteBtn);
            companyAddCompanySiteBtn.click();
            TestUtil.waiting(2000);
            Assert.assertTrue(companySiteMainHeader.isDisplayed(), "Company Site Main Header missing");
            Assert.assertTrue(companySiteCompanyHeader.isDisplayed(), "Company Company Header missing");
            TestUtil.highlightElement(companySiteCompanyClick);
            companySiteCompanyClick.click();
            companySiteCompany1Select.click();

            TestUtil.waiting(2000);
            Assert.assertTrue(companySiteCodeHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteCodeInput);
            companySiteCodeInput.sendKeys(data.getProperty("companySiteCodeInput12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteNameHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteNameInput);
            companySiteNameInput.sendKeys(data.getProperty("companySiteNameInput12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress1Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress1Input);
            companySiteAddress1Input.sendKeys(data.getProperty("companySiteAddress1Input12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress2Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress2Input);
            companySiteAddress2Input.sendKeys(data.getProperty("companySiteAddress2Input12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress3Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress3Input);
            companySiteAddress3Input.sendKeys(data.getProperty("companySiteAddress3Input12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteAddress4Header.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteAddress4Input);
            companySiteAddress4Input.sendKeys(data.getProperty("companySiteAddress4Input12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteCityHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteCityInput);
            companySiteCityInput.sendKeys(data.getProperty("companySiteCityInput12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteStateHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteStateInput);
            companySiteStateInput.sendKeys(data.getProperty("companySiteStateInput12"));

            TestUtil.waiting(1000);
            Assert.assertTrue(companySiteCountryHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySiteCountryClick);
            companySiteCountryClick.click();
            companySite2CountrySelect.click();

            TestUtil.waiting(1000);
            Assert.assertTrue(companySitePostCodeHeader.isDisplayed(), "Company Site Code Header missing");
            TestUtil.highlightElement(companySitePostCodeInput);
            companySitePostCodeInput.sendKeys(data.getProperty("companySitePostCodeInput12"));

            TestUtil.highlightElement(companySiteActiveCheckboxClick);
            TestUtil.actionMethod(companySiteActiveCheckboxClick);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companySiteActiveCheckboxClick);
            TestUtil.javaScriptClick(companySiteActiveCheckboxClick);

            companySiteSaveBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void addCompanySiteDetail21() {
//        try {
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            TestUtil.waiting(1000);
//            TestUtil.javaScriptClick(companyAddCompanySiteBtn);
////            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.scrollTo(companySiteCloseBtn);
//
//            TestUtil.highlightElement(companySiteCloseBtn);
//            companySiteCloseBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteMainHeader.isDisplayed(), "Company Site Main Header missing");
//            Assert.assertTrue(companySiteCompanyHeader.isDisplayed(), "Company Company Header missing");
//            TestUtil.highlightElement(companySiteCompanyClick);
//            companySiteCompanyClick.click();
//            companySiteCompanySelect.click();
//
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCodeInput);
//            companySiteCodeInput.sendKeys(data.getProperty("companySiteCodeInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteNameHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteNameInput);
//            companySiteNameInput.sendKeys(data.getProperty("companySiteNameInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress1Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress1Input);
//            companySiteAddress1Input.sendKeys(data.getProperty("companySiteAddress1Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress2Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress2Input);
//            companySiteAddress2Input.sendKeys(data.getProperty("companySiteAddress2Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress3Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress3Input);
//            companySiteAddress3Input.sendKeys(data.getProperty("companySiteAddress3Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress4Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress4Input);
//            companySiteAddress4Input.sendKeys(data.getProperty("companySiteAddress4Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCityHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCityInput);
//            companySiteCityInput.sendKeys(data.getProperty("companySiteCityInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteStateHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteStateInput);
//            companySiteStateInput.sendKeys(data.getProperty("companySiteStateInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCountryHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCountryClick);
//            companySiteCountryClick.click();
//            companySiteCountrySelect.click();
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySitePostCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySitePostCodeInput);
//            companySitePostCodeInput.sendKeys(data.getProperty("companySitePostCodeInput1"));
//
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.actionMethod(companySiteActiveCheckboxClick);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.javaScriptClick(companySiteActiveCheckboxClick);
//
//            //            OR
//
////            TestUtil.actionActiveCheckbox(companySiteActiveCheckboxClick);
////            TestUtil.waiting(1000);
////            TestUtil.javaScriptForClick(companySiteActiveCheckboxClick);
//
////            companySiteSaveBtn.click();
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompanySiteDetail22() {
//        try {
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            TestUtil.waiting(1000);
//            TestUtil.javaScriptClick(companyAddCompanySiteBtn);
////            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.scrollTo(companySiteCloseBtn);
//
//            TestUtil.highlightElement(companySiteCloseBtn);
//            companySiteCloseBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteMainHeader.isDisplayed(), "Company Site Main Header missing");
//            Assert.assertTrue(companySiteCompanyHeader.isDisplayed(), "Company Company Header missing");
//            TestUtil.highlightElement(companySiteCompanyClick);
//            companySiteCompanyClick.click();
//            companySiteCompanySelect.click();
//
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCodeInput);
//            companySiteCodeInput.sendKeys(data.getProperty("companySiteCodeInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteNameHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteNameInput);
//            companySiteNameInput.sendKeys(data.getProperty("companySiteNameInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress1Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress1Input);
//            companySiteAddress1Input.sendKeys(data.getProperty("companySiteAddress1Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress2Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress2Input);
//            companySiteAddress2Input.sendKeys(data.getProperty("companySiteAddress2Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress3Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress3Input);
//            companySiteAddress3Input.sendKeys(data.getProperty("companySiteAddress3Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress4Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress4Input);
//            companySiteAddress4Input.sendKeys(data.getProperty("companySiteAddress4Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCityHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCityInput);
//            companySiteCityInput.sendKeys(data.getProperty("companySiteCityInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteStateHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteStateInput);
//            companySiteStateInput.sendKeys(data.getProperty("companySiteStateInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCountryHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCountryClick);
//            companySiteCountryClick.click();
//            companySiteCountrySelect.click();
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySitePostCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySitePostCodeInput);
//            companySitePostCodeInput.sendKeys(data.getProperty("companySitePostCodeInput1"));
//
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.actionMethod(companySiteActiveCheckboxClick);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.javaScriptClick(companySiteActiveCheckboxClick);
//
//            //            OR
//
////            TestUtil.actionActiveCheckbox(companySiteActiveCheckboxClick);
////            TestUtil.waiting(1000);
////            TestUtil.javaScriptForClick(companySiteActiveCheckboxClick);
//
////            companySiteSaveBtn.click();
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompanySiteDetail31() {
//        try {
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            TestUtil.waiting(1000);
//            TestUtil.javaScriptClick(companyAddCompanySiteBtn);
////            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.scrollTo(companySiteCloseBtn);
//
//            TestUtil.highlightElement(companySiteCloseBtn);
//            companySiteCloseBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteMainHeader.isDisplayed(), "Company Site Main Header missing");
//            Assert.assertTrue(companySiteCompanyHeader.isDisplayed(), "Company Company Header missing");
//            TestUtil.highlightElement(companySiteCompanyClick);
//            companySiteCompanyClick.click();
//            companySiteCompanySelect.click();
//
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCodeInput);
//            companySiteCodeInput.sendKeys(data.getProperty("companySiteCodeInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteNameHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteNameInput);
//            companySiteNameInput.sendKeys(data.getProperty("companySiteNameInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress1Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress1Input);
//            companySiteAddress1Input.sendKeys(data.getProperty("companySiteAddress1Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress2Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress2Input);
//            companySiteAddress2Input.sendKeys(data.getProperty("companySiteAddress2Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress3Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress3Input);
//            companySiteAddress3Input.sendKeys(data.getProperty("companySiteAddress3Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress4Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress4Input);
//            companySiteAddress4Input.sendKeys(data.getProperty("companySiteAddress4Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCityHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCityInput);
//            companySiteCityInput.sendKeys(data.getProperty("companySiteCityInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteStateHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteStateInput);
//            companySiteStateInput.sendKeys(data.getProperty("companySiteStateInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCountryHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCountryClick);
//            companySiteCountryClick.click();
//            companySiteCountrySelect.click();
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySitePostCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySitePostCodeInput);
//            companySitePostCodeInput.sendKeys(data.getProperty("companySitePostCodeInput1"));
//
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.actionMethod(companySiteActiveCheckboxClick);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.javaScriptClick(companySiteActiveCheckboxClick);
//
//            //            OR
//
////            TestUtil.actionActiveCheckbox(companySiteActiveCheckboxClick);
////            TestUtil.waiting(1000);
////            TestUtil.javaScriptForClick(companySiteActiveCheckboxClick);
//
////            companySiteSaveBtn.click();
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompanySiteDetail32() {
//        try {
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            TestUtil.waiting(1000);
//            TestUtil.javaScriptClick(companyAddCompanySiteBtn);
////            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.scrollTo(companySiteCloseBtn);
//
//            TestUtil.highlightElement(companySiteCloseBtn);
//            companySiteCloseBtn.click();
//            TestUtil.waiting(2000);
//
//            TestUtil.highlightElement(companyAddCompanySiteBtn);
//            companyAddCompanySiteBtn.click();
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteMainHeader.isDisplayed(), "Company Site Main Header missing");
//            Assert.assertTrue(companySiteCompanyHeader.isDisplayed(), "Company Company Header missing");
//            TestUtil.highlightElement(companySiteCompanyClick);
//            companySiteCompanyClick.click();
//            companySiteCompanySelect.click();
//
//            TestUtil.waiting(2000);
//            Assert.assertTrue(companySiteCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCodeInput);
//            companySiteCodeInput.sendKeys(data.getProperty("companySiteCodeInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteNameHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteNameInput);
//            companySiteNameInput.sendKeys(data.getProperty("companySiteNameInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress1Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress1Input);
//            companySiteAddress1Input.sendKeys(data.getProperty("companySiteAddress1Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress2Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress2Input);
//            companySiteAddress2Input.sendKeys(data.getProperty("companySiteAddress2Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress3Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress3Input);
//            companySiteAddress3Input.sendKeys(data.getProperty("companySiteAddress3Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteAddress4Header.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteAddress4Input);
//            companySiteAddress4Input.sendKeys(data.getProperty("companySiteAddress4Input1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCityHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCityInput);
//            companySiteCityInput.sendKeys(data.getProperty("companySiteCityInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteStateHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteStateInput);
//            companySiteStateInput.sendKeys(data.getProperty("companySiteStateInput1"));
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySiteCountryHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySiteCountryClick);
//            companySiteCountryClick.click();
//            companySiteCountrySelect.click();
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companySitePostCodeHeader.isDisplayed(), "Company Site Code Header missing");
//            TestUtil.highlightElement(companySitePostCodeInput);
//            companySitePostCodeInput.sendKeys(data.getProperty("companySitePostCodeInput1"));
//
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.actionMethod(companySiteActiveCheckboxClick);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companySiteActiveCheckboxClick);
//            TestUtil.javaScriptClick(companySiteActiveCheckboxClick);
//
//            //            OR
//
////            TestUtil.actionActiveCheckbox(companySiteActiveCheckboxClick);
////            TestUtil.waiting(1000);
////            TestUtil.javaScriptForClick(companySiteActiveCheckboxClick);
//
////            companySiteSaveBtn.click();
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void addCompanySite(){
        addCompanySiteDetail11();
        addCompanySiteDetail12();
    }
}
