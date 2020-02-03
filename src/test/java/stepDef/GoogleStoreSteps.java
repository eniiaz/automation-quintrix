package stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.GoogleStoreHomepage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

public class GoogleStoreSteps {

    GoogleStoreHomepage gsh = new GoogleStoreHomepage();

    @When("user goes to google store hompage")
    public void user_goes_to_google_store_hompage() {
        Driver.getDriver().get(Config.getProperty("url"));
        Flow.wait(3);
    }

    @Then("user clicks on the nest wifi product")
    public void user_clicks_on_the_nest_wifi_product() {
        gsh.products.get(2).click();
        Flow.wait(3);
    }

    @Then("user clicks on Buy button")
    public void user_clicks_on_Buy_button() {
        gsh.buyButton.click();
        Flow.wait(3);
    }

    @Then("user selects first option of router")
    public void user_selects_first_option_of_router() {
        gsh.firstProductOption.click();
        Flow.wait(3);
    }

    @Then("user should see {string} in the cart")
    public void user_should_see_in_the_cart(String productName) {
        String actualProduct = gsh.cartProduct.getText().trim();
        Assert.assertEquals(productName, actualProduct);
        Flow.wait(3);
    }


}
