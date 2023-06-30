import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class Activity20 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of Alerts page: " + driver.getTitle());

        driver.findElement(By.id("prompt")).click();
        Alert promtAlert = driver.switchTo().alert();
        String alertText = promtAlert.getText();
        System.out.println("Text in alert: " + alertText);

        promtAlert.sendKeys("Awesome!");
        promtAlert.accept();

        driver.close();




    }
}
