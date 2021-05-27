package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.pages.master.*;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardMaster extends TestBase {

    // Initializing the PageObject

    public DashboardMaster(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "(//span[contains(text(),'Company')])[1]")
    public static WebElement masterCompany;

    @FindBy(xpath = "//span[contains(text(),'Company Site')]")
    public static WebElement masterCompanySite;

    @FindBy(xpath = "//span[contains(text(),'Department')]")
    public static WebElement masterDepartment;

    @FindBy(xpath = "//span[contains(text(),'Zone')]")
    public static WebElement masterZone;

    @FindBy(xpath = "//span[contains(text(),'Job Title')]")
    public static WebElement masterJobTitle;

    @FindBy(xpath = "//span[contains(text(),'Job Description')]")
    public static WebElement masterJobDescription;

    @FindBy(xpath = "//span[contains(text(),'Shift')]")
    public static WebElement masterShift;

    @FindBy(xpath = "//span[contains(text(),'Contract')]")
    public static WebElement masterContract;

    @FindBy(xpath = "//span[contains(text(),'Probation')]")
    public static WebElement masterProbation;

    @FindBy(xpath = "//span[contains(text(),'Ethnicity')]")
    public static WebElement masterEthnicity;

    @FindBy(xpath = "//span[contains(text(),'Right To Work')]")
    public static WebElement masterRightToWork;


    public void masterCompanyClick(){
        try {
            TestUtil.highlightElement(masterCompany);
            Thread.sleep(1000);
            masterCompany.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterCompanyPage();
    }

    public void masterCompanySiteClick(){
        try {
            TestUtil.scrollTo(DashboardPage.master);
            Thread.sleep(2000);
            TestUtil.actionMethod(masterCompanySite);
//            masterCompanySite.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterCompanySitePage();
    }

    public void masterDepartmentClick(){
        try {
            Thread.sleep(2000);
            masterDepartment.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterDepartmentPage();
    }

    public void masterZoneClick(){
        try {
            Thread.sleep(2000);
            masterZone.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterZonePage();
    }

    public void masterJobTitleClick(){
        try {
            Thread.sleep(2000);
            masterJobTitle.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterJobTitlePage();
    }

    public void masterJobDescriptionClick(){
        try {
            Thread.sleep(2000);
            masterJobDescription.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterJobDescriptionPage();
    }

    public void masterShiftClick(){
        try {
            Thread.sleep(2000);
            masterShift.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterShiftPage();
    }

    public void masterContractClick(){
        try {
            Thread.sleep(2000);
            masterContract.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterContractPage();
    }

    public void masterProbationClick(){
        try {
            Thread.sleep(2000);
            masterProbation.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterProbationPage();
    }

    public void masterEthnicityClick(){
        try {
            Thread.sleep(2000);
            masterEthnicity.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterEthnicityPage();
    }

    public void masterRightToWorkClick(){
        try {
            Thread.sleep(2000);
            masterRightToWork.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new MasterRightToWorkPage();
    }


}
