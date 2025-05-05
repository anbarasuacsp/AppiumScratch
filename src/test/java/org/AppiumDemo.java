package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;

public class AppiumDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g_60_");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "ZD2222JYLN");
//        caps.setCapability(MobileCapabilityType.APP,"/Users/anbarasu_a/Downloads/com-ebay-mobile-6140001-70287590-1d01a8bcf0d33988894d0c58b9d750d0.apk");
        caps.setCapability("appPackage", "com.ebay.mobile");
        caps.setCapability("appActivity", "com.ebay.mobile.home.impl.main.MainActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ebay.mobile:id/button_sign_in")));
//        WebElement popupclose = driver.findElement(By.id("com.ebay.mobile:id/button_sign_in"));
//        popupclose.click();
//
//        Thread.sleep(4000);

        WebElement searchinpout = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.ebay.mobile:id/search_box")));
        searchinpout.click();
        Thread.sleep(1000);

        WebElement inputthetext = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.ebay.mobile:id/search_src_text")));
        inputthetext.sendKeys("Cricket iPhone 13 Navy");
        Thread.sleep(2000);
        (driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(2000);

        WebElement firstproduct = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.ebay.mobile:id/cell_collection_item")));
        firstproduct.click();

//        TouchAction<?> touch = new TouchAction<>(driver);
//
//        WebElement modelselect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@content-desc=\"Model,Select,-1\"]")));
//        modelselect.click();
//        Thread.sleep(3000);
//
//
//        touch.tap(PointOption.point(282, 2076)).perform();
//        Thread.sleep(3000);
//
//
//        WebElement selectcarrier = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@content-desc=\"Carrier,Select,-1\"]")));
//        selectcarrier.click();
//        Thread.sleep(3000);
//        touch.tap(PointOption.point(540, 1564)).perform();
//
//        Thread.sleep(3000);
//        WebElement storagecapacity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@content-desc=\"Storage Capacity,Select,-1\"]")));
//        storagecapacity.click();
//        Thread.sleep(3000);
//        new TouchAction<>(driver)
//                .tap(PointOption.point(540, 2039))
//                .perform();
//        Thread.sleep(3000);
//
//        WebElement selectcolour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@content-desc=\"Color,Select,-1\"]")));
//        selectcolour.click();
//        Thread.sleep(3000);

        WebElement Buyitnow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Buy It Now\"]")));
        Buyitnow.click();
        Thread.sleep(3000);











//        com.ebay.mobile:id/cell_collection_item
//                accessability id = Buy It Now
//
//                select model = Model,No selection
//                buy bar button - com.ebay.mobile:id/buy_bar_button






//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"Search Keyword Search on eBay\"]")));
//        WebElement searchfield = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search Keyword Search on eBay\"]"));
//        searchfield.sendKeys("iphone");

//        driver.quit();


    }
}
