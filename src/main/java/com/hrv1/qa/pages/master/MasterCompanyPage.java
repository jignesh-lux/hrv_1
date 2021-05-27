package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MasterCompanyPage extends TestBase {

    // Initializing the PageObject

    public MasterCompanyPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h1[contains(text(),'Company List')]")
    public static WebElement companyListHeader;

    @FindBy(xpath = "//a[contains(text(),'Add Company')]")
    public static WebElement companyAddCompanyBtn;

    // ----------------------- Step 1 ---------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Step 1 of 4')]")
    public static WebElement companyStep1Header;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]")
    public static WebElement companyStep1PageHeader;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]/../../../../..//label[contains(text(),'Name')]")
    public static WebElement addCompanyStep1NameHeader;

    @FindBy(xpath = "//div[contains(text(),' Name is required ! ')]")
    public static WebElement addCompanyNameRequiredErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Name does not allow Special Characters \" \\')]")
    public static WebElement addCompanyNameSpecialCharacterErrorMessage;

    @FindBy(xpath = "//input[@id='company_Name']")
    public static WebElement addCompanyStep1NameInput;


    @FindBy(xpath = "//span[contains(text(),'Basic Info')]/../../../../..//label[contains(text(),'Registration No')]")
    public static WebElement addCompanyStep1RegistrationNoHeader;

    @FindBy(xpath = "//div[contains(text(),' Registration No is required ! ')]")
    public static WebElement addCompanyRegistrationNoRequiredErrorMessage;

    @FindBy(xpath = "//div[contains(text(),' Registration No only alphabets and numeric value allow ! ')]")
    public static WebElement addCompanyRegistrationNoSpecialCharacterErrorMessage;

    @FindBy(xpath = "//input[@id='registration_No']")
    public static WebElement addCompanyStep1RegistrationNoInput;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]/../../../../..//label[contains(text(),'Registration Date')]")
    public static WebElement addCompanyStep1RegistrationDateHeader;

    //div[contains(text(),' Registration Date is required ! ')]

    //input[@id='registration_Date']

    @FindBy(xpath = "//input[@id='registration_Date']")
    public static WebElement addCompanyStep1RegistrationDateInput;

    @FindBy(xpath = "//select[@class='flatpickr-monthDropdown-months']")
    public static WebElement addCompanyStep1RegistrationDateMonth;

//    @FindBy(xpath = "(//select[@class='flatpickr-monthDropdown-months'])[2]")
//    public static WebElement addCompany2Step1RegistrationDateMonth;
//
//    @FindBy(xpath = "(//select[@class='flatpickr-monthDropdown-months'])[3]")
//    public static WebElement addCompany3Step1RegistrationDateMonth;

    @FindBy(xpath = "//input[@class='numInput cur-year']")
    public static WebElement addCompanyStep1RegistrationDateYear;

//    @FindBy(xpath = "(//input[@class='numInput cur-year'])[2]")
//    public static WebElement addCompany2Step1RegistrationDateYear;
//
//    @FindBy(xpath = "(//input[@class='numInput cur-year'])[3]")
//    public static WebElement addCompany3Step1RegistrationDateYear;

    @FindBy(xpath = "//div[@class='dayContainer']//span[@aria-label='May 3, 1994']")
    public static WebElement addCompany1Step1RegistrationDateDay;

