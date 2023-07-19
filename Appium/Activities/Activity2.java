import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {
    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL, options);

        driver.get("https://v1.training-support.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    }


    @Test
    public void chromeTest() throws InterruptedException {
        // Find heading on the page
        String pageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='Training Support']")).getText();

        System.out.println("Heading: " + pageHeading);

        driver.findElement(AppiumBy.xpath(
                "//android.view.View[@resource-id='about-link']")).click();
        Thread.sleep(10000L);
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='About Us']")).getText();
        System.out.println(aboutPageHeading);
    }


    // Tear down method
    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}