package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardRecruitment extends TestBase {

    // Initializing the PageObject

    public DashboardRecruitment(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//span[contains(text(),'Selection')]")
    public static WebElement recruitmentSelection;

    @FindBy(xpath = "//span[contains(text(),'RAF Wise')]")
    public static WebElement recruitmentSelectionRAFWise;

    @FindBy(xpath = "//span[contains(text(),'Candidate Wise')]")
    public static WebElement recruitmentSelectionCandidateWise;

    @FindBy(xpath = "//span[contains(text(),'Interview')]")
    public static WebElement recruitmentInterview;
}
