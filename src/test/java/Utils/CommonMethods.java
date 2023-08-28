package Utils;

import StepDefinitions.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;

    public static void openBrowser() {
        ConfigReader.readProperties();

        String browserType = ConfigReader.getValueOfProperty("browserType");
        switch (browserType) {
            case "Chrome":
                /*ChromeOptions ops = new ChromeOptions();
                ops.addArguments("--no-sandbox");
                ops.addArguments("--remote-allow-origins=*");
                if (ConfigReader.getValueOfProperty("Headless").equals("true")){
                    ops.addArguments("--headless=new");}
                driver = new ChromeDriver(ops);*/
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
        }
        driver.get(ConfigReader.getValueOfProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
        initializePageObjects();
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void doClick(WebElement element) {

        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }


}