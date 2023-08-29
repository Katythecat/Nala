package BasicSeleniumPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmTitle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        String title=driver.getTitle();
        System.out.println(title);

        // normally we used assertion to verify the result
        Assert.assertEquals(title,"Web Orders");

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct");

        }else{
            System.out.println("The title is NOT correct");
        }
    }
}
