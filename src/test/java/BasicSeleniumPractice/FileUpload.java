package BasicSeleniumPractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.cert.X509Certificate;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload"))
                .sendKeys("C:\\Users\\Wilasinee Ramirez\\Pictures\\Screenshot 2023-04-13 171721.png");
        driver.findElement(By.id("file-submit")).click();
    }
}
