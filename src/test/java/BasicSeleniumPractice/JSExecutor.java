package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        // to hightlight the username box
        // 1 Declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //js.executeScript("arguments[0].style.border='2px solid red'", userName);//border
        //js.executeScript("arguments[0].style.background='yellow'", userName);//background
        js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", userName);

        WebElement password= driver.findElement(By.id("txtPassword"));
        js.executeScript("arguments[0].value='Hum@hrm123'",password);

        WebElement click= driver.findElement(By.id("btnLogin"));
        js.executeScript("arguments[0].click()",click);

    }
}
