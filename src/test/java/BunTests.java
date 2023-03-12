import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTests {
    private final Bun bun = new Bun("С Кусьлой", 12.99f);

    @Test
    public void testNameBun() {
        Assert.assertEquals("С Кусьлой", bun.getName());
    }

    @Test
    public void testPriceBun() {
        Assert.assertEquals(12.99f, bun.getPrice(), 0);
    }
}