package collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
    private WebDriver driver;

    // Initialize WebDriver
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    // Your test methods go here

    // Close WebDriver after tests
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
