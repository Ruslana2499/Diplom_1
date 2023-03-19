import common.Constants;
import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTests {
    private final Bun bun = new Bun("С Кусьлой", Constants.BUN_PRICE);

    @Test
    public void testNameBun() {
        Assert.assertEquals("С Кусьлой", bun.getName());
    }

    @Test
    public void testPriceBun() {
        Assert.assertEquals(Constants.BUN_PRICE, bun.getPrice(), 0);
    }
}