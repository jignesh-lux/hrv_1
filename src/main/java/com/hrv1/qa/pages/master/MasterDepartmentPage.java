package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MasterDepartmentPage extends TestBase {

    // Initializing the PageObject

    public MasterDepartmentPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//a[contains(text(),'Add Department')]")
    public static WebElement addDepartmentBtn;

    @FindBy(xpath = "//h4[contains(text(),'Add Department')]")
    public static WebElement departmentMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Company')]")
    public static WebElement departmentCompanyHeader;

    @FindBy(xpath = "//select[@id='company_Id']")
    public static WebElement departmentCompanyClick;

    @FindBy(xpath = "//option[contains(text(),'Nirmaan Solution Private Limited')]")
    public static WebElement departmentCompanySelect;

    @FindBy(xpath = "//label[contains(text(),'Department Code')]")
    public static WebElement departmentCodeHeader;

    @FindBy(xpath = "//input[@id='dept_Code']")
    public static WebElement departmentCodeInput;

    @FindBy(xpath = "//label[contains(text(),'Department Name')]")
    public static WebElement departmentNameHeader;

    @FindBy(xpath = "//input[@id='dept_Name']")
    public static WebElement departmentNameInput;

    @FindBy(xpath = "//label[contains(text(),'Notes')]")
    public static WebElement departmentNotesHeader;

    @FindBy(xpath = "//textarea[@formcontrolname='notes']")
    public static WebElement departmentNotesInput;
    
    @FindBy(xpath = "//label[@for='isActive']")
    public static WebElement departmentActiveCheckboxClick;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]/..//button[contains(text(),'Close')]")
    public static WebElement departmentCloseBtn;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
    public static WebElement departmentSaveBtn;

    public void addDepartmentDetail(){
        try {

            addDepartmentBtn.click();
            TestUtil.waiting(2000);

            departmentCloseBtn.click();
            TestUtil.waiting(2000);
            addDepartmentBtn.click();

            TestUtil.waiting(2000);
            Assert.assertTrue(departmentMainHeader.isDisplayed(), "Company Department Main Header missing");
            Assert.assertTrue(departmentCompanyHeader.isDisplayed(), "Company Header missing");
            departmentCompanyClick.click();
            departmentCompanySelect.click();

            TestUtil.waiting(2000);
            Assert.assertTrue(departmentCodeHeader.isDisplayed(), "Department Code Header missing");
            departmentCodeInput.sendKeys(data.getProperty("companyDepartmentCodeInput"));

            TestUtil.waiting(1000);
            Assert.assertTrue(departmentNameHeader.isDisplayed(), "Department Name Header missing");
            departmentNameInput.sendKeys(data.getProperty("companyDepartmentNameInput"));

            TestUtil.waiting(1000);
            Assert.assertTrue(departmentNotesHeader.isDisplayed(), "Department Notes Header missing");
            departmentNotesInput.sendKeys(data.getProperty("companyDepartmentNotesInput"));

//            TestUtil.isSelected(departmentActiveCheckboxClick);

            TestUtil.actionMethod(departmentActiveCheckboxClick);
            TestUtil.waiting(1000);
            TestUtil.javaScriptClick(departmentActiveCheckboxClick);

            departmentSaveBtn.click();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
