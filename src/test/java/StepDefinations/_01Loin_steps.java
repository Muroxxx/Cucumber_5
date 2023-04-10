package StepDefinations;
import Pages.DialogContent;
import Utilities.Driverx;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01Loin_steps {

    @Given("Navigate to campus")
    public void navigate_to_campus() {

        Driverx.elements().get("https://test.mersys.io/");


    }

    @When("Enter username and password")
    public void enter_username_and_password() {

        DialogContent s1=new DialogContent();
        WebDriverWait wait=new WebDriverWait(Driverx.elements(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(s1.username));


        s1.username.sendKeys("turkeyts");


        s1.password.sendKeys("TechnoStudy123");



        //s1.loginbutton.click();  instead of
        s1.findclick(s1.loginbutton);

    }
    @Then("User should login with success")
    public void user_should_login_with_success() {


    }



}
