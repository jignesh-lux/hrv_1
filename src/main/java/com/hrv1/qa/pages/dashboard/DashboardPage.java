package com.hrv1.qa.pages.dashboard;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends TestBase {

    // Initializing the PageObject

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//img[@class='logo-default']")
    public static WebElement dashboardLogo;

    @FindBy(xpath = "//span[contains(text(),'Masters')]")
    public static WebElement master;

    @FindBy(xpath = "//span[contains(text(),'RAF')]")
    public static WebElement raf;

    @FindBy(xpath = "//span[contains(text(),'Candidate')]")
    public static WebElement candidate;

    @FindBy(xpath = "//span[contains(text(),'Recruitment')]")
    public static WebElement recruitment;

    @FindBy(xpath = "//span[contains(text(),'Onboarding')]")
    public static WebElement onBoarding;

    @FindBy(xpath = "//span[contains(text(),'Employee')]")
    public static WebElement employee;

    @FindBy(xpath = "//i[@class='icon-settings']/..//span[contains(text(),'Configuration')]")
    public static WebElement configuration;

    public void masterClick() {
        try {
            TestUtil.waiting(2000);
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(master));
            TestUtil.highlightElement(master);
            TestUtil.waiting(1000);
            master.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardMaster();
    }

    public void rafClick() {
        try {
            Thread.sleep(2000);
            raf.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardRAF();
    }

    public void candidateClick() {
        try {
            Thread.sleep(2000);
            candidate.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardCandidate();
    }

    public void employeeClick() {
        try {
            Thread.sleep(2000);
            employee.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardEmployee();
    }

    public void onBoardingClick() {
        try {
            Thread.sleep(2000);
            onBoarding.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardOnboarding();
    }

    public void recruitmentClick() {
        try {
            Thread.sleep(2000);
            recruitment.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardRecruitment();
    }

    public void configurationClick() {
        try {
            Thread.sleep(2000);
            configuration.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardConfiguration();
    }


}
