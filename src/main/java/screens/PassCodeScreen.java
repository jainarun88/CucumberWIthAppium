package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PassCodeScreen extends BaseScreen {
    public PassCodeScreen(AndroidDriver<WebElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String notification = "com.android.packageinstaller:id/permission_allow_button";
    String passCodeInputIdPattern = "com.isinolsun.app:id/edt_input1";
    String finishLoginButtonId = "com.isinolsun.app:id/finish_activation";


    //Screen Methods
    public void allowNotification () {
        if(waitAndFindElements(By.id(notification)).size()>0){
            click(By.id(notification));
        }
    }

    public void sendPassCode () {
        sendText(By.id(passCodeInputIdPattern),"35880");
    }

    public void finishLogin () {
        click(By.id(finishLoginButtonId));
    }

}
