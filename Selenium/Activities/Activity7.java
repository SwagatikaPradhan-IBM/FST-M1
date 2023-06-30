import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/drag-drop");
        System.out.println("Title of Drag & Drop page: " + driver.getTitle());

        Actions action = new Actions(driver);

        WebElement football = driver.findElement(By.id("draggable"));

        WebElement dropzone1 = driver.findElement(By.id("droppable"));

        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        action.dragAndDrop(football, dropzone1).build().perform();
        if(dropzone1.findElement(By.xpath(".//p"))
                .getText().equals("Dropped!"))
        {
            System.out.println("Football is dropped in dropzone1");
        }
        else
        {
            System.out.println("Football is not dropped in dropzone1");
        }
        action.dragAndDrop(football, dropzone2).build().perform();
        if(dropzone2.findElement(By.xpath(".//p"))
                .getText().equals("Dropped!"))
        {
            System.out.println("Football is dropped in dropzone2");
        }
        else
        {
            System.out.println("Football is not dropped in dropzone2");
        }
        driver.close();




    }
}
