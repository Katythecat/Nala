package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("website is broken");

        driver.switchTo().frame("frame1");
        driver.switchTo().frame(1);
        driver.switchTo().frame(driver.findElement(By.id("broken")));
        // then find element in that frame and confirm anything in there , enter text
        WebElement frameBox= driver.findElement(By.id("framebox"));
        frameBox.sendKeys("Leo");
        //or
        frameBox.clear();

        //then switch back to parent
        driver.switchTo().defaultContent();
        //or
        driver.switchTo().parentFrame();



    }
}