//    @FindBy(xpath = "//div[@class='dayContainer']//span[@aria-label='April 3, 1994']")
//    public static WebElement addCompany2Step1RegistrationDateDay;
//
//    @FindBy(xpath = "(//div[@class='dayContainer']//span[@aria-label='June 3, 1994'])[2]")
//    public static WebElement addCompany3Step1RegistrationDateDay;


    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public static WebElement addCompanyStep1ContinueBtn;

    // ----------------------- Step 2 ---------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Step 2 of 4')]")
    public static WebElement companyStep2Header;

    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    public static WebElement companyStep2PageHeader;

    @FindBy(xpath = "//label[contains(text(),'Logo')]")
    public static WebElement companyStep2LogoHeader;

    @FindBy(xpath = "//input[@id='companyLogo']")
    //    @FindBy(xpath = "//div[@id='companyLogoImage']")
    public static WebElement companyStep2LogoInput;

    @FindBy(xpath = "//label[contains(text(),'Currency')]")
    public static WebElement companyStep2CurrencyHeader;

    @FindBy(xpath = "//select[@id='currency']")
    public static WebElement companyStep2CurrencyClick;

    @FindBy(xpath = "//option[contains(text(),'Dollar - $')]")
    public static WebElement companyStep2CurrencySelect;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public static WebElement addCompanyStep2BackBtn;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public static WebElement addCompanyStep2ContinueBtn;

    // ----------------------- Step 3 ---------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Step 3 of 4')]")
    public static WebElement companyStep3Header;

    @FindBy(xpath = "//span[contains(text(),'Contact')]")
    public static WebElement companyStep3PageHeader;

    //    @FindBy(xpath = "//th[contains(text(),'Contact Type')]")
    @FindBy(xpath = "//*[text()='Contact Type ']")
    public static WebElement companyStep3ContactTypeHeader;

    // Email

    @FindBy(xpath = "//select[@id='Contact_Type0']")
    public static WebElement companyStep3ContactType0Click;

    @FindBy(xpath = "//option[contains(text(),'Email')]")
    public static WebElement companyStep3ContactType0EmailSelect;

    //    @FindBy(xpath = "//th[contains(text(),'Contact Info')]")
    @FindBy(xpath = "//*[text()='Contact Info ']")
    public static WebElement companyStep3ContactValueHeader;

    @FindBy(xpath = "//input[@id='contact_Value0']")
    public static WebElement companyStep3ContactValue0EmailInput;

    @FindBy(xpath = "//label[@for='isDefault0']//span[@class='check']")
    public static WebElement companyStep3EmailDefaultCheckbox0;

    @FindBy(xpath = "//label[@for='isActive0']//span[@class='check']")
    public static WebElement companyStep3EmailActiveCheckbox0;

    @FindBy(xpath = "//button[@class='btn pull-right']//i[@class='fa fa-plus']")
    public static WebElement companyStep3AddRow;

    // Mobile No

    @FindBy(xpath = "//select[@id='Contact_Type1']")
    public static WebElement companyStep3ContactType1MobileNoClick;

    @FindBy(xpath = "//select[@id='Contact_Type1']//option[@value='Mobile No']")
    public static WebElement companyStep3ContactType1MobileNoSelect;

    @FindBy(xpath = "//ng-select2[@id='country_Id1']/../..//div[@class='input-group-btn']")
    public static WebElement companyStep3ContactMobileCountryCodeType1Click;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
    public static WebElement companyStep3ContactMobileNoCountryCodeType1InputValue;

    @FindBy(xpath = "//li[contains(text(),'India (+91)')]")
    public static WebElement companyStep3ContactMobileCountryCodeType1InputValueSelect;

    @FindBy(xpath = "//input[@id='contact_Value1']")
    public static WebElement companyStep3ContactMobileNoValue1Input;

    @FindBy(xpath = "//label[@for='isDefault1']//span[@class='check']")
    public static WebElement companyStep3MobileNoDefaultCheckbox1;

    @FindBy(xpath = "//label[@for='isActive1']//span[@class='check']")
    public static WebElement companyStep3MobileNoActiveCheckbox1;

    // Phone No

    @FindBy(xpath = "//select[@id='Contact_Type2']")
    public static WebElement companyStep3ContactType2PhoneNoClick;

    @FindBy(xpath = "//select[@id='Contact_Type2']//option[@value='Phone No']")
    public static WebElement companyStep3ContactType2PhoneNoSelect;

    @FindBy(xpath = "//ng-select2[@id='country_Id2']/../..//div[@class='input-group-btn']")
    public static WebElement companyStep3ContactPhoneCountryCodeType1Click;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
    public static WebElement companyStep3ContactPhoneNoCountryCodeType1InputValue;

    @FindBy(xpath = "//li[contains(text(),'India (+91)')]")
    public static WebElement companyStep3ContactPhoneCountryCodeType1InputValueSelect;

    @FindBy(xpath = "//input[@id='contact_Value2']")
    public static WebElement companyStep3ContactPhoneNoValue1Input;

    @FindBy(xpath = "//label[@for='isDefault2']//span[@class='check']")
    public static WebElement companyStep3PhoneNoDefaultCheckbox2;

    @FindBy(xpath = "//label[@for='isActive2']//span[@class='check']")
    public static WebElement companyStep3PhoneNoActiveCheckbox2;

    // Fax

    @FindBy(xpath = "//select[@id='Contact_Type3']")
    public static WebElement companyStep3ContactType3FaxClick;

    @FindBy(xpath = "//select[@id='Contact_Type3']//option[@value='Fax']")
    public static WebElement companyStep3ContactType3FaxSelect;

    @FindBy(xpath = "//input[@id='contact_Value3']")
    public static WebElement companyStep3ContactFaxValue1Input;

    @FindBy(xpath = "//label[@for='isDefault3']//span[@class='check']")
    public static WebElement companyStep3FaxDefaultCheckbox3;

    @FindBy(xpath = "//label[@for='isActive3']//span[@class='check']")
    public static WebElement companyStep3FaxActiveCheckbox3;

    // Website

    @FindBy(xpath = "//select[@id='Contact_Type4']")
    public static WebElement companyStep3ContactType4WebsiteClick;

    @FindBy(xpath = "//select[@id='Contact_Type4']//option[@value='WebSite']")
    public static WebElement companyStep3ContactTypeWebsiteSelect;

    @FindBy(xpath = "//input[@id='contact_Value4']")
    public static WebElement companyStep3ContactWebsiteValue1Input;

    @FindBy(xpath = "//label[@for='isDefault4']//span[@class='check']")
    public static WebElement companyStep3WebsiteDefaultCheckbox4;

    @FindBy(xpath = "//label[@for='isActive4']//span[@class='check']")
    public static WebElement companyStep3WebsiteActiveCheckbox4;

