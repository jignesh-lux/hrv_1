package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardOnboarding extends TestBase {

    // Initializing the PageObject

    public DashboardOnboarding(){
        PageFactory.initElements(driver,this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//span[contains(text(),'Onboarding List')]")
    public static WebElement onBoardingList;

    @FindBy(xpath = "//span[contains(text(),'New Onboarding')]")
    public static WebElement onBoardingNewOnBoarding;
}
