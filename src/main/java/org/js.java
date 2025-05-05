package org;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class js {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel6A");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, "Applications/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability("appPackage", "com.swaglabsmobileapp");  // Correct app package
        cap.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");  // Correct app activity

//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel6A");  // Emulator device ID
//        capabilities.setCapability("automationName", "uiautomator2");  // Automation engine for Android
//        capabilities.setCapability("app", "/Users/anbarasu_a/Documents/BDD_WorkShop/WorkShopSelenium/AppiumScratch/Applications/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");  // Path to the APK
//        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");  // Correct app package
//        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");  // Correct app activity
//        capabilities.setCapability("noReset", true);  // Optional: avoid resetting the app every time
//        capabilities.setCapability("fullContextList", true);  // Optional: capture full context list for hybrid apps

        AndroidDriver driver = new AndroidDriver(
                new URL("http://0.0.0.0:4723/wd/hub"), cap);


    }
}
