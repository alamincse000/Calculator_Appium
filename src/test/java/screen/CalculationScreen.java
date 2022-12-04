package screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.Setup.PACKAGE_ID;
public class CalculationScreen {
    @FindBy(id = PACKAGE_ID+":id/digit_5")
    AndroidElement digit_5;
    @FindBy(id = PACKAGE_ID+":id/digit_6")
    AndroidElement digit_6;
    @FindBy(id = PACKAGE_ID+":id/op_add")
    AndroidElement plus;
    @FindBy(id = PACKAGE_ID+":id/eq")
    AndroidElement equals;
    @FindBy(id = PACKAGE_ID+":id/result_final")
    AndroidElement lblResult;


    public CalculationScreen(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum() throws InterruptedException {
        Thread.sleep(1000);
        digit_5.click();
        Thread.sleep(1000);
        plus.click();
        Thread.sleep(1000);
        digit_6.click();
        Thread.sleep(1000);
        equals.click();
        return lblResult.getText();
    }
}
