package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AndroidDriver<WebElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String telephoneNumber = "com.isinolsun.app:id/login_phone_number";
    String loginButton = "com.isinolsun.app:id/login";



    public void enterPhoneNumber (String cellPhoneNumber) {
        sendText(By.id(telephoneNumber), cellPhoneNumber);
        //hideKeyboard();
    }

    public void clickLogin () {
        waitAndClick(By.id(loginButton));
    }


}
