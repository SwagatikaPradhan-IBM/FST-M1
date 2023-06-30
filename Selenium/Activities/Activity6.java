import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of Input Events page: " + driver.getTitle());

        Actions action = new Actions(driver);

        action.sendKeys("S").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c")
                .keyUp(Keys.CONTROL).build().perform();
        String data = (String) Toolkit.getDefaultToolkit()
                .getSystemClipboard().getData(DataFlavor.stringFlavor);
        System.out.println(data);
        driver.close();




    }
}
