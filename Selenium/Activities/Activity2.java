import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/login-form");
        System.out.println("Title of Login page: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='username']"))
                .sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']"))
                .click();
        String expected = driver.findElement(By
                        .xpath("//div[@id='action-confirmation']"))
                        .getText();
        System.out.println(expected);
        driver.close();




    }
}
