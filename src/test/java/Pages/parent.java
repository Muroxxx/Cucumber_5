package Pages;

import Utilities.Driverx;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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


        scroll(element);
        element.click();

    }

    public void scroll(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) Driverx.elements();
        js.executeScript("arguments[0].scrollIntoView();",element);


    }

    public void waituntilvisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
