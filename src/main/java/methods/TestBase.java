package methods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import misc_operations.get_Path;

public class TestBase {
    public static WebDriver driver = null;
    String path = get_Path.GetFile("Drivers/ChromeDriver/chromedriver_linux");
    @BeforeSuite
    public void initialize() throws IOException{
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://book.theautomatedtester.co.uk/");
    }
    @AfterSuite
    public void TeardownTest()
    {
        TestBase.driver.quit();
    }
}