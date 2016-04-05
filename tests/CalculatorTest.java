package tests;

import apps.CalculatorMathOperations;
import org.testng.annotations.Test;
import settings.DeviceSettings;

/**
 * Created by Ihor on 3/30/2016.
 */
public class CalculatorTest extends DeviceSettings {

    @Test
    public void addNumbers() throws InterruptedException {
        CalculatorMathOperations calculatorTest = new CalculatorMathOperations();
        calculatorTest.closeWelcomeScreen();
        calculatorTest.putFirstNumber();
        calculatorTest.toMultiply();
        calculatorTest.putFirstNumber();
        calculatorTest.getResult();
        calculatorTest.openMenu();
        calculatorTest.navigateBack();
        calculatorTest.closeTheApp();
    }

}
