package CurrysPC.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
DriverFactory driverFactory = new DriverFactory();
@Before
    public void setup(){
    driverFactory.openBrowser();
}

@After
    public void teardown() throws InterruptedException, IOException {
    driverFactory.closeBrowser();
}
}