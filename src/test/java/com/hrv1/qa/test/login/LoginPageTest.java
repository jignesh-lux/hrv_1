package com.hrv1.qa.test.login;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.pages.dashboard.DashboardPage;
import com.hrv1.qa.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void SetUp(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }


    @Test(priority = 0)
    public void negativeLoginTest(){
        loginPage.verifyNegativeLogin();
    }

    @Test(priority = 1)
    public void loginTest(){
        loginPage.verifyNegativeLogin();
        dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
