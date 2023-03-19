import common.Constants;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTests {
    @Mock
    Bun bun;
    @Mock
    Ingredient sauce;
    @Mock
    Ingredient filling;

    @Before
    public void setUp(){
        Mockito.when(bun.getPrice()).thenReturn(Constants.BUN_PRICE);
        Mockito.when(sauce.getPrice()).thenReturn(Constants.SAUCE_PRICE);
        Mockito.when(filling.getPrice()).thenReturn(Constants.FILLING_PRICE);
        Mockito.when(bun.getName()).thenReturn("Булочка с Кусьлой");
        Mockito.when(sauce.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(filling.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(sauce.getName()).thenReturn("Сырный");
        Mockito.when(filling.getName()).thenReturn("Кусьло");
    }

    @Test(expected=NullPointerException.class)
    public void testEmptyBurgerPrice(){
        Burger burger = new Burger();
        Assert.assertEquals(0, burger.getPrice(),0);
    }
    @Test
    public void testBurgerPrice(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        Assert.assertEquals(Constants.BUN_AND_SAUCE_PRICE, burger.getPrice(),0);
    }

    @Test
    public void testBurgerRemoveIngredient(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
        burger.removeIngredient(0);
        Assert.assertEquals(Constants.BUN_AND_FILLING_PRICE, burger.getPrice(),0);
    }

    @Test
    public void testBurgerReceipt(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
        Assert.assertEquals("(==== Булочка с Кусьлой ====)\r\n= sauce Сырный =\r\n= filling Кусьло =\r\n(==== Булочка с Кусьлой ====)\r\n\r\nPrice: 38,000000\r\n", burger.getReceipt());
    }

    @Test
    public void testBurgerReceiptMoveIngredient(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
        burger.moveIngredient(0,1);
        Assert.assertEquals("(==== Булочка с Кусьлой ====)\r\n= filling Кусьло =\r\n= sauce Сырный =\r\n(==== Булочка с Кусьлой ====)\r\n\r\nPrice: 38,000000\r\n", burger.getReceipt());
    }
}
