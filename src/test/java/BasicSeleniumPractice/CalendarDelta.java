package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalendarDelta {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");

        //click on calendar
        driver.findElement(By.id("input_departureDate_1")).click();
        //get a month
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));

        boolean flag=false;
        while(!flag){
            String months= month.getText();
            if(months.equalsIgnoreCase("November")){
                //select day
                List<WebElement> day = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement d:day){
                    String days=d.getText();
                    if(days.equalsIgnoreCase("20")){
                        d.click();
                        flag=true;
                        break;
                    }
                }
            }
            if(!flag){
                next.click();
        }


        }
    }
}
