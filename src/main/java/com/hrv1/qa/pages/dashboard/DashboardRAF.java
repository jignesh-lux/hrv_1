package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardRAF extends TestBase {

    // Initializing the PageObject

    public DashboardRAF(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//span[contains(text(),'Approval Process Configuration')]")
    public static WebElement rafApprovalProcessConfiguration;

    @FindBy(xpath = "//span[contains(text(),'RAF Overview')]")
    public static WebElement rafRAFOverview;

    @FindBy(xpath = "//span[contains(text(),'Create a RAF')]")
    public static WebElement rafCreateRAF;


}