//    Delete Website

    @FindBy(xpath = "(//i[@class='fa fa-minus'])[4]")
    public static WebElement companyStepDeleteRow3;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public static WebElement addCompanyStep3BackBtn;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public static WebElement addCompanyStep3ContinueBtn;

    // ----------------------- Step 4 ---------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Step 4 of 4')]")
    public static WebElement companyStep4Header;

    @FindBy(xpath = "//span[contains(text(),'Step 4 of 4')]/../../../..//span[contains(text(),'Configuration')]")
    public static WebElement companyStep4PageHeader;

    @FindBy(xpath = "//label[contains(text(),'Accross Company')]")
    public static WebElement companyStep4AcrossCompanyHeader;

    @FindBy(xpath = "//label[contains(text(),'Accross Company')]/..//span[@class='check']/..//span[@class='box']")
    public static WebElement companyStep4AcrossCompanyCheckboxSelect;

    @FindBy(xpath = "//label[contains(text(),'Prefix')]")
    public static WebElement companyStep4PrefixHeader;

    @FindBy(xpath = "//input[@id='prefix']")
    public static WebElement companyStep4PrefixInput;

    @FindBy(xpath = "//label[contains(text(),'Total Length')]")
    public static WebElement companyStep4TotalLengthHeader;

    @FindBy(xpath = "//input[@id='total_Digit']")
    public static WebElement companyStep4TotalLengthInput;

    @FindBy(xpath = "//label[contains(text(),'Total Length')]/../..//label[contains(text(),'Employee Code')]")
    public static WebElement companyStep4EmployeeCodeHeader;

    @FindBy(xpath = "//input[@id='displayCode']")
    public static WebElement companyStep4EmployeeCodeInput;


    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public static WebElement addCompanyStep4BackBtn;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    public static WebElement addCompanyStep4SaveBtn;

    @FindBy(xpath = "//a[contains(text(),'Record saved successfully !')]")
    public static WebElement companySaveSuccessMessage;

    @FindBy(xpath = "//i[@data-original-title='Go Back']")
    public static WebElement companyGoBackBtn;

    public void calender1() {
        try {
            TestUtil.highlightElement(addCompanyStep1RegistrationDateInput);
            addCompanyStep1RegistrationDateInput.click();
            TestUtil.highlightElement(addCompanyStep1RegistrationDateMonth);
            TestUtil.selectMethod(addCompanyStep1RegistrationDateMonth, "May");
            Thread.sleep(1000);
            TestUtil.highlightElement(addCompanyStep1RegistrationDateYear);
            addCompanyStep1RegistrationDateYear.clear();
            Thread.sleep(1000);
            addCompanyStep1RegistrationDateYear.sendKeys(data.getProperty("addCompanyStep1RegistrationDateYear1"));
            TestUtil.highlightElement(addCompany1Step1RegistrationDateDay);
            addCompany1Step1RegistrationDateDay.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public void calender2() {
//        try {
//            TestUtil.highlightElement(addCompanyStep1RegistrationDateInput);
//            addCompanyStep1RegistrationDateInput.click();
//            TestUtil.highlightElement(addCompany2Step1RegistrationDateMonth);
//            TestUtil.selectMethod(addCompany2Step1RegistrationDateMonth,"April");
//            Thread.sleep(2000);
//            TestUtil.highlightElement(addCompany2Step1RegistrationDateYear);
//            addCompany2Step1RegistrationDateYear.clear();
//            Thread.sleep(1000);
//            addCompany2Step1RegistrationDateYear.sendKeys(data.getProperty("addCompanyStep1RegistrationDateYear2"));
//            TestUtil.highlightElement(addCompany2Step1RegistrationDateDay);
//            addCompany2Step1RegistrationDateDay.click();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public void calender3() {
//        try {
//            TestUtil.highlightElement(addCompanyStep1RegistrationDateInput);
//            addCompanyStep1RegistrationDateInput.click();
//            TestUtil.highlightElement(addCompany3Step1RegistrationDateMonth);
//            TestUtil.selectMethod(addCompany3Step1RegistrationDateMonth,"June");
//            Thread.sleep(2000);
//            TestUtil.highlightElement(addCompany3Step1RegistrationDateYear);
//            addCompany3Step1RegistrationDateYear.clear();
//            Thread.sleep(2000);
//            addCompany3Step1RegistrationDateYear.sendKeys(data.getProperty("addCompanyStep1RegistrationDateYear3"));
//            TestUtil.highlightElement(addCompany3Step1RegistrationDateDay);
//            addCompany3Step1RegistrationDateDay.click();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // Company 1 method

    public void addCompany1Step1() {
        try {
            TestUtil.waiting(2000);
            TestUtil.highlightElement(companyAddCompanyBtn);
            companyAddCompanyBtn.click();
            TestUtil.waiting(2000);

            TestUtil.highlightElement(companyStep1Header);
            Assert.assertTrue(companyStep1Header.isDisplayed(), "Company Step1 Header missing");
            TestUtil.highlightElement(companyStep1PageHeader);
            Assert.assertTrue(companyStep1PageHeader.isDisplayed(), "Company Step1 Basic Info Header missing");

            TestUtil.highlightElement(addCompanyStep1NameHeader);
            Assert.assertTrue(addCompanyStep1NameHeader.isDisplayed(), "Company Step1 Name Header missing");
            TestUtil.highlightElement(addCompanyStep1ContinueBtn);
            MasterCompanyPage.addCompanyStep1ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyNameRequiredErrorMessage);
            Assert.assertTrue(addCompanyNameRequiredErrorMessage.isDisplayed(), " Name is required ! message missing");
            TestUtil.waiting(1000);
            addCompanyNameRequiredErrorMessage.click();

            TestUtil.waiting(1000);
            addCompanyStep1NameInput.sendKeys(data.getProperty("addCompanyStep1NameInValidInput"));
            TestUtil.waiting(1000);

            Assert.assertTrue(addCompanyStep1RegistrationNoHeader.isDisplayed(), "Company Step1 Registration No Header missing");

            MasterCompanyPage.addCompanyStep1ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyRegistrationNoRequiredErrorMessage);
            Assert.assertTrue(addCompanyRegistrationNoRequiredErrorMessage.isDisplayed(), " Registration No is required ! message missing");
            TestUtil.waiting(1000);
            addCompanyRegistrationNoRequiredErrorMessage.click();

            TestUtil.waiting(1000);
            addCompanyStep1RegistrationNoInput.sendKeys(data.getProperty("addCompanyStep1RegistrationNoInValidInput"));
            TestUtil.waiting(1000);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep1RegistrationDateHeader);
            TestUtil.waiting(1000);
            calender1();
            TestUtil.waiting(1000);

//            Company Name Special Character Error Message

            MasterCompanyPage.addCompanyStep1ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyNameSpecialCharacterErrorMessage);
            Assert.assertTrue(addCompanyNameSpecialCharacterErrorMessage.isDisplayed(), " Name does not allow Special Characters ! message missing ");
            TestUtil.waiting(1000);
            addCompanyNameSpecialCharacterErrorMessage.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep1NameInput);
            TestUtil.clearElement(addCompanyStep1NameInput);
            TestUtil.waiting(1000);
            addCompanyStep1NameInput.sendKeys(data.getProperty("addCompanyStep1NameInput1"));
            MasterCompanyPage.addCompanyStep1ContinueBtn.click();

