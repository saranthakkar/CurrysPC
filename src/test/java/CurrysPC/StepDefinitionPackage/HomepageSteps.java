package CurrysPC.StepDefinitionPackage;

import CurrysPC.PageObjectPackage.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps {
    Homepage homepage = new Homepage();

    @Given("^user is on the homepage of CurrysPC website$")
    public void user_is_on_the_homepage_of_CurrysPC_website() throws Throwable {
        Thread.sleep(3000);
    homepage.homepageAssertion();
    }

    @When("^user wants to search for HP Laptops$")
    public void user_wants_to_search_for_HP_Laptops() throws Throwable {
        Thread.sleep(3000);
    homepage.doSearch("hp laptops");
    }

    @Then("^user should able to see all HP Laptops$")
    public void user_should_able_to_see_all_HP_Laptops() throws Throwable {
        Thread.sleep(3000);
    homepage.resultpageAssertion();
    }

}
