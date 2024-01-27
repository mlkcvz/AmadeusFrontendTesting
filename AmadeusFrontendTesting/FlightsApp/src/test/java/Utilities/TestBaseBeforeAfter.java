package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeAfter
{
    protected WebDriver driver; // inherit edebilmemiz için protected yazdım

    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();//webdriver managerı kurdum
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://flights-app.pages.dev/");


    }

    @After
    public void tearDown() {

        driver.quit();
    }

}
