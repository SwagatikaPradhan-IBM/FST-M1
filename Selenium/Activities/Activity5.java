import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of Input Events page: " + driver.getTitle());

        Actions action = new Actions(driver);

        action.click().pause(1000).build().perform();
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        action.doubleClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        action.contextClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        driver.close();




    }
}
