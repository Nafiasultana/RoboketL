package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPositiveTest {
    private WebDriver driver;

    @Test
    public void LoginPositiveTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.roboket.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPositiveTest login = new LoginPositiveTest();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));
        usernameInput.isDisplayed();
        usernameInput.isEnabled();
        usernameInput.sendKeys("mdsadikurrahman26@gmail.com");
        @FindBy("//input[@id='username')

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.isDisplayed();
        passwordInput.isEnabled();
        passwordInput.sendKeys("123456");
        @FindBy("123456")

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='kc-login']"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();
        Assert.assertFalse(login.isErrorMessageDisplayed());
