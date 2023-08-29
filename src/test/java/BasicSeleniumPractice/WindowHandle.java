package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://accounts.google.com");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

        String parent=driver.getWindowHandle(); // when we use Handle it goes direct to current by .get
        System.out.println(parent); //63B2C1555445238733A9E670F8453AFB
        // this id always dynamic you won't know which one is for what page

        Set<String> allWindows= driver.getWindowHandles();
        for(String w:allWindows){
            System.out.println(w);
            driver.switchTo().window(w);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                driver.findElement(By.className("promoted-search__input")).sendKeys("forgot my password"+ Keys.ENTER);
                break;
            }
        }
        System.out.println(driver.getTitle());

        //after done with another window we should switch bach to parent and verify

        driver.switchTo().window(parent);
        driver.findElement(By.id("identifierId")).sendKeys("Leo",Keys.ENTER);


    }
}
