package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By userField = By.id("login-username");
    private By passwordField = By.id("login-password");
    private By loginButton = By.id("login-login");
    private By errorMessage = By.xpath("//button[@id='kc-login']]");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterUser(String username) {
        driver.findElement(userField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}
