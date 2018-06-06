package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyProfileScreen extends BaseScreen{
    public MyProfileScreen(AndroidDriver<WebElement> driver) {
        super(driver);
    }

    //Web Elements
    String workExperienceTitleId = "com.isinolsun.app:id/txt_title_job";
    String expectedWorkExperienceTitle = "İş Tecrübeleri";

    //Screen Methods
    public void checkWorkExperienceTitle () {
        waitVisibility(By.id(workExperienceTitleId));
        assertEquals(getText(By.id(workExperienceTitleId)), expectedWorkExperienceTitle);
    }

}
