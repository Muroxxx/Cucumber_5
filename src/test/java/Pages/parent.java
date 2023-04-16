package Pages;

import Utilities.Driverx;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class parent {


    WebDriverWait wait=new WebDriverWait(Driverx.elements(),Duration.ofSeconds(10));

    public  void sendkeysfunc(WebElement element,String text){

        waituntilvisible(element); // gözükene kadar bekle
        scroll(element);  // scroll yap
        element.clear();           // temizle
        element.sendKeys(text);    // gönder

    }

    public  void clickfunc(WebElement element){

        waitUntilClickable(element);
        scroll(element);
        element.click();

    }


    public void verify(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }


    public void scroll(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) Driverx.elements();
        js.executeScript("arguments[0].scrollIntoView();",element);


    }

    public void waituntilvisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
