package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfileLoginScreen extends BaseScreen {

    public ProfileLoginScreen(AndroidDriver<WebElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String loginButton = "com.isinolsun.app:id/login";

    public void clickLogin () {
            click(By.id(loginButton));

    }
}
