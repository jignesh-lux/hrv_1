package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardCandidate extends TestBase {

    // Initializing the PageObject

    public DashboardCandidate(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//span[contains(text(),'Candidate')]/../..//span[contains(text(),'Overview')]")
    public static WebElement candidateOverview;

    @FindBy(xpath = "//span[contains(text(),'Add New Candidate')]")
    public static WebElement candidateAddNewCandidate;
}
