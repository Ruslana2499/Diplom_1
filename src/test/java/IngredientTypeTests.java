import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class IngredientTypeTests {
    private final IngredientType type;

    public IngredientTypeTests(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Iterable<Object[]> getType() {
        return Arrays.asList(new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING},
        });
    }

    @Test
    public void testIngredientType() {
        Ingredient ingredient = new Ingredient(type, "Сырный", 5.88f);
        Assert.assertEquals(type, ingredient.getType());
    }
}
