package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://facebook.com");
        driver.findElement(By.linkText("Create new account")).click();

        WebElement month=driver.findElement(By.id("month"));
        Select select=new Select(month);
        select.selectByIndex(6);

        WebElement day=driver.findElement(By.id("day"));
        select = new Select(day);
        select.selectByValue("20");

        WebElement year=driver.findElement(By.id("year"));
        select=new Select(year);
        select.selectByVisibleText("1983");
    }
}
