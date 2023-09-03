package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTable3WithPage {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.linkText("PIM")).click();

        // check box at ID 94003A
        boolean flag=false;
        while(!flag) {
            List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < column.size(); i++) {
                String id = column.get(i).getText();
                if (id.equalsIgnoreCase("92255A")) {
                    System.out.println(i);
                    driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[2]")).click();
                    flag = true;
                    break;
                }
            }
            if(!flag){
                driver.findElement(By.xpath("//a[text()='Next']")).click();
            }
        }

    }
}
