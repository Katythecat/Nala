package BasicSeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        // Alert is interface when we use it don't use with new keyword
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1500);
        alert.accept();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        alert.sendKeys("Leo");
        Thread.sleep(1500);
        alert.accept();

        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        //alert.dismiss();
        alert.accept();



    }
}
