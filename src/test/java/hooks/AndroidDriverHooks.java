package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import test.android_driver.AndroidDriverInstance;

import static test.utils.Constants.ELEMENTS;
import static test.utils.Utils.loadElementProperties;

public class AndroidDriverHooks {
    @Before(value = "@Android")
    public void initializeAndroidDriver() {
        AndroidDriverInstance.initialize();
        loadElementProperties(ELEMENTS);
    }

    @After(value = "@Android")
    public void quitDriver(Scenario scenario) {
        boolean testStatus = scenario.isFailed(); // true or false
        try {
            if (testStatus) {
                final byte[] data = ((TakesScreenshot) AndroidDriverInstance.androidDriver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(data, "image/png", "Failed Screenshot");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AndroidDriverInstance.quit();
        }
    }
}
