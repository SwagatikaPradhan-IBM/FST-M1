import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Title of Popups page: " + driver.getTitle());

        WebElement button = driver.findElement(By.className("orange"));

        actions.moveToElement(button).build().perform();
        String tooltipMessage = button.getAttribute("data-tooltip");
        System.out.println(tooltipMessage);

        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        driver.quit();




    }
}
