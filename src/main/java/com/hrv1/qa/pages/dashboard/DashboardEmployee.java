package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardEmployee extends TestBase {

    // Initializing the PageObject

    public DashboardEmployee(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//span[contains(text(),'Employee List')]")
    public static WebElement employeeList;

    @FindBy(xpath = "//span[contains(text(),'New Employee')]")
    public static WebElement employeeNewEmployee;

    @FindBy(xpath = "//span[contains(text(),'Leavers')]")
    public static WebElement employeeLeavers;
}
