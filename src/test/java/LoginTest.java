import org.apache.spark.ui.DelegatingServletContextHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class LoginTest {

        public static void main(String[] args) {
            //Browser driver exe
            System.setProperty("webdriver.chrome.driver", "B:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Open the webpage
            driver.get("https://dev.roboket.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Wait for page elements to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Enter username
            WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));
            usernameInput.isDisplayed();
            usernameInput.isEnabled();
            usernameInput.sendKeys("mdsadikurrahman26@gmail.com");

            // Enter password
            WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
            passwordInput.isDisplayed();
            passwordInput.isEnabled();
            passwordInput.sendKeys("123456");

            // Login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='kc-login']"));
            loginButton.isDisplayed();
            loginButton.isEnabled();
            loginButton.click();

            // Wait for the login process to complete
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            // Asserting to ensure that login worked properly

            WebElement welcome = driver.findElement(By.id("Welcome"));
            String ActualValue = welcome.getText();
            //System.out.println(welcome.getText());
            String ExpectedValue = "Welcome";
            if (ActualValue == ExpectedValue) {
                System.out.println("Test Case Pass");
            } else
                System.out.println("Test Case Failed");

            // Close the browser
            driver.quit();
        }
    }