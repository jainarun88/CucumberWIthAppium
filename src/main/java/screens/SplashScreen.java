package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AndroidDriver<WebElement> androidDriver) {
        super(androidDriver);
    }

    //Mobile Elements
    String animationViewId = "com.isinolsun.app:id/animation_view";

    public void skipSplashScreen ()  {
        waitAndClick(By.id(animationViewId));
    }
}
