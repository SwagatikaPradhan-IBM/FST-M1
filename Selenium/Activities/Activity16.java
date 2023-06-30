import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class Activity16 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of Dynamic Attributes page: " + driver.getTitle());

        WebElement userName = driver.findElement(By
                .xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By
                .xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By
                .xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By
                .xpath("//label[contains(text(), 'mail')]/following-sibling::input"));

        userName.sendKeys("DemoUser");
        password.sendKeys("Password");
        confirmPassword.sendKeys("Password");
        email.sendKeys("demo_email@xyz.com");

        driver.findElement(By.xpath("//button[contains(text(), " +
                "'Sign Up')]")).click();

        String signUpMessage = driver.findElement(By.id("action-confirmation"))
                .getText();
        System.out.println("SignUp message: " + signUpMessage);

        driver.close();




    }
}
