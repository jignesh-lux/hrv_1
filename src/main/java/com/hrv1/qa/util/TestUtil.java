package com.hrv1.qa.util;

import com.hrv1.qa.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class TestUtil extends TestBase {

    public static long PAGE_LOAD_TIMEOUT = 100;
    public static long IMPLICIT_WAIT = 20;

    public static void takeScreenshotAtEndOfTest() throws IOException {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir");
            FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void waiting(int timeInMilliSecond) {
        try {
            Thread.sleep(timeInMilliSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollTo(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript(Script,Arguments);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void scrollToTop(){
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(1000,0)");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void isSelected(WebElement webElement){
        try {
            if (!webElement.isSelected()){
                webElement.click();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void actionMethod(WebElement webElement){
        try {
            Actions action = new Actions(driver);
            action.moveToElement(webElement).click().build().perform();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void selectMethod(WebElement webElement, String value){
        try {
            Select select = new Select(webElement);
            select.selectByVisibleText(value);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void javaScriptClick(WebElement webElement) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            js.executeScript("arguments[0].click();", webElement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void explicitWait(WebElement waitWebElement) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(waitWebElement));
    }

    public static void click(WebElement clickWebElement) {
        try {
            clickWebElement.click();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clickWebElement);
        }
    }

    public static void sendKeyNormal(WebElement sendKeyNormalElement) {
        try {
            sendKeyNormalElement.sendKeys();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + sendKeyNormalElement);
        }
    }


    public static void sendKeyWithDataProperties(WebElement sendKeyWithDataElementWebElement, String str) {
        try {
            sendKeyWithDataElementWebElement.sendKeys(prop.getProperty(str));
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator input " + sendKeyWithDataElementWebElement.getTagName());
        }
    }

    public static void clearElement(WebElement clearElement) {
        try {
            clearElement.clear();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clearElement);
        }
    }

    public static void highlightElement(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);

        try {
            Thread.sleep(500);
        }
        catch (Exception ex){
            ex.getMessage();
        }
        jse.executeScript("arguments[0].style.border=''", element);
    }

    public static boolean isElementPresent(WebElement locator) {
        boolean flag = false;
        try {
            flag = locator.isDisplayed();
            if (flag) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean isElementPresent(List<WebElement> locator, int index) {
        boolean flag = false;
        try {
            flag = locator.get(index).isDisplayed();
            if (flag) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static void isDisplayed(){

    }
}