//            Registration No  Special Character Error Message

            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyRegistrationNoSpecialCharacterErrorMessage);
            Assert.assertTrue(addCompanyRegistrationNoSpecialCharacterErrorMessage.isDisplayed(), " Name does not allow Special Characters ! message missing ");
            TestUtil.waiting(1000);
            addCompanyRegistrationNoSpecialCharacterErrorMessage.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep1RegistrationNoInput);
            TestUtil.clearElement(addCompanyStep1RegistrationNoInput);
            TestUtil.waiting(1000);
            addCompanyStep1RegistrationNoInput.sendKeys(data.getProperty("addCompanyStep1RegistrationNoInput1"));
            MasterCompanyPage.addCompanyStep1ContinueBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void addCompany1Step1Dummy() {
//        TestUtil.highlightElement(companyAddCompanyBtn);
//        companyAddCompanyBtn.click();
//        addCompanyStep1NameInput.sendKeys(data.getProperty("addCompanyStep1NameInput1"));
//        addCompanyStep1RegistrationNoInput.sendKeys(data.getProperty("addCompanyStep1RegistrationNoInput1"));
//        calender1();
//        MasterCompanyPage.addCompanyStep1ContinueBtn.click();
//    }

    public void addCompany1Step2() {
        try {
            TestUtil.waiting(2000);
            TestUtil.highlightElement(companyStep2Header);
            TestUtil.waiting(1000);
            Assert.assertTrue(companyStep2Header.isDisplayed(), "Company Step2 Header missing");
            TestUtil.highlightElement(companyStep2PageHeader);
            Assert.assertTrue(companyStep2PageHeader.isDisplayed(), "Company Step2 Setting  Header missing");

            TestUtil.highlightElement(companyStep2LogoHeader);
            Assert.assertTrue(companyStep2LogoHeader.isDisplayed(), "Company Step2 Contact  Header missing");
            companyStep2LogoInput.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\hrv1\\qa\\testdata\\Google.png");
            TestUtil.waiting(2000);
            Assert.assertTrue(companyStep2CurrencyHeader.isDisplayed(), "Company Step2 Currency  Header missing");
            TestUtil.highlightElement(companyStep2CurrencyClick);
            TestUtil.waiting(1000);
            companyStep2CurrencyClick.click();
            TestUtil.waiting(1000);
            companyStep2CurrencySelect.click();

            TestUtil.highlightElement(addCompanyStep2BackBtn);
            addCompanyStep2BackBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep1ContinueBtn);
            addCompanyStep1ContinueBtn.click();
            TestUtil.waiting(1000);
            addCompanyStep2ContinueBtn.click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void addCompany1Step2Dummy() {
////        Assert.assertTrue(companyStep2LogoHeader.isDisplayed(), "Company Step2 Contact  Header missing");
////        companyStep2LogoInput.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\hrv1\\qa\\testdata\\Google.png");
////        TestUtil.waiting(2000);
////        TestUtil.highlightElement(companyStep2CurrencyClick);
////        TestUtil.waiting(1000);
////        companyStep2CurrencyClick.click();
////        TestUtil.waiting(1000);
////        companyStep2CurrencySelect.click();
//        addCompanyStep2ContinueBtn.click();
//    }

    public void addCompany1Step3() {
        try {
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3Header);
            Assert.assertTrue(companyStep3Header.isDisplayed(), "Company Step3 Header missing");
            TestUtil.highlightElement(companyStep3PageHeader);
            Assert.assertTrue(companyStep3PageHeader.isDisplayed(), "Company Step3 Contact  Header missing");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3ContactTypeHeader);
            Assert.assertTrue(companyStep3ContactTypeHeader.isDisplayed(), "Company Step3 Contact Type Header missing");
            TestUtil.highlightElement(companyStep3ContactType0Click);
            companyStep3ContactType0Click.click();
            TestUtil.waiting(1000);
            companyStep3ContactType0EmailSelect.click();

            TestUtil.waiting(1000);
            Assert.assertTrue(companyStep3ContactValueHeader.isDisplayed(), "Company Step3 Contact Value Header missing");
            TestUtil.highlightElement(companyStep3ContactValue0EmailInput);
            companyStep3ContactValue0EmailInput.sendKeys(data.getProperty("companyStep3ContactValue0InputEmail1"));

            TestUtil.highlightElement(companyStep3EmailDefaultCheckbox0);
            TestUtil.actionMethod(companyStep3EmailDefaultCheckbox0);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3EmailActiveCheckbox0);
            companyStep3EmailActiveCheckbox0.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3EmailActiveCheckbox0);
            TestUtil.actionMethod(companyStep3EmailActiveCheckbox0);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3AddRow);
            companyStep3AddRow.click();

