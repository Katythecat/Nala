package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        WebElement drop=driver.findElement(By.id("droppable"));
        WebElement drag=driver.findElement(By.id("draggable"));

        Actions action=new Actions(driver);
        action.dragAndDrop(drag,drop).perform();
    }
}
