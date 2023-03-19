import common.Constants;
import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTests {
    private final Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Сырный", Constants.SAUCE_PRICE);

    @Test
    public void testIngredientName() {
        Assert.assertEquals("Сырный", ingredient.getName());
    }

    @Test
    public void testIngredientPrice() {
        Assert.assertEquals(Constants.SAUCE_PRICE, ingredient.getPrice(), 0);
    }
}
