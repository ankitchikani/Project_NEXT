import mydrivers.DriverBase;
import org.junit.After;
import org.junit.Before;

public class Hook
{
    DriverBase driverBase=new DriverBase();

    @cucumber.api.java.Before
    public void projectSetup() {

        driverBase.browser();
        driverBase.navigateTo("http://next.co.uk");
        driverBase.maximizeScreen();
        driverBase.deleteCookies();
        driverBase.applyImplicitWait();
        driverBase.Actions();
    }
    @cucumber.api.java.After
    public void Teardown(){
        //driverBase.closeBrowser();
    }

}
