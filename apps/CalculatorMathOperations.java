package apps;

import org.openqa.selenium.By;
import org.testng.Assert;
import settings.DeviceSettings;

/**
 * Created by Ihor on 3/30/2016.
 */
public class CalculatorMathOperations extends DeviceSettings{

//    public void checkWelcomeScreen() {
//        log("Check Welcome Screen");
//        boolean a = Assert.assertTrue(driver.findElement(By.id("org.solovyev.android.calculator:id/wizard_welcome_message")).isDisplayed());
//        if (a)
//    }
    String theResult = "999 999 998 000 000 000";




    public void closeWelcomeScreen() {
        log("Close Welcome screen");
        driver.findElement(By.xpath("//android.widget.Button[@text='Skip']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='Yes']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text='Enter new expression']")).isDisplayed());
        log("Welcome screen closed. Calculator is opened");
    }

    public void putFirstNumber() {
        log("Put first number");
        for (int i=0; i<9; i++) {
            driver.findElement(By.xpath("//android.widget.Button[@text='9']")).click();
        }
    }
    public void toMultiply() {
        log("Click multiply sign");
//        WebElement element = driver.findElement(By.xpath("//android.widget.Button[@text='×']"));
//        WebElement target = driver.findElement(By.className("android.widget.EditText"));
//        (new Actions(driver)).dragAndDrop(element, target).perform();
//        Actions action = new Actions(driver);
//        Action dragDrop = action.dragAndDrop(element, target).build();
//        dragDrop.perform();
        driver.findElement(By.xpath("//android.widget.Button[@text='×']")).click();
    }

    public void getResult() {
        log("Set square value");
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        Assert.assertEquals(result, theResult, "Result of calculation is not valid");
    }

    public void openMenu() {
        log("Open app menu");
        driver.findElement(By.xpath("//*[@content-desc='More options'")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='About']")).click();
        String allNotes = driver.findElement(By.className("android.widget.TextView")).getText();
        String translator = driver.findElement(By.xpath("//android.widget.TextView[@text='Sergey Solovyev']")).getText();

        Assert.assertEquals(translator, allNotes, "Translator name doesn't match");
    }

    public void navigateBack() {
        log("Navigate back to the app");
        driver.findElement(By.className("android.widget.ImageButton")).click();
    }

    public void closeTheApp() {
        log("Close the app");
        driver.findElement(By.className("android.widget.ImageView")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Exit']")).click();
    }
}
