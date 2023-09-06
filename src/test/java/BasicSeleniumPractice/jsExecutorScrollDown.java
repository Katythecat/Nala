package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class jsExecutorScrollDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");

        WebElement helpCenter=driver.findElement(By.xpath("//a[@class='popular-list-1']"));

        /*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(helpCenter));*/


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start', inline: 'nearest'})",helpCenter);


//        helpCenter.click(); remember if normal click doesn't work always use js

        js.executeScript("arguments[0].click();", helpCenter);




    }
}

