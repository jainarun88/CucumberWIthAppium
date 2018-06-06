package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CandidateLoginScreen extends BaseScreen {

    public CandidateLoginScreen(AndroidDriver<WebElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String loginButton = "com.isinolsun.app:id/login";

    public void clickLogin () {
        waitVisibility(By.id(loginButton));
        click(By.id(loginButton));
    }


}
