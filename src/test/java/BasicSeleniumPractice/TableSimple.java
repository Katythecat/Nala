package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        // retrieve the whole table
        WebElement table=driver.findElement(By.id("customers"));
        String tTable= table.getText();
        //System.out.println(tTable);

        //print by row
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement r:rows){
            String row=r.getText();
            if(row.contains("UK")){
                //System.out.println(row);
            }

        }

        // retrieve all column
        List<WebElement> culumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement c:culumn){
            //System.out.println(c.getText());
        }

        // print the first column of every row
        List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement f:firstColumn){
            System.out.println(f.getText());
        }


    }
}
