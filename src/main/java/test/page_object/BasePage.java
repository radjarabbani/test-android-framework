package test.page_object;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.android_driver.AndroidDriverInstance;
import test.utils.Utils;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class BasePage {
    public By element(String elementLocator) {
        String elementValue = Utils.ELEMENTS.getProperty(elementLocator);

        String[] locator = elementValue.split("_");
        String locatorType = locator[0];
        String locatorValue = elementValue.substring(elementValue.indexOf("_") + 1);
        return switch (locatorType) {
            case "id" -> By.id(locatorValue);
            case "name" -> By.name(locatorValue);
            case "xpath" -> By.xpath(locatorValue);
            case "containsText" -> By.xpath(String.format("//*[contains(@text, '%s')]", locatorValue));
            case "cssSelector" -> By.cssSelector(locatorValue);
            case "accessibilityId" -> AppiumBy.accessibilityId(locatorValue);
            case "className" -> By.className(locatorValue);
            default -> throw new IllegalStateException("Unexpected locator type: " + locatorType);
        };
    }

    public AndroidDriver driver() {
        return AndroidDriverInstance.androidDriver;
    }

    public AndroidDriver getDriver() {
        return AndroidDriverInstance.androidDriver;
    }

    public WebElement waitUntil(ExpectedCondition<WebElement> expectation) {
        WebDriverWait wait = new WebDriverWait(driver(), TIMEOUT);
        return wait.until(expectation);
    }

    //After UI Map
    public void tap(String element) {
        waitUntil(ExpectedConditions.elementToBeClickable(element(element))).click();
    }

    public void typeOn(String element, String text) {
        waitUntil(ExpectedConditions.visibilityOfElementLocated(element(element))).sendKeys(text);
        System.out.println(element);
    }

    public void assertIsDisplay(String element) {
        try {
            waitUntil(ExpectedConditions.visibilityOfElementLocated(element(element))).isDisplayed();
        } catch (NoSuchElementException e) {
            throw new AssertionError(String.format("This element '%s' not found", element));
        }
    }
}
