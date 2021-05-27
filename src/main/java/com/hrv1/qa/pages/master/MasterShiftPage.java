package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterShiftPage extends TestBase {

    // Initializing the PageObject

    public MasterShiftPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//a[contains(text(),'Add Shift')]")
    public static WebElement addShiftBtn;

    @FindBy(xpath = "//h4[contains(text(),'Add Shift')]")
    public static WebElement shiftMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Company')]")
    public static WebElement shiftCompanyHeader;

    @FindBy(xpath = "//select[@id='company_Id']")
    public static WebElement shiftCompanyClick;

    @FindBy(xpath = "//option[contains(text(),'Nirmaan Solution Private Limited')]")
    public static WebElement shiftCompanySelect;

    @FindBy(xpath = "//label[contains(text(),'shift Code')]")
    public static WebElement shiftCodeHeader;

    @FindBy(xpath = "//input[@id='shift_Code']")
    public static WebElement shiftCodeInput;

    @FindBy(xpath = "//label[contains(text(),'shift Name')]")
    public static WebElement shiftNameHeader;

    @FindBy(xpath = "//input[@id='shift_Name']")
    public static WebElement shiftNameInput;

    @FindBy(xpath = "//label[@for='checkbox1_3']")
    public static WebElement shiftActiveCheckboxClick;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]/..//button[contains(text(),'Close')]")
    public static WebElement shiftCloseBtn;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
    public static WebElement shiftSaveBtn;


}
