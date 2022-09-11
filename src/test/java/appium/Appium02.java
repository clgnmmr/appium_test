package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Appium02 {


    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulotar");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"E:\\Yazılım projeleri\\intelji IDE\\projelerim\\appiumkurulum\\Apps\\gestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);

        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);


        //List<AndroidElement> baslıkList=driver.findElements(By.xpath("//android.widget.Button"));

        Thread.sleep(3000);

       // Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.Button)[1]")).isEnabled());
       // Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.Button)[1]")).isDisplayed());
       // Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.Button)[1]")).isSelected());


        driver.findElement(By.xpath("(//android.widget.Button)[1]")).click();
        //driver.findElementByXPath("//div[@class='_highlighter-box_619e8 _inspected-element-box_619e8']").click();








    }
}
