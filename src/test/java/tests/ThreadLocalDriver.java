package tests;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {

    private static ThreadLocal<AndroidDriver<WebElement>> tlDriver = new ThreadLocal<>();

    public synchronized static void setTLDriver(AndroidDriver<WebElement> driver) {
        tlDriver.set(driver);
    }

    public synchronized static AndroidDriver<WebElement> getTLDriver() {
        return tlDriver.get();
    }
}
