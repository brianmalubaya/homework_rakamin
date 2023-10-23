package collections.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.junit.Assert;

public class UserLoginStepDefinitions {

    private WebDriver driver;

    @Given("the user is on the SauceDemo login page")
    public void givenUserIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters valid username and password")
    public void whenUserEntersValidCredentials() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter valid credentials
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        // Click the login button
        loginButton.click();
    }

    @Then("the user should be logged in")
    public void thenUserShouldBeLoggedIn() {
        WebElement loggedInUser = driver.findElement(By.id("react-burger-menu-btn"));

        // Verify that the user is logged in
        Assert.assertTrue(loggedInUser.isDisplayed());
    }

    @When("the user clicks on the logout button")
    public void whenUserClicksLogoutButton() {
        WebElement logoutButton = driver.findElement(By.id("logout-button"));

        // Click the logout button
        logoutButton.click();
    }

    @Then("the user should be logged out")
    public void thenUserShouldBeLoggedOut() {
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Verify that the login button is displayed, indicating the user is logged out
        Assert.assertTrue(loginButton.isDisplayed());
    }
}
