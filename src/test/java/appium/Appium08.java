package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import pages.APIremosPage;

import java.net.MalformedURLException;
import java.util.List;

public class Appium08  {

APIremosPage apIremosPage=new APIremosPage();
    @Test
    public void test() throws InterruptedException {


        apIremosPage.apiRemosButton.click();
        Thread.sleep(2000);
       apIremosPage.prefence.click();
        Thread.sleep(2000);
        apIremosPage.preference3.click();
        Thread.sleep(2000);
      /*  List list=driver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"WiFi settings\").enabled(false)");

        if (list.size()>0){
            String isEnable=driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"WiFi settings\").enabled(false)").getAttribute("enabled");
            if (isEnable.equals("false")){
                driver.findElementById("android:id/checkbox").click();
            }
        }

        Thread.sleep(4000);
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(2000);
        driver.findElementById("android:id/edit").sendKeys("test");
        Thread.sleep(2000);
        driver.findElementById("android:id/button1").click();*/




    }


}
