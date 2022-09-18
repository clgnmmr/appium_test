package appium;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
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
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,"E:\\Yazılım projeleri\\intelji IDE\\projelerim\\appiumkurulum\\Apps\\org.studionord.a101_128_7488874.apk");
        desiredCapabilities.setCapability("appPackage","org.studionord.a101");
        desiredCapabilities.setCapability("appActivity","org.studionord.a101.MainActivity");
        AndroidDriver<MobileElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement acilirMenu= driver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
         acilirMenu.click();
        MobileElement giyimButton=driver.findElementByXPath("//android.widget.TextView[@text='GİYİM & AKSESUAR']");
         giyimButton.click();
        MobileElement kadinIcgiyimButton=driver.findElementByXPath("//android.widget.TextView[@text='Kadın İç Giyim']");
       kadinIcgiyimButton.click();
        MobileElement dizAltiCorap=driver.findElementByXPath("//android.widget.TextView[@text='Dizaltı Çorap']");
       dizAltiCorap.click();

       /* MobileElement filtre=driver.findElementByXPath("//android.widget.TextView[@text='Filtrele']");
       filtre.click();



       List<MobileElement> filtreRenkler=driver.findElementsByXPath("//android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");

        for (int i = 0; i < filtreRenkler.size() ; i++) {
            if (filtreRenkler.get(i).getText().contains("SİYAH")){
                System.out.println(filtreRenkler.get(i).getText());
                filtreRenkler.get(i).click();
                break;
            }

        }*/



        MobileElement siyahCorapYazisi=driver.findElementByXPath("//android.widget.TextView[@text='Penti Kadın 50 Denye Pantolon Çorabı Siyah']");

        System.out.println(siyahCorapYazisi.getText());
        Assert.assertTrue(siyahCorapYazisi.getText().contains("Siyah"));
        MobileElement sepet1=driver.findElementByXPath("(//android.widget.TextView[@text='SEPETE EKLE'])[1]");
        sepet1.click();
        Thread.sleep(2000);
        MobileElement sepet2=driver.findElementByXPath("//android.widget.TextView[@text='SEPETE EKLE']");
         sepet2.click();
        /*JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",sepet2);*/
        Thread.sleep(2000);
        MobileElement sepetGit=driver.findElementByXPath("//android.widget.TextView[@text='SEPETE GİT']");
        sepetGit.click();

        Thread.sleep(8000);
        //MobileElement sepetOnayla=driver.findElementByXPath("(//android.view.ViewGroup)[36]");
        MobileElement sepetOnayla=driver.findElementByXPath("(//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2])[2]");
        sepetOnayla.click();

        Thread.sleep(2000);
        MobileElement uyeOlmadan=driver.findElementByXPath("//android.widget.TextView[@text='ÜYE OLMADAN DEVAM ET']");
        uyeOlmadan.click();

        Thread.sleep(2000);
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
        MobileElement emailButton=driver.findElementByXPath("//android.widget.EditText");
        emailButton.sendKeys(email);

        MobileElement kisiselButon=driver.findElementByXPath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
        kisiselButon.click();


        Thread.sleep(2000);
        MobileElement gonderButton=driver.findElementByXPath("//android.widget.TextView[@text='GÖNDER']");
        gonderButton.click();
        Thread.sleep(2000);
        MobileElement yeniAdres=driver.findElementByXPath("(//android.widget.ListView/android.view.View)[5]");
        yeniAdres.click();
        Thread.sleep(2000);
        MobileElement adresAdi=driver.findElementByXPath("(//android.widget.EditText)[1]");
        adresAdi.sendKeys("evim");

        Thread.sleep(2000);
        MobileElement Adi=driver.findElementByXPath("(//android.widget.EditText)[2]");
        Adi.sendKeys("kadir");

        Thread.sleep(2000);
        MobileElement soyAdi=driver.findElementByXPath("(//android.widget.EditText)[3]");
        soyAdi.sendKeys("tepecik");

        Thread.sleep(2000);
        MobileElement telefon=driver.findElementByXPath("(//android.widget.EditText)[4]");
        telefon.sendKeys("5443314959");

        Thread.sleep(2000);
        MobileElement il=driver.findElementByXPath("(//android.widget.Spinner)[1]");
        il.click();
        Thread.sleep(2000);
        MobileElement ilsecme=driver.findElementByXPath("//android.widget.CheckedTextView[@text='İSTANBUL']");
        ilsecme.click();

        Thread.sleep(2000);
        MobileElement ilce=driver.findElementByXPath("(//android.widget.Spinner)[2]");
        ilce.click();
        Thread.sleep(2000);
        MobileElement ilcesecme=driver.findElementByXPath("//android.widget.CheckedTextView[@text='EYÜPSULTAN']");
        ilcesecme.click();


        Thread.sleep(2000);
        MobileElement mahalle=driver.findElementByXPath("(//android.widget.Spinner)[3]");
        mahalle.click();
        Thread.sleep(2000);
        MobileElement mahallesecme=driver.findElementByXPath("//android.widget.CheckedTextView[@text='MERKEZ MAH']");
        mahallesecme.click();








        Thread.sleep(2000);
        MobileElement adres=driver.findElementByXPath("(//android.widget.EditText)[5]");
        telefon.sendKeys(faker.lorem().characters(50,200));
        Thread.sleep(2000);
        MobileElement kaydet=driver.findElementByXPath("(//android.widget.Button)[2]");
        kaydet.click();












    }
}
