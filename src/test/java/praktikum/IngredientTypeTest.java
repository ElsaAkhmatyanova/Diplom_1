package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private final IngredientType ingredientType;

    public IngredientTypeTest(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    @Parameterized.Parameters(name = "Тестовые данные: name = {0}")
    public static Object[][] getTypeData() {
        return new Object[][]{
                {IngredientType.FILLING},
                {IngredientType.SAUCE},
        };
    }

    @Test
    public void getIngredientType() {
        Ingredient ingredient = new Ingredient(ingredientType, "Test", 200);
        IngredientType actual = ingredient.getType();
        assertThat("In class IngredientType getIngredientType method returns incorrect value", actual, equalTo(ingredientType));
    }
}
