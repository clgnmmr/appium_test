package pages;

import appium.AppiumBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APIremosPage {
    public APIremosPage(){

        PageFactory.initElements(new AppiumFieldDecorator(AppiumBase.androidDriver()),this);

    }
    @FindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public AndroidElement apiRemosButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public AndroidElement prefence;
    @FindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public AndroidElement preference3;
}
