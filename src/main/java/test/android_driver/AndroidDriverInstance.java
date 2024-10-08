package test.android_driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver androidDriver;

    public static void initialize() {
        UiAutomator2Options caps = new UiAutomator2Options();

        caps.setPlatformName("Android");
        caps.setPlatformVersion("12.0");
        caps.setDeviceName("Pixel_6_API_31");
        caps.setUdid("emulator-5554");
        caps.setApp("/Users/radjarabbani/Downloads/app-development-debug9.apk");
        caps.setAppWaitActivity("*");


        try {
            androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            System.out.println(androidDriver.getPageSource());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void quit() {
        androidDriver.quit();
    }
}
