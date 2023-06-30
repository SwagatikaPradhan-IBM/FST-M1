import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of Target Practice page: " + driver.getTitle());
        String third_header=driver.findElement(By
                .xpath("//h3[@id='third-header']")).getText();
        System.out.println(third_header);
        String fifth_header_color=driver.findElement(By
                .xpath("//h5[text()='Fifth header']"))
                .getCssValue("color");
        System.out.println(fifth_header_color);
        String violet_classes = driver.findElement(By
                .cssSelector(".ui.violet.button"))
                .getAttribute("class");
        System.out.println(violet_classes);
        String grey_text = driver.findElement(By
                        .cssSelector(".ui.grey.button")).getText();
        System.out.println(grey_text);
        driver.close();




    }
}
