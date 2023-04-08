package Pages;

import Utilities.Driverx;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DialogContent {

    public DialogContent() {
        PageFactory.initElementsd);

    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;


    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;


    @FindBy(linkText = "GİRİŞ YAP")
    public WebElement loginbutton;
}
