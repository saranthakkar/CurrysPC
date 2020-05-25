package CurrysPC.PageObjectPackage;

import CurrysPC.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
@FindBy(id = "search")
    WebElement searchbar;



public void homepageAssertion(){
    String actualhomepageURL = driver.getCurrentUrl();
    Assert.assertThat(actualhomepageURL, Matchers.containsString("www.currys.co.uk"));
}
    public void doSearch(String item){
        searchbar.sendKeys(item);
        searchbar.sendKeys(Keys.ENTER);
    }
    public void resultpageAssertion(){
    String actualresultpageURL = driver.getCurrentUrl();
    Assert.assertThat(actualresultpageURL, Matchers.containsString("hp-computing"));
    }


}
