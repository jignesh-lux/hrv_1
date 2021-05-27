package com.hrv1.qa.test.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.pages.dashboard.DashboardMaster;
import com.hrv1.qa.pages.dashboard.DashboardPage;
import com.hrv1.qa.pages.login.LoginPage;
import com.hrv1.qa.pages.master.MasterCompanyEditPage;
import com.hrv1.qa.pages.master.MasterCompanyPage;
import com.hrv1.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MasterCompanyEditPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    DashboardMaster dashboardMaster;
    MasterCompanyPage masterCompanyPage;
    MasterCompanyEditPage masterCompanyEditPage;

    public MasterCompanyEditPageTest(){
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
        dashboardPage.masterClick();
        dashboardMaster = new DashboardMaster();
        dashboardMaster.masterCompanyClick();
    }

    @Test(priority = 1)
    public void editMasterCompanyTest(){
        masterCompanyPage = new MasterCompanyPage();
        masterCompanyEditPage = new MasterCompanyEditPage();
//        masterCompanyEditPage.inactiveCompanyFromList();
//        masterCompanyEditPage.activeInactiveCompanyFromList();
        masterCompanyEditPage.deleteInactiveCompanyFromList();

//        masterCompanyEditPage.verifyAddCompanyForEdit();
//        masterCompanyEditPage.editCompany1Step1();

//        masterCompanyEditPage.editCompany1Step2();

//        masterCompanyEditPage.editCompany1Step3();

//        masterCompanyEditPage.editCompany1Step4();

    }


    @AfterMethod
    public void dashboardHomePage(){
//        TestUtil.highlightElement(DashboardPage.dashboardLogo);
//        TestUtil.waiting(2000);
//        DashboardPage.dashboardLogo.click();
    }


}
