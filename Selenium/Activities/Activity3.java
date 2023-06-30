import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
        System.out.println("Title of Home page: " + driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='About Us']")).click();
        System.out.println("Title of about us page: " + driver.getTitle());
        Thread.sleep(5000);
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
