package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class BaseScreen {

    protected AndroidDriver<WebElement> driver;
    protected WebDriverWait wait;

    public BaseScreen (AndroidDriver<WebElement> driver2){
        this.driver = driver2;
        wait = new WebDriverWait(driver2, 15);
    }

    protected void waitAndClick (By by) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    protected void click (By by) {
        waitVisibility(by);
        driver.findElement(by).click();
    }

    protected void hideKeyboard(){
        driver.navigate().back();
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected List<WebElement> waitAndFindElements (By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected WebElement waitAndFindElement (By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected String getText(By by) {
        return waitAndFindElement(by).getText();
    }

    protected void sendText (By by, String text) {
         waitAndFindElement(by).sendKeys(text);
    }

    protected void assertEquals (String actual, String expected) {
        Assert.assertEquals(actual,expected, "Two texts are not equal!" + "Actual: " + actual + " Expected: " + expected);
    }

    protected void waitVisibility (By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    protected void sleep (long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
