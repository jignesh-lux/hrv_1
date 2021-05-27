package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MasterJobTitlePage extends TestBase {

    // Initializing the PageObject

    public MasterJobTitlePage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//a[contains(text(),'Add Job Title')]")
    public static WebElement addJobTitleBtn;

    @FindBy(xpath = "//h4[contains(text(),'Add Job Title')]")
    public static WebElement jobTitleMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Company')]")
    public static WebElement jobTitleCompanyHeader;

    @FindBy(xpath = "//ng-select2[@id='company_Id']")
    public static WebElement jobTitleCompanyClick;

    @FindBy(xpath = "//option[contains(text(),'GHPL')]")
    public static WebElement jobTitleCompany1Select;

    @FindBy(xpath = "//option[contains(text(),'GRPL')]")
    public static WebElement jobTitleCompany2Select;

    @FindBy(xpath = "//option[contains(text(),'SyriMed')]")
    public static WebElement jobTitleCompany3Select;

    @FindBy(xpath = "//label[contains(text(),'Department')]")
    public static WebElement jobTitleDepartmentHeader;

    @FindBy(xpath = "//ng-select2[@id='dept_Id']")
    public static WebElement jobTitleDepartmentClick;

    @FindBy(xpath = "//li[contains(text(),'Human Resources')]")
    public static WebElement jobTitleDepartmentHRSelect;

    @FindBy(xpath = "//li[contains(text(),'Information Technology')]")
    public static WebElement jobTitleDepartmentITSelect;

    @FindBy(xpath = "//label[contains(text(),'Zone ')]")
    public static WebElement jobTitleZoneHeader;

    @FindBy(xpath = "//ng-select2[@id='zone_Id']")
    public static WebElement jobTitleZoneClick;

    @FindBy(xpath = "//option[contains(text(),'Vadodara')]")
    public static WebElement jobTitleZoneVadSelect;

    @FindBy(xpath = "//option[contains(text(),'Mumbai')]")
    public static WebElement jobTitleZoneMumSelect;

    @FindBy(xpath = "//label[contains(text(),'Job Code')]")
    public static WebElement jobTitleJobCodeHeader;

    @FindBy(xpath = "//input[@id='desig_Code']")
    public static WebElement jobTitleJobCodeInput;

    @FindBy(xpath = "//label[contains(text(),'Job Title')]")
    public static WebElement jobTitleNewHeader;

    @FindBy(xpath = "//input[@id='desig_Name']")
    public static WebElement jobTitleNewInput;

    @FindBy(xpath = "//label[contains(text(),'Report To')]")
    public static WebElement jobTitleReportToHeader;

    @FindBy(xpath = "//select[@id='report_To']")
    public static WebElement jobTitleReportToClick;

    @FindBy(xpath = "//option[contains(text(),'Select Report To')]")
    public static WebElement jobTitleReportToSelect;

    @FindBy(xpath = "//label[contains(text(),'Additional Report To')]")
    public static WebElement jobTitleAdditionalReportToHeader;

    @FindBy(xpath = "//select[@id='additionalReport_To']")
    public static WebElement jobTitleAdditionalReportToClick;

    @FindBy(xpath = "//option[contains(text(),'Additional Report To')]")
    public static WebElement jobTitleAdditionalReportToSelect;

    @FindBy(xpath = "//label[contains(text(),'Level')]")
    public static WebElement jobTitleLevelHeader;

    @FindBy(xpath = "//input[@id='level']")
    public static WebElement jobTitleLevelInput;

    @FindBy(xpath = "//label[@for='checkbox1_3']")
    public static WebElement jobTitleActiveCheckboxClick;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]/..//button[contains(text(),'Close')]")
    public static WebElement jobTitleCloseBtn;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
    public static WebElement jobTitleSaveBtn;

    public void addJobTitleDetail(){
        try {
            addJobTitleBtn.click();
            TestUtil.waiting(2000);
            TestUtil.scrollTo(jobTitleCloseBtn);
            jobTitleCloseBtn.click();
            TestUtil.waiting(2000);
            addJobTitleBtn.click();

            TestUtil.waiting(2000);
            Assert.assertTrue(jobTitleMainHeader.isDisplayed(), "JobTitle jobTitle Main Header missing");
            Assert.assertTrue(jobTitleCompanyHeader.isDisplayed(), "Company Header missing");
            jobTitleCompanyClick.click();
//            jobTitleCompanySelect.click();

            TestUtil.waiting(5000);

            Assert.assertTrue(jobTitleDepartmentHeader.isDisplayed(), "JobTitle Header missing");
            jobTitleDepartmentClick.click();
//            jobTitleDepartmentSelect.click();

            TestUtil.waiting(5000);

            Assert.assertTrue(jobTitleZoneHeader.isDisplayed(), "JobTitle Header missing");
            jobTitleZoneClick.click();
//            jobTitleZoneSelect.click();

            Assert.assertTrue(jobTitleJobCodeHeader.isDisplayed(), "jobTitle Code Header missing");
            jobTitleJobCodeInput.sendKeys(data.getProperty("companyJobTitleCodeInput"));

            TestUtil.waiting(1000);

            Assert.assertTrue(jobTitleNewHeader.isDisplayed(), "jobTitle Code Header missing");
            jobTitleNewInput.sendKeys(data.getProperty("companyJobTitleNewInput"));

            TestUtil.waiting(1000);

            Assert.assertTrue(jobTitleReportToHeader.isDisplayed(), "JobTitle Header missing");
            jobTitleReportToClick.click();
            jobTitleReportToSelect.click();

            TestUtil.waiting(1000);

            Assert.assertTrue(jobTitleAdditionalReportToHeader.isDisplayed(), "JobTitle Additional Report To Header missing");
            jobTitleAdditionalReportToClick.click();
            jobTitleAdditionalReportToSelect.click();

            Assert.assertTrue(jobTitleLevelHeader.isDisplayed(), "Job Title Level Header missing");
            jobTitleLevelInput.sendKeys(data.getProperty("companyJobTitleLevelInput"));

//            TestUtil.isSelected(jobTitleActiveCheckboxClick);

            TestUtil.actionMethod(jobTitleActiveCheckboxClick);
            TestUtil.waiting(1000);
            TestUtil.javaScriptClick(jobTitleActiveCheckboxClick);

            jobTitleSaveBtn.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