//          Mobile No

            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3ContactType1MobileNoClick);
            companyStep3ContactType1MobileNoClick.click();
            TestUtil.waiting(1000);
            companyStep3ContactType1MobileNoSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactMobileCountryCodeType1Click.click();
            TestUtil.waiting(1000);
            companyStep3ContactMobileNoCountryCodeType1InputValue.sendKeys(data.getProperty("countryCodeInput"));
            TestUtil.waiting(1000);
            companyStep3ContactMobileCountryCodeType1InputValueSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactMobileNoValue1Input.sendKeys(data.getProperty("companyStep3ContactValue1InputMobileNo1"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(companyStep3MobileNoDefaultCheckbox1);
            TestUtil.actionMethod(companyStep3MobileNoDefaultCheckbox1);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3MobileNoActiveCheckbox1);
            companyStep3MobileNoActiveCheckbox1.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3MobileNoActiveCheckbox1);
            TestUtil.actionMethod(companyStep3MobileNoActiveCheckbox1);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3AddRow);
            companyStep3AddRow.click();

//          Phone No

            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3ContactType2PhoneNoClick);
            companyStep3ContactType2PhoneNoClick.click();
            TestUtil.waiting(1000);
            companyStep3ContactType2PhoneNoSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactPhoneCountryCodeType1Click.click();
            TestUtil.waiting(1000);
            companyStep3ContactPhoneNoCountryCodeType1InputValue.sendKeys(data.getProperty("countryCodeInput"));
            TestUtil.waiting(1000);
            companyStep3ContactPhoneCountryCodeType1InputValueSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactPhoneNoValue1Input.sendKeys(data.getProperty("companyStep3ContactValue2InputPhoneNo1"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(companyStep3PhoneNoDefaultCheckbox2);
            TestUtil.waiting(1000);
            TestUtil.actionMethod(companyStep3PhoneNoDefaultCheckbox2);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3PhoneNoActiveCheckbox2);
            companyStep3PhoneNoActiveCheckbox2.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3PhoneNoActiveCheckbox2);
            TestUtil.actionMethod(companyStep3PhoneNoActiveCheckbox2);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3AddRow);
            companyStep3AddRow.click();

//            Fax

            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3ContactType3FaxClick);
            companyStep3ContactType3FaxClick.click();
            TestUtil.waiting(1000);
            companyStep3ContactType3FaxSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactFaxValue1Input.sendKeys(data.getProperty("companyStep3ContactValue3InputFax1"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(companyStep3FaxDefaultCheckbox3);
            TestUtil.waiting(1000);
            TestUtil.actionMethod(companyStep3FaxDefaultCheckbox3);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3FaxActiveCheckbox3);
            companyStep3FaxActiveCheckbox3.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3FaxActiveCheckbox3);
            TestUtil.actionMethod(companyStep3FaxActiveCheckbox3);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3AddRow);
            companyStep3AddRow.click();

//            Add Website

            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3ContactType4WebsiteClick);
            companyStep3ContactType4WebsiteClick.click();
            TestUtil.waiting(1000);
            companyStep3ContactTypeWebsiteSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactWebsiteValue1Input.sendKeys(data.getProperty("companyStep3ContactValue4InputWebsite1"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(companyStep3WebsiteDefaultCheckbox4);
            TestUtil.waiting(1000);
            TestUtil.actionMethod(companyStep3WebsiteDefaultCheckbox4);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3WebsiteActiveCheckbox4);
            companyStep3WebsiteActiveCheckbox4.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3WebsiteActiveCheckbox4);
            TestUtil.actionMethod(companyStep3WebsiteActiveCheckbox4);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3AddRow);
            companyStep3AddRow.click();

//            Delete Website

            TestUtil.waiting(1000);
            companyStepDeleteRow3.click();
            companyStep3AddRow.click();

//            Add Website Again

            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3ContactType4WebsiteClick);
            companyStep3ContactType4WebsiteClick.click();
            TestUtil.waiting(1000);
            companyStep3ContactTypeWebsiteSelect.click();
            TestUtil.waiting(1000);
            companyStep3ContactWebsiteValue1Input.sendKeys(data.getProperty("companyStep3ContactValue4InputWebsite1"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(companyStep3WebsiteDefaultCheckbox4);
            TestUtil.waiting(1000);
            TestUtil.actionMethod(companyStep3WebsiteDefaultCheckbox4);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3WebsiteActiveCheckbox4);
            companyStep3WebsiteActiveCheckbox4.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3WebsiteActiveCheckbox4);
            TestUtil.actionMethod(companyStep3WebsiteActiveCheckbox4);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep3AddRow);


            TestUtil.highlightElement(addCompanyStep3BackBtn);
            addCompanyStep3BackBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep2ContinueBtn);
            addCompanyStep2ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep3ContinueBtn);
            addCompanyStep3ContinueBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void addCompany1Step3Dummy() {
//        TestUtil.waiting(1000);
//        companyStep3ContactType0Click.click();
//        companyStep3ContactType0EmailSelect.click();
//        companyStep3ContactValue0EmailInput.sendKeys(data.getProperty("companyStep3ContactValue0InputEmail1"));
//        TestUtil.actionMethod(companyStep3EmailDefaultCheckbox0);
//        companyStep3EmailActiveCheckbox0.click();
//        TestUtil.actionMethod(companyStep3EmailActiveCheckbox0);
//
//        addCompanyStep3ContinueBtn.click();
//
//    }

    public void addCompany1Step4() {
        try {
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep4Header);
            Assert.assertTrue(companyStep4Header.isDisplayed(), "Company Step4 Header missing");
            TestUtil.waiting(1000);
            TestUtil.highlightElement(companyStep4PageHeader);
            Assert.assertTrue(companyStep4PageHeader.isDisplayed(), "Company Step4  Configuration  Header missing");

            Assert.assertTrue(companyStep4AcrossCompanyHeader.isDisplayed(), "Company Step4  Across Company  Header missing");
            TestUtil.highlightElement(companyStep4AcrossCompanyCheckboxSelect);
            TestUtil.actionMethod(companyStep4AcrossCompanyCheckboxSelect);

            TestUtil.waiting(1000);
            Assert.assertTrue(companyStep4PrefixHeader.isDisplayed(), "Company Step4  Prefix  Header missing");
            TestUtil.highlightElement(companyStep4PrefixInput);
            Assert.assertEquals(companyStep4PrefixInput.getAttribute("value"), "E", "Prefix not match with the Across company filed");

            TestUtil.waiting(1000);
            Assert.assertTrue(companyStep4TotalLengthHeader.isDisplayed(), "Company Step4  Prefix  Header missing");
            TestUtil.highlightElement(companyStep4TotalLengthInput);
            Assert.assertEquals(companyStep4TotalLengthInput.getAttribute("value"), "6", "Total Length not match with the Across company filed");

            TestUtil.waiting(1000);
            Assert.assertTrue(companyStep4EmployeeCodeHeader.isDisplayed(), "Company Step4  Prefix  Header missing");
            TestUtil.highlightElement(companyStep4EmployeeCodeInput);
            Assert.assertEquals(companyStep4EmployeeCodeInput.getAttribute("value"), "E00000 - E99999", "Total Length not match with the Across company filed");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep4BackBtn);
            addCompanyStep4BackBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep3ContinueBtn);
            addCompanyStep3ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(addCompanyStep4SaveBtn);
            addCompanyStep4SaveBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Company 2 method

