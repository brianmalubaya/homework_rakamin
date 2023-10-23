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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class AddToCartStepDefinitions {

    private WebDriver driver;
    @Given("the user is on the SauceDemo website")
    public void givenUserIsOnSauceDemoWebsite() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }
    @When("the user adds a product to the cart")
    public void whenUserAddsProductToCart() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bike-light")));
        addToCartButton.click();
    }

    @Then("the product should be in the cart")
    public void thenProductShouldBeInCart() {
        WebElement cartIcon = driver.findElement(By.id("shopping_cart_container"));
        Assert.assertTrue(cartIcon.isDisplayed());
    }

    @When("the user tries to check out with no items")
    public void whenUserTriesToCheckOutWithNoItems() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout-button")));
        checkoutButton.click();
    }

    @Then("an error message should be displayed")
    public void thenErrorMessageShouldBeDisplayed() {
        WebElement errorMessage = driver.findElement(By.className("error-message"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
