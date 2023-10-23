package collections.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class ProductSearchStepDefinitions {

    private WebDriver driver;

//    @Given("the user is logged in")
//    public void givenUserIsLoggedIn() {
//        // Assuming the user is already logged in, perform necessary actions or navigate to a logged-in state
//        // For simplicity, this method is left empty
//    }

    @When("the user searches for a product")
    public void whenUserSearchesForProduct() {
        // No search action needed, the items are already displayed after login
    }

    @Then("the search results should be displayed")
    public void thenSearchResultsShouldBeDisplayed() {
        // Assuming the items are displayed after logging in, we can verify the presence of items

        // Adjust the locator based on the actual elements on the page
        By itemLocator = By.className("inventory_item");

        // Verify that at least one item is displayed
        WebElement firstItem = driver.findElement(itemLocator);
        Assert.assertTrue(firstItem.isDisplayed());
    }
}