//    public void addCompany2Step1() {
//        try {
//            Thread.sleep(2000);
////            TestUtil.scrollTo(companyAddCompanyBtn)
////            Assert.assertTrue(companySaveSuccessMessage.isDisplayed(), "Company Save Success message missing");
//
//            TestUtil.scrollToTop();
//            TestUtil.waiting(1000);
//
//            TestUtil.highlightElement(companyAddCompanyBtn);
//            companyAddCompanyBtn.click();
//            TestUtil.waiting(1000);
//
////            TestUtil.waiting(2000);
//
//            Assert.assertTrue(companyStep1Header.isDisplayed(), "Company Step1 Header missing");
//            Assert.assertTrue(companyStep1PageHeader.isDisplayed(), "Company Step1 Basic Info Header missing");
//
//            Assert.assertTrue(addCompanyStep1NameHeader.isDisplayed(), "Company Step1 Name Header missing");
//            TestUtil.highlightElement(addCompanyStep1NameInput);
//            addCompanyStep1NameInput.sendKeys(data.getProperty("addCompanyStep1NameInput2"));
//
//            Assert.assertTrue(addCompanyStep1RegistrationNoHeader.isDisplayed(), "Company Step1 Registration No Header missing");
//            TestUtil.highlightElement(addCompanyStep1RegistrationNoInput);
//            addCompanyStep1RegistrationNoInput.sendKeys(data.getProperty("addCompanyStep1RegistrationNoInput2"));
//
//            Assert.assertTrue(addCompanyStep1RegistrationDateHeader.isDisplayed(), "Company Step1 Registration Date Header missing");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompany2Step2() {
//        try {
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companyStep2Header.isDisplayed(), "Company Step2 Header missing");
//            Assert.assertTrue(companyStep2PageHeader.isDisplayed(), "Company Step2 Setting  Header missing");
//
//            Assert.assertTrue(companyStep2LogoHeader.isDisplayed(), "Company Step2 Contact  Header missing");
//            // (System.getProperty("user.dir") + "\\src\\main\\java\\com\\hr\\qa\\config\\config.properties")
//            companyStep2LogoInput.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\hr\\qa\\testdata\\GRPL.png");
//            TestUtil.waiting(4000);
//            Assert.assertTrue(companyStep2CurrencyHeader.isDisplayed(), "Company Step2 Currency  Header missing");
//            TestUtil.highlightElement(companyStep2CurrencyClick);
//            companyStep2CurrencyClick.click();
//            TestUtil.waiting(1000);
//            companyStep2CurrencySelect.click();
//
//            Assert.assertTrue(companyStep2LanguageHeader.isDisplayed(), "Company Step2 Language  Header missing");
//            TestUtil.highlightElement(companyStep2LanguageClick);
//            companyStep2LanguageClick.click();
//            TestUtil.waiting(1000);
//            companyStep2LanguageSelect.click();
//
//            TestUtil.highlightElement(addCompanyStep2BackBtn);
//            addCompanyStep2BackBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep1ContinueBtn);
//            addCompanyStep1ContinueBtn.click();
//            TestUtil.waiting(1000);
//            addCompanyStep2ContinueBtn.click();
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompany2Step3() {
//        try {
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companyStep3Header.isDisplayed(), "Company Step3 Header missing");
//            Assert.assertTrue(companyStep3PageHeader.isDisplayed(), "Company Step3 Contact  Header missing");
//
//            Assert.assertTrue(companyStep3ContactTypeHeader.isDisplayed(), "Company Step3 Contact Type Header missing");
//            TestUtil.highlightElement(companyStep3ContactType0Click);
//            companyStep3ContactType0Click.click();
//            TestUtil.waiting(1000);
//            companyStep3ContactType0Select.click();
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companyStep3ContactValueHeader.isDisplayed(), "Company Step3 Contact Value Header missing");
//            TestUtil.highlightElement(companyStep3ContactValue0Input);
//            companyStep3ContactValue0Input.sendKeys(data.getProperty("companyStep3ContactValue0InputEmail2"));
//
//            TestUtil.highlightElement(companyStep3DefaultCheckbox0);
//            TestUtil.actionMethod(companyStep3DefaultCheckbox0);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox0);
//            companyStep3ActiveCheckbox0.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox0);
//            TestUtil.actionMethod(companyStep3ActiveCheckbox0);
//            TestUtil.waiting(1000);
//
//            TestUtil.highlightElement(companyStep3AddRow);
//            companyStep3AddRow.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ContactType1Click);
//            companyStep3ContactType1Click.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ContactType1Select);
//            TestUtil.waiting(1000);
//            companyStep3ContactType1Select.click();
//            TestUtil.highlightElement(companyStep3ContactValue1Input);
//            companyStep3ContactValue1Input.sendKeys(data.getProperty("companyStep3ContactValue0InputMobileNo2"));
//
//            TestUtil.highlightElement(companyStep3DefaultCheckbox1);
//            TestUtil.actionMethod(companyStep3DefaultCheckbox1);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox1);
//            companyStep3ActiveCheckbox1.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox1);
//            TestUtil.actionMethod(companyStep3ActiveCheckbox1);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3AddRow);
//            companyStep3AddRow.click();
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStepDeleteRow3);
//            companyStepDeleteRow3.click();
//
//            TestUtil.highlightElement(addCompanyStep3BackBtn);
//            addCompanyStep3BackBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep2ContinueBtn);
//            addCompanyStep2ContinueBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep3ContinueBtn);
//            addCompanyStep3ContinueBtn.click();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompany2Step4() {
//        try {
//            TestUtil.waiting(1000);
//
//            Assert.assertTrue(companyStep4Header.isDisplayed(), "Company Step4 Header missing");
//            Assert.assertTrue(companyStep4PageHeader.isDisplayed(), "Company Step4 Email Configuration  Header missing");
//
////            Assert.assertTrue(companyStep4EmailHostHeader.isDisplayed(), "Company Step4 Email Host Header missing");
////            companyStep4EmailHostInput.sendKeys(data.getProperty("companyStep4EmailHostInput"));
////
////            Assert.assertTrue(companyStep4EmailPortHeader.isDisplayed(), "Company Step4 Email Port Header missing");
////            companyStep4EmailPortInput.sendKeys(data.getProperty("companyStep4EmailPortInput"));
////
////            Assert.assertTrue(companyStep4EmailUsernameHeader.isDisplayed(), "Company Step4 Email Username Header missing");
////            companyStep4EmailUsernameInput.sendKeys(data.getProperty("companyStep4EmailUsernameInput"));
////
////            Assert.assertTrue(companyStep4EmailPasswordHeader.isDisplayed(), "Company Step4 Email Password Header missing");
////            companyStep4EmailPasswordInput.sendKeys(data.getProperty("companyStep4EmailPasswordInput"));
//
//            TestUtil.highlightElement(addCompanyStep4BackBtn);
//            addCompanyStep4BackBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep3ContinueBtn);
//            addCompanyStep3ContinueBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep4SaveBtn);
//            addCompanyStep4SaveBtn.click();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    // Company 3 method

