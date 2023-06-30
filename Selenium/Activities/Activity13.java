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

public class Activity13 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/tables");
        System.out.println("Title of Tables page: " + driver.getTitle());

        List<WebElement> rows = driver.findElements(By
                .xpath("//table[contains(@class, 'strip')]" +
                        "/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        List<WebElement> cols = driver.findElements(By
                .xpath("//table[contains(@class, 'strip')]" +
                        "/tbody/tr[1]/td"));
        System.out.println("Number of columns: " + cols.size());

        List<WebElement> thirdRow = driver.findElements(By
                        .xpath("//table[contains(@class, " +
                                "'strip')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }

        WebElement cellValue = driver.findElement(By
                .xpath("//table[contains(@class, 'strip')]" +
                        "/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + cellValue.getText());

        driver.close();




    }
}
