package appium;

import com.github.javafaker.Faker;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.hc.client5.http.ssl.ClientTlsStrategyBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppiumA101 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,"E:\\Yazılım projeleri\\intelji IDE\\projelerim\\appiumkurulum\\Apps\\A101_3.6.8_apkcombo.com.apk");
        desiredCapabilities.setCapability("appPackage","org.studionord.a101");
        desiredCapabilities.setCapability("appActivity","org.studionord.a101.MainActivity");
        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       AndroidElement acilirMenu= driver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
         acilirMenu.click();
       AndroidElement giyimButton=driver.findElementByXPath("//android.widget.TextView[@text='GİYİM & AKSESUAR']");
         giyimButton.click();
       AndroidElement kadinIcgiyimButton=driver.findElementByXPath("//android.widget.TextView[@text='Kadın İç Giyim']");
       kadinIcgiyimButton.click();
       AndroidElement dizAltiCorap=driver.findElementByXPath("//android.widget.TextView[@text='Dizaltı Çorap']");
       dizAltiCorap.click();

       AndroidElement filtre=driver.findElementByXPath("//android.widget.TextView[@text='Filtrele']");
       filtre.click();



       List<AndroidElement> filtreRenkler=driver.findElementsByXPath("//android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");

        for (int i = 0; i < filtreRenkler.size() ; i++) {
            if (filtreRenkler.get(i).getText().contains("SİYAH")){
                System.out.println(filtreRenkler.get(i).getText());
                filtreRenkler.get(i).click();
                break;
            }

        }



        AndroidElement siyahCorapYazisi=driver.findElementByXPath("//android.widget.TextView[@text='Penti Kadın 50 Denye Pantolon Çorabı Siyah']");

        System.out.println(siyahCorapYazisi.getText());
        Assert.assertTrue(siyahCorapYazisi.getText().contains("Siyah"));
        AndroidElement sepet1=driver.findElementByXPath("(//android.widget.TextView[@text='SEPETE EKLE'])[1]");
        sepet1.click();
        Thread.sleep(2000);
        AndroidElement sepet2=driver.findElementByXPath("//android.widget.TextView[@text='SEPETE EKLE']");
         sepet2.click();
        /*JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",sepet2);*/
        Thread.sleep(2000);
        AndroidElement sepetGit=driver.findElementByXPath("//android.widget.TextView[@text='SEPETE GİT']");
        sepetGit.click();

        AndroidElement sepetOnayla=driver.findElementByXPath("//android.widget.TextView[@text='SEPETİ ONAYLA']");
        sepetOnayla.click();

        Thread.sleep(2000);
        AndroidElement uyeOlmadan=driver.findElementByXPath("//android.widget.TextView[@text='ÜYE OLMADAN DEVAM ET']");
        uyeOlmadan.click();

        Thread.sleep(2000);
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
        AndroidElement emailButton=driver.findElementByXPath("//android.widget.EditText");
        Actions ac=new Actions((WebDriver) emailButton);
        ac.click(emailButton).sendKeys(email).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();









    }
}
