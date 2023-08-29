package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandContains {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement userInput=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        userInput.sendKeys("Tester");

        //we can retrieve text that we sentKeys in username or password
        //by using .getAttribute("value") even they don't have value in the DOM
        // Cool right
       String enterUser=userInput.getAttribute("value");
       System.out.println(enterUser);


        driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("test");

        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        WebElement passText=driver.findElement(By.xpath("//label[text()='Password:']"));
        System.out.println(passText.getText());




    }
}
