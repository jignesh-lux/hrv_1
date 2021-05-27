package com.hrv1.qa.pages.login;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.pages.dashboard.DashboardPage;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends TestBase {

    // Initializing the PageObject

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    //@FindBy(xpath = "//h1[contains(text(),'Why choose LuxTech HR admin over other HR Portals?')]")
    @FindBy(xpath = "//h1[contains(text(),'Why choose LuxshTech HR admin over other HR Portals?')]")
    public static WebElement hrLoginPageHeader1;

    @FindBy(xpath = "//span[contains(text(),'Login to continue')]")
    public static WebElement hrLoginPageHeader2;

    @FindBy(xpath = "//div[contains(text(),'UserName is required !')]")
    public static WebElement hrUsernameErrorMessage;

    @FindBy(xpath = "//input[@id='Login_Id']")
    public static WebElement hrUsernameInput;

    @FindBy(xpath = "//div[contains(text(),'Password is required !')]")
    public static WebElement hrPasswordErrorMessage;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement hrPasswordInput;

    @FindBy(xpath = "//div[contains(text(),'Invalid UserName')]")
    public static WebElement hrInvalidUsernameErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Password Does Not Matched. Please Enter Valid Password.')]")
    public static WebElement hrInvalidPasswordErrorMessage;

    @FindBy(xpath = "//a[@id='forgetPassword']")
    public static WebElement hrForgetPassword;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public static WebElement hrLoginBtn;

    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    public static WebElement hrSignUpBtn;


    // Actions

    public void invalidDummyUsername(){
        try {
            TestUtil.highlightElement(hrLoginBtn);
            hrLoginBtn.click();
            TestUtil.highlightElement(hrUsernameInput);
            hrUsernameInput.clear();
            TestUtil.highlightElement(hrUsernameErrorMessage);
            Assert.assertEquals(hrUsernameErrorMessage.getText(), "UserName is required !", "Username error message missing");
            TestUtil.waiting(1000);
            hrUsernameErrorMessage.click();
            TestUtil.highlightElement(hrUsernameInput);
            hrUsernameInput.sendKeys(prop.getProperty("invalidUsername"));
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrLoginBtn);
            hrLoginBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrPasswordErrorMessage);
            Assert.assertEquals(hrPasswordErrorMessage.getText(), "Password is required !", "Password error message missing");
//            hrPasswordInput.clear();
            TestUtil.waiting(1000);
            hrPasswordErrorMessage.click();
            TestUtil.highlightElement(hrPasswordInput);
            hrPasswordInput.sendKeys(prop.getProperty("invalidPassword"));
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrLoginBtn);
            hrLoginBtn.click();

            TestUtil.waiting(1000);

            TestUtil.highlightElement(hrInvalidUsernameErrorMessage);
            Assert.assertEquals(hrInvalidUsernameErrorMessage.getText(), "Invalid UserName", "Invalid UserName error message missing");
            TestUtil.waiting(1000);
            hrInvalidUsernameErrorMessage.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void invalidUsername(){
        try {
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrUsernameInput);
            TestUtil.clearElement(hrUsernameInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrUsernameInput);
            hrUsernameInput.sendKeys(prop.getProperty("invalidUsername1"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(hrPasswordInput);
            TestUtil.clearElement(hrPasswordInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrPasswordInput);
            hrPasswordInput.sendKeys(prop.getProperty("invalidPassword1"));
            TestUtil.waiting(1000);
            hrLoginBtn.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrInvalidUsernameErrorMessage);
            Assert.assertEquals(hrInvalidUsernameErrorMessage.getText(), "\"Invalid UserName\"", "Invalid UserName error message missing");
            TestUtil.waiting(1000);
            hrInvalidUsernameErrorMessage.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void invalidPassword(){
        try {
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrUsernameInput);
            TestUtil.clearElement(hrUsernameInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrUsernameInput);
            hrUsernameInput.sendKeys(prop.getProperty("username"));
            TestUtil.waiting(1000);

            TestUtil.highlightElement(hrPasswordInput);
            TestUtil.clearElement(hrPasswordInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(hrPasswordInput);
            hrPasswordInput.sendKeys(prop.getProperty("invalidUsername1"));
            TestUtil.waiting(1000);
            hrLoginBtn.click();

            TestUtil.waiting(1000);
            Assert.assertEquals(hrInvalidPasswordErrorMessage.getText(), "Password Does Not Matched. Please Enter Valid Password.", "Invalid Password error message missing");
            TestUtil.waiting(1000);
            hrInvalidPasswordErrorMessage.click();
            TestUtil.waiting(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void verifyNegativeLogin() {
        try {
            invalidDummyUsername();
            TestUtil.waiting(1000);
            invalidUsername();
            TestUtil.waiting(1000);
            invalidPassword();
            TestUtil.waiting(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DashboardPage login(String ur, String pwd) {
        try {
            Thread.sleep(2000);
            TestUtil.highlightElement(hrUsernameInput);
            hrUsernameInput.clear();
            TestUtil.highlightElement(hrUsernameInput);
            TestUtil.waiting(1000);
            hrUsernameInput.sendKeys(ur);
            TestUtil.highlightElement(hrPasswordInput);
            hrPasswordInput.clear();
            TestUtil.highlightElement(hrPasswordInput);
            TestUtil.waiting(1000);
            hrPasswordInput.sendKeys(pwd);
            TestUtil.highlightElement(hrLoginBtn);
            TestUtil.waiting(1000);
            hrLoginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DashboardPage();
    }

    public DashboardPage login1(String ur, String pwd) {
        try {
            Thread.sleep(2000);
            TestUtil.highlightElement(hrUsernameInput);
            TestUtil.waiting(1000);
            hrUsernameInput.sendKeys(ur);
            TestUtil.highlightElement(hrPasswordInput);
            TestUtil.waiting(1000);
            hrPasswordInput.sendKeys(pwd);
            TestUtil.highlightElement(hrLoginBtn);
            TestUtil.waiting(1000);
            hrLoginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DashboardPage();
    }
}



