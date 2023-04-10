package StepDefinations;

import Utilities.Driverx;
import io.cucumber.java.After;

public class hooks {
    @After
    public void after(){
        Driverx.quit();
    }
}
