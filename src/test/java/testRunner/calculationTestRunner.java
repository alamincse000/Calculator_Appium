package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screen.CalculationScreen;

import java.io.IOException;

public class calculationTestRunner extends Setup {
    @Test
    public void doSum() throws IOException, InterruptedException, IOException {
        CalculationScreen calculationScreen=new CalculationScreen(driver);
        String res= calculationScreen.doSum();
        Assert.assertEquals(res,"11");
        System.out.println(res);
    }
}

