package BasicSeleniumPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class CheckBoxDemo1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement singleCheck=driver.findElement(By.id("isAgeSelected"));
        if(!singleCheck.isSelected()){
            singleCheck.click();
        }
        WebElement text=driver.findElement(By.xpath("//div[text()='Success - Check box is checked']"));
        String confirm=text.getText();
        Assert.assertEquals(confirm,"Success - Check box is checked");


        //click one checkbox
        List<WebElement> multiCheckboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement mul : multiCheckboxes){
            String textBox=mul.getAttribute("value");
            if(textBox.equalsIgnoreCase("Option-2")){
                mul.click();
            }
        }

        // unclick the same checkbox then click all

        for(WebElement mul : multiCheckboxes){
            String textBox=mul.getAttribute("value");
            if(textBox.equalsIgnoreCase("Option-2")) {
                if (mul.isSelected()) {
                    mul.click();
                }
            }
        }

        driver.findElement(By.id("check1")).click();

        //it didn't work I don't know why will come back to fix later 8/23/23

        /*driver.findElement(By.id("myCheck")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textHidden=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()='Syntax Practice.'])[1]")));
        String t=textHidden.getText();
        Assert.assertEquals(t,"Syntax Practice.");*/



        /*driver.findElement(By.id("myCheck")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

// Wait for the element to be present in the DOM
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Syntax Practice.']")));

// Wait for the element to become visible
        WebElement textHidden = wait.until(ExpectedConditions.visibilityOf(textElement));

        String t = textHidden.getText();
        Assert.assertEquals(t, "Syntax Practice.");*/


    }


}
