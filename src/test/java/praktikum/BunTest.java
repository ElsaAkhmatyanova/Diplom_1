package praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BunTest {
    private final String bunName = "black bun";
    private final float bunPrice = 100;

    @Test
    public void getBunNameTest() {
        Bun bun = new Bun(bunName, bunPrice);
        String actualBunName = bun.getName();
        assertEquals("In class bun getName method returns incorrect value",bunName, actualBunName);
    }

    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun(bunName, bunPrice);
        float actualBunPrice = bun.getPrice();
        assertEquals("In class bun getPrice method returns incorrect value", bunPrice, actualBunPrice,0);
    }
}
