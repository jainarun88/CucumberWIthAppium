package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TutorialScreen extends BaseScreen{

    public TutorialScreen (AndroidDriver<WebElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String skipTutorialButtonId = "com.isinolsun.app:id/btn_skip";

    public void skipTutorial () {
        waitAndClick(By.id(skipTutorialButtonId));
    }
}
