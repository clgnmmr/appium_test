package appium;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.Set;

public class AppiumA101UITest {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        //desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        //desiredCapabilities.setCapability("chromedriverExecutable","E:\\Yazılım projeleri\\intelji IDE\\projelerim\\appiumkurulum\\driver\\chromedriver.exe");
       // desiredCapabilities.setCapability("appPackage","com.android.chrome");
        desiredCapabilities.setCapability("appPackage","com.android.chrome");
        //desiredCapabilities.setCapability("appPackage","com.android.quicksearchbox");
        desiredCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
       // desiredCapabilities.setCapability("appActivity","com.android.quicksearchbox.SearchActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(2000);
        driver.get("https://www.A101.com.tr");

        String contrext=driver.getContext();
        System.out.println("1 "+contrext);
        Set contextList=driver.getContextHandles();

        for (Object context:contextList) {
            System.out.println(context.toString());
            Thread.sleep(2000);
            if (context.toString().contains("WEBVIEW")){
                driver.context((String) context);
                Thread.sleep(10000);

            }

        }
        System.out.println("2 "+driver.getContext());
      //  Thread.sleep(5000);
       // driver.switchTo().alert().accept();



        // remote device on chrome   linkine git ve tel ile bilgisayardaki chrome bağl
        Thread.sleep(10000);
        driver.findElementByXPath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']").click();//cerez
        Thread.sleep(5000);
        driver.findElementByXPath("//a[@class='menu-toggle js-navigation-toggle visible-xs']").click();//menü11
        Thread.sleep(2000);
        driver.findElementByXPath("//a[@title='GİYİM & AKSESUAR']").click();//giyim ve aksesuar
        Thread.sleep(2000);
        driver.findElementByXPath("(//ul[@class='sub-navigation js-sub-navigation shown']//a)[3]").click();//kadın iç giyim
        Thread.sleep(2000);
        driver.findElementByXPath("//ul[@class='sub-navigation js-sub-navigation shown']//li[9]//a").click();//dizaltı çorap
       // Thread.sleep(2000);
       // driver.findElementByXPath("//a[@class='js-filter-mobile']").click();//filtrele

        Thread.sleep(5000);
        driver.findElementByXPath("(//div[@class='mobile-dropdown visible-xs'])[1]").click();//ekleme
        Thread.sleep(2000);
        String actualdata=driver.findElementByXPath("//li[@class='breadcrumb-item active']//span").getText();//siyah Texti
        String expectedData="Siyah";
        Assert.assertTrue(actualdata.contains(expectedData));

        Thread.sleep(2000);
        driver.findElementByXPath("//button[@class='add-to-basket button green block with-icon js-add-basket']").click();//sepet ekle1

        Thread.sleep(2000);
        driver.findElementByXPath("//a[@class='go-to-shop']").click();//sepet görüntüle
        Thread.sleep(2000);
        driver.findElementByXPath("//a[@class='button green checkout-button block js-checkout-button']").click();//sepet onayla
        Thread.sleep(2000);
        driver.findElementByXPath("//a[@class='auth__form__proceed js-proceed-to-checkout-btn']").click();//uye olmadan devam et

        Thread.sleep(2000);
        Faker fk=new Faker();
        driver.findElementByXPath("(//input[@class='js-form-input'])[2]").sendKeys(fk.internet().emailAddress());//email kutusu
        Thread.sleep(2000);
        driver.findElementByXPath("//button[@class='button block green']").click();//devam et buttonu
        Thread.sleep(8000);
        driver.findElementByXPath("(//li[@class='half'])[1]").click();//yeni adres oluştur
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='title']").sendKeys("evim");//adres başlığı
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='first_name']").sendKeys("kadir");//ad
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='last_name']").sendKeys("tepecik");//soyad
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='phone_number']").click();//telefon
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='phone_number']").sendKeys(fk.phoneNumber().phoneNumber().replaceAll(".",""));//telefon
        Thread.sleep(10000);
       // driver.findElementByXPath("//select[@name='city']").click();//il
        driver.findElementByXPath("//*[text()='İSTANBUL']").click();
        Thread.sleep(2000);
       // driver.findElementByXPath("//select[@name='township']").click();//ilçe
        driver.findElementByXPath("//*[text()='EYÜPSULTAN']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//select[@name='district']").click();//mahalle
        driver.findElementByXPath("//*[text()='MERKEZ MAH']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//textarea[@class='js-address-textarea']").sendKeys(fk.lorem().characters(50,200));//adress
        Thread.sleep(5000);
        driver.findElementByXPath("//button[@class='button green js-set-country js-prevent-emoji']").click();//kaydet
        Thread.sleep(2000);
        driver.findElementByXPath("//button[@class='button block green js-proceed-button']").click();//kaydet ve devam et
    }
}
