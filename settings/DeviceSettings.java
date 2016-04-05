package settings;

import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ihor on 3/30/2016.
 */
public class DeviceSettings {

    public static AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.VERSION, "6.0");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", "D:\\MobileTestApk\\org.solovyev.android.calculator-2.1.3.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    public void log(String message) {
        Reporter.log(new Date().toString() + "\t" + message + "\n");
    }


}
