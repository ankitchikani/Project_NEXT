import mydrivers.DriverBase;
import org.junit.After;
import org.junit.Before;

public class Hook
{
    DriverBase driverBase=new DriverBase();

    @Before
    public void projectSetup() {

        driverBase.browser();
        driverBase.navigateTo("http://www.argos.co.uk");
        driverBase.maximizeScreen();
        driverBase.deleteCookies();
        driverBase.applyImplicitWait();
        driverBase.Actions();
    }
    @After
    public void Teardown(){
        driverBase.closeBrowser();
    }

}
