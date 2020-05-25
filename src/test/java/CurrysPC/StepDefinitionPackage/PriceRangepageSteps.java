package CurrysPC.StepDefinitionPackage;

import CurrysPC.PageObjectPackage.PriceRangePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PriceRangepageSteps {
    PriceRangePage priceRangePage = new PriceRangePage();

    @Given("^user is on the result page of HP laptop$")
    public void user_is_on_the_result_page_of_HP_laptop() throws Throwable {
    Thread.sleep(2000);
      priceRangePage.priceAssertion();
    }

    @When("^user clicks on over £(\\d+) price filter$")
    public void user_clicks_on_over_£_price_filter(int arg1) throws Throwable {
        priceRangePage.over£1000();

    }
    @And("^user clicks on i(\\d+) HP spectre Laptop$")
    public void userClicksOnIHPSpectreLaptop(int arg0) {
        priceRangePage.clickOnHPspecturei7();
    }

    @Then("^user should able to see i(\\d+) HP spectre Laptop$")
    public void userShouldAbleToSeeIHPSpectreLaptop(int arg0) throws InterruptedException {

    }
}
