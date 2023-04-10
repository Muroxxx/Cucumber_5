package Pages;

import Utilities.Driverx;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DialogContent extends parent{

    public DialogContent() {
        PageFactory.initElements(Driverx.elements(),this);

    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;


    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;


    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginbutton;


    public void findclick(WebElement element){
        clickfunc(element);
    }

    public void findsend(WebElement element,String text){
        sendkeysfunc(element,text);
    }
}
