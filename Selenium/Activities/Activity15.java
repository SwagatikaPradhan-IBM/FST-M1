import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Activity15 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of Dynamic Attributes page: " + driver.getTitle());

        WebElement username = driver.findElement(By
                .xpath("//input[starts-with(@class, 'username-')]"));
        WebElement password = driver.findElement(By
                .xpath("//input[starts-with(@class, 'password-')]"));

        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        driver.close();




    }
}
