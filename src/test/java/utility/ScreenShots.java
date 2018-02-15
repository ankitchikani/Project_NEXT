package utility;

import mydrivers.DriverBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenShots extends DriverBase
{
    public void takeScreenShot(String ScreenshotName) {
        try {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File(".MyScreenshots" + ScreenshotName+".png"));
            System.out.println("SCREENSHOT IS TAKEN");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception While Taking Screenshot: "+ e.getMessage());
        }
    }

}