//    public void addCompany3Step1() {
//        try {
//            Thread.sleep(2000);
////            TestUtil.scrollTo(companyAddCompanyBtn)
////            Assert.assertTrue(companySaveSuccessMessage.isDisplayed(), "Company Save Success message missing");
//
//            TestUtil.scrollToTop();
//            TestUtil.waiting(1000);
//
//            TestUtil.highlightElement(companyAddCompanyBtn);
//            companyAddCompanyBtn.click();
//            TestUtil.waiting(1000);
//
////            TestUtil.waiting(2000);
//
//            Assert.assertTrue(companyStep1Header.isDisplayed(), "Company Step1 Header missing");
//            Assert.assertTrue(companyStep1PageHeader.isDisplayed(), "Company Step1 Basic Info Header missing");
//
//            Assert.assertTrue(addCompanyStep1NameHeader.isDisplayed(), "Company Step1 Name Header missing");
//            TestUtil.highlightElement(addCompanyStep1NameInput);
//            addCompanyStep1NameInput.sendKeys(data.getProperty("addCompanyStep1NameInput3"));
//
//            Assert.assertTrue(addCompanyStep1RegistrationNoHeader.isDisplayed(), "Company Step1 Registration No Header missing");
//            TestUtil.highlightElement(addCompanyStep1RegistrationNoInput);
//            addCompanyStep1RegistrationNoInput.sendKeys(data.getProperty("addCompanyStep1RegistrationNoInput3"));
//
//            Assert.assertTrue(addCompanyStep1RegistrationDateHeader.isDisplayed(), "Company Step1 Registration Date Header missing");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompany3Step2() {
//        try {
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companyStep2Header.isDisplayed(), "Company Step2 Header missing");
//            Assert.assertTrue(companyStep2PageHeader.isDisplayed(), "Company Step2 Setting  Header missing");
//
//            Assert.assertTrue(companyStep2LogoHeader.isDisplayed(), "Company Step2 Contact  Header missing");
//            // (System.getProperty("user.dir") + "\\src\\main\\java\\com\\hr\\qa\\config\\config.properties")
//            companyStep2LogoInput.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\hr\\qa\\testdata\\Syrimeds.png");
//            TestUtil.waiting(4000);
//            Assert.assertTrue(companyStep2CurrencyHeader.isDisplayed(), "Company Step2 Currency  Header missing");
//            TestUtil.highlightElement(companyStep2CurrencyClick);
//            companyStep2CurrencyClick.click();
//            TestUtil.waiting(2000);
//            companyStep2CurrencySelect.click();
//
//            Assert.assertTrue(companyStep2LanguageHeader.isDisplayed(), "Company Step2 Language  Header missing");
//            TestUtil.highlightElement(companyStep2LanguageClick);
//            companyStep2LanguageClick.click();
//            TestUtil.waiting(2000);
//            companyStep2LanguageSelect.click();
//
//            TestUtil.highlightElement(addCompanyStep2BackBtn);
//            addCompanyStep2BackBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep1ContinueBtn);
//            addCompanyStep1ContinueBtn.click();
//            TestUtil.waiting(1000);
//            addCompanyStep2ContinueBtn.click();
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompany3Step3() {
//        try {
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companyStep3Header.isDisplayed(), "Company Step3 Header missing");
//            Assert.assertTrue(companyStep3PageHeader.isDisplayed(), "Company Step3 Contact  Header missing");
//
//            Assert.assertTrue(companyStep3ContactTypeHeader.isDisplayed(), "Company Step3 Contact Type Header missing");
//            TestUtil.highlightElement(companyStep3ContactType0Click);
//            companyStep3ContactType0Click.click();
//            TestUtil.waiting(1000);
//            companyStep3ContactType0Select.click();
//
//            TestUtil.waiting(1000);
//            Assert.assertTrue(companyStep3ContactValueHeader.isDisplayed(), "Company Step3 Contact Value Header missing");
//            TestUtil.highlightElement(companyStep3ContactValue0Input);
//            companyStep3ContactValue0Input.sendKeys(data.getProperty("companyStep3ContactValue0InputEmail3"));
//
//            TestUtil.highlightElement(companyStep3DefaultCheckbox0);
//            TestUtil.actionMethod(companyStep3DefaultCheckbox0);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox0);
//            companyStep3ActiveCheckbox0.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox0);
//            TestUtil.actionMethod(companyStep3ActiveCheckbox0);
//            TestUtil.waiting(1000);
//
//            TestUtil.highlightElement(companyStep3AddRow);
//            companyStep3AddRow.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ContactType1Click);
//            companyStep3ContactType1Click.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ContactType1Select);
//            TestUtil.waiting(1000);
//            companyStep3ContactType1Select.click();
//            TestUtil.highlightElement(companyStep3ContactValue1Input);
//            companyStep3ContactValue1Input.sendKeys(data.getProperty("companyStep3ContactValue0InputMobileNo3"));
//
//            TestUtil.highlightElement(companyStep3DefaultCheckbox1);
//            TestUtil.actionMethod(companyStep3DefaultCheckbox1);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox1);
//            companyStep3ActiveCheckbox1.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3ActiveCheckbox1);
//            TestUtil.actionMethod(companyStep3ActiveCheckbox1);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStep3AddRow);
//            companyStep3AddRow.click();
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(companyStepDeleteRow3);
//            companyStepDeleteRow3.click();
//
//            TestUtil.highlightElement(addCompanyStep3BackBtn);
//            addCompanyStep3BackBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep2ContinueBtn);
//            addCompanyStep2ContinueBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep3ContinueBtn);
//            addCompanyStep3ContinueBtn.click();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void addCompany3Step4() {
//        try {
//            TestUtil.waiting(1000);
//
//            Assert.assertTrue(companyStep4Header.isDisplayed(), "Company Step4 Header missing");
//            Assert.assertTrue(companyStep4PageHeader.isDisplayed(), "Company Step4 Email Configuration  Header missing");
//
////            Assert.assertTrue(companyStep4EmailHostHeader.isDisplayed(), "Company Step4 Email Host Header missing");
////            companyStep4EmailHostInput.sendKeys(data.getProperty("companyStep4EmailHostInput"));
////
////            Assert.assertTrue(companyStep4EmailPortHeader.isDisplayed(), "Company Step4 Email Port Header missing");
////            companyStep4EmailPortInput.sendKeys(data.getProperty("companyStep4EmailPortInput"));
////
////            Assert.assertTrue(companyStep4EmailUsernameHeader.isDisplayed(), "Company Step4 Email Username Header missing");
////            companyStep4EmailUsernameInput.sendKeys(data.getProperty("companyStep4EmailUsernameInput"));
////
////            Assert.assertTrue(companyStep4EmailPasswordHeader.isDisplayed(), "Company Step4 Email Password Header missing");
////            companyStep4EmailPasswordInput.sendKeys(data.getProperty("companyStep4EmailPasswordInput"));
//
//            TestUtil.highlightElement(addCompanyStep4BackBtn);
//            addCompanyStep4BackBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep3ContinueBtn);
//            addCompanyStep3ContinueBtn.click();
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(addCompanyStep4SaveBtn);
//            addCompanyStep4SaveBtn.click();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    // All company create

    public void addNewCompany1() {
        try {
            addCompany1Step1();
//            addCompany1Step1Dummy();
            addCompany1Step2();
//            addCompany1Step2Dummy();
            addCompany1Step3();
//            addCompany1Step3Dummy();
            addCompany1Step4();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void addNewCompany2(){
//        try {
//            addCompany2Step1();
////            calender2();
//            TestUtil.highlightElement(MasterCompanyPage.addCompanyStep1ContinueBtn);
//            MasterCompanyPage.addCompanyStep1ContinueBtn.click();
//            addCompany2Step2();
//            addCompany2Step3();
//            addCompany2Step4();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void addNewCompany3(){
//        try {
//            addCompany3Step1();
////            calender3();
//            TestUtil.highlightElement(MasterCompanyPage.addCompanyStep1ContinueBtn);
//            MasterCompanyPage.addCompanyStep1ContinueBtn.click();
//            addCompany3Step2();
//            addCompany3Step3();
//            addCompany3Step4();
//            TestUtil.scrollToTop();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

}
