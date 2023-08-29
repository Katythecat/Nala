package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracBasicSelenium {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com"); //we can get with http://
        //driver.get("www.amazon.com"); we cannot get www. without http://

        //print all tag and give me how many of tag
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println(tag.size()); // .size help us find how many links are there

        //this is the way we write code to see all link
        /*
        1.find elements all a tag to get all link
        2.use loop to extract the links by capture through its attribute
         */

        for(WebElement tags:tag){
            String links=tags.getAttribute("href");
            System.out.println(links);
        }
    }

}
