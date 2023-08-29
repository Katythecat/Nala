package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement femaleButton = driver.findElement(By.cssSelector("input[value='Female']"));

        boolean dis = femaleButton.isDisplayed();
        System.out.println("Display " + dis);
        boolean enable = femaleButton.isEnabled();
        System.out.println("Enable " + enable);
        boolean select = femaleButton.isSelected();
        System.out.println("IsSelect before click " + select);

        if (!femaleButton.isSelected()) {
            femaleButton.click();

            select = femaleButton.isSelected();
            System.out.println("IsSelect after click " + select);

        }

        List<WebElement> groupButton=driver.findElements(By.cssSelector("input[name='ageGroup']"));
        for(WebElement g:groupButton){
            String age=g.getAttribute("value");
            if(age.equals("15 - 50")){
                g.click();
            }
        }


        List<WebElement> radios = driver.findElements(By.cssSelector("input[name='ageGroup']"));
        for(WebElement radio:radios){
            String desire=radio.getAttribute("value");
            if(desire.equals("0 - 5")){
                radio.click();
            }
        }
    }
}
