package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Driverx {

    public static WebDriver driversx;

    public static WebDriver elements() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY, "true");


        if (driversx == null) {  //only use for one time
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
            driversx = new EdgeDriver(options);

        }

        driversx.manage().window().maximize();
        return driversx;



    }


    public static void quit() {
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (driversx!=null)
                driversx.quit();
            driversx=null;
        }
    }


}