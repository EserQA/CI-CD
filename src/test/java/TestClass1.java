import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {
    public static WebDriver driver;
    @BeforeMethod
    public void launchDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void Test1(){
        driver.get("https://www.google.com/");
        System.out.println("Test1 title is " + driver.getTitle());
    }
    @Test
    public void Test2(){
        driver.get("https://www.google.com/");
        System.out.println("Test2 title is " + driver.getTitle());
    }
    @Test
    public void Test3(){
        driver.get("https://www.google.com/");
        System.out.println("Test3 title is " + driver.getTitle());
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

}
