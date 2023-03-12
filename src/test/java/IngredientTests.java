import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTests {
    private final Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Сырный", 5.88f);

    @Test
    public void testIngredientName() {
        Assert.assertEquals("Сырный", ingredient.getName());
    }

    @Test
    public void testIngredientPrice() {
        Assert.assertEquals(5.88f, ingredient.getPrice(), 0);
    }
}
