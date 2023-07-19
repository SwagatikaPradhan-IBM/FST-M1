package project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class googleTaskActivity {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        Thread.sleep(10000L);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void addTasksTest()
    {
        List<String> tasks = new ArrayList<>();
        tasks.add("Complete Activity with Google Tasks");
        tasks.add("Complete Activity with Google Keep");
        tasks.add("Complete the second Activity Google Keep");

        for (String task : tasks) {
            driver.findElement(AppiumBy.accessibilityId("Create new task")).click();

            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("add_task_title")));

            driver.findElement(AppiumBy.id("add_task_title"))
                    .sendKeys(task);

            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy
                .id("task_name")));
        List<WebElement> tasksActual = driver.findElements(AppiumBy
                .id("task_name"));
        List<String> actualTask = new ArrayList<>();
        for(int i = tasksActual.size()-1; i>=0 ; i--)
        {
            actualTask.add(tasksActual.get(i).getText());
        }
        System.out.println(actualTask);
        Assert.assertEquals(actualTask, tasks);

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
