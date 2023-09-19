package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.ebay.com/");

        Actions action = new Actions(driver);
        WebElement us = driver.findElement(By.linkText("Electronics"));
        //mouse hover action on the element to do the actions class
        action.moveToElement(us).build().perform();
        //NOTE you need build when need to chain multiple action
        //Ex action.moveToElement(us).click().sendKeys("Hello").build().perform();

        WebElement japan = driver.findElement(By.linkText("Cell Phones & Smartphones"));
        // action.moveToElement(japan).click().perform();
        japan.click();
        //hello//
//hello2//

    }
    }
