package BasicSeleniumPractice;

import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("food");
        Thread.sleep(1000);
        List<WebElement> food = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        for(int i=0;i< food.size();i++){
            String s=food.get(i).getText();
            System.out.println(s);
            if(s.contains("food near me")){
                food.get(i).click();
                break;
            }
        }

    }
}
