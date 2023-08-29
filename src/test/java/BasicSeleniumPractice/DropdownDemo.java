package BasicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.management.ThreadInfo;
import java.util.List;

public class DropdownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        /*WebElement dd=driver.findElement(By.id("select-demo"));
        Select select=new Select(dd);
        select.selectByVisibleText("Wednesday");
        Thread.sleep(2000);
        select.selectByIndex(1);//index start from 0 in this case 0 is "Please select"
        Thread.sleep(2000);
        select.selectByValue("Friday");*/

        //select multi dropdown

        WebElement multi=driver.findElement(By.id("multi-select"));
        Select select1 = new Select(multi);

        List<WebElement> options=select1.getOptions();
        System.out.println("Total options "+options.size());
        for(WebElement op:options){
            String opp=op.getText();
            System.out.println(opp);
        }
        select1.selectByVisibleText("Ohio");
        select1.selectByVisibleText("New Jersey");
        select1.selectByIndex(7);
        driver.findElement(By.id("printAll")).click();


        /*List<WebElement> selectedOptionss = select1.getAllSelectedOptions();

        // Print the text of each selected option
        for (WebElement option : selectedOptionss) {
            System.out.println("Selected Option: " + option.getText());
        }*/
        List<WebElement> selectedOptions = select1.getAllSelectedOptions();
        for(WebElement m:selectedOptions){
            System.out.println("Selected Option: "+m.getText());
        }
        System.out.println(select1.isMultiple());






    }
}
