package CurrysPC.PageObjectPackage;

import CurrysPC.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import javax.swing.*;
import java.util.List;

public class PriceRangePage extends DriverFactory {
    @FindBy(xpath = "//nav[1]//ul[1]//li[6]//div[1]//div[2]")
    WebElement PricerangeCheckbox;      //click

    @FindBy(css = ".ProductPriceBlock__Price-kfOwxc ")
    WebElement allPrices;

    @FindBy(xpath = "//article[@id='product10203355']//header[@class='productTitle']//span[1]")
    WebElement HPspectrei7;   //click


    public void over£1000 (){
        PricerangeCheckbox.click();
    }
    public void priceAssertion(){
    String actualcheckPrice = allPrices.getText();
    Assert.assertThat(actualcheckPrice,Matchers.greaterThanOrEqualTo("1000"));
    }

    public void clickOnHPspecturei7(){
        HPspectrei7.click();
    }

}
