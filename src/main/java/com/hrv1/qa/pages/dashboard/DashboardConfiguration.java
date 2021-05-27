package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardConfiguration extends TestBase {

    // Initializing the PageObject

    public DashboardConfiguration(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//span[contains(text(),'Menu')]/../../..//span[contains(text(),'User')]")
    public static WebElement configUser;

    @FindBy(xpath = "//span[contains(text(),'Reason For Leave')]")
    public static WebElement configReasonForLeave;

    @FindBy(xpath = "//span[contains(text(),'Nationality')]")
    public static WebElement configNationality;

    @FindBy(xpath = "//span[contains(text(),'Document Type')]")
    public static WebElement configDocumentType;

    @FindBy(xpath = "//span[contains(text(),'Marital Status')]")
    public static WebElement configMaritalStatus;

    @FindBy(xpath = "//span[contains(text(),'Relationship')]")
    public static WebElement configRelationship;

    @FindBy(xpath = "//span[contains(text(),'Country')]")
    public static WebElement configCountry;

    @FindBy(xpath = "//span[contains(text(),'Currencies')]")
    public static WebElement configCurrencies;

    @FindBy(xpath = "//span[contains(text(),'Language')]")
    public static WebElement configLanguage;

    @FindBy(xpath = "//span[contains(text(),'Accessibility')]")
    public static WebElement configAccessibility;

    @FindBy(xpath = "//span[contains(text(),'Leave Type')]")
    public static WebElement configLeaveType;

    @FindBy(xpath = "//span[contains(text(),'Color Code')]")
    public static WebElement configColorCode;

//    @FindBy(xpath = "//span[contains(text(),'Nationality')]")
//    public static WebElement configReasonForLeave;



}
