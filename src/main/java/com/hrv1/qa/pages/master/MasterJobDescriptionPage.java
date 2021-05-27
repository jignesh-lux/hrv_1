package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterJobDescriptionPage extends TestBase {

    // Initializing the PageObject

    public MasterJobDescriptionPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//a[contains(text(),'Add Job Description')]")
    public static WebElement addJobDescriptionBtn;

    @FindBy(xpath = "//h4[contains(text(),'Add Job Description')]")
    public static WebElement jobDescriptionMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Company')]")
    public static WebElement jobDescriptionCompanyHeader;

    @FindBy(xpath = "//select[@id='company_Id']")
    public static WebElement jobDescriptionCompanyClick;

    @FindBy(xpath = "//option[contains(text(),'Nirmaan Solution Private Limited')]")
    public static WebElement jobDescriptionCompanySelect;

    @FindBy(xpath = "//label[contains(text(),'Site')]")
    public static WebElement jobDescriptionSiteHeader;

    @FindBy(xpath = "//select[@id='site_Id']")
    public static WebElement jobDescriptionSiteClick;

    @FindBy(xpath = "//option[contains(text(),'YDSIN')]")
    public static WebElement jobDescriptionSiteSelect;

    @FindBy(xpath = "//label[contains(text(),'Department')]")
    public static WebElement jobDescriptionDepartmentHeader;

    @FindBy(xpath = "//select[@id='dept_Id']")
    public static WebElement jobDescriptionDepartmentClick;

    @FindBy(xpath = "//option[contains(text(),'Software Tester')]")
    public static WebElement jobDescriptionDepartmentSelect;
}
