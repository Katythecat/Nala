package BasicSeleniumPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.findElement(By.cssSelector("button#startButton")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        //WebElement msg=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String confirm=text.getText();
        Assert.assertEquals(confirm,"Welcome Syntax Technologies");




    }
}
