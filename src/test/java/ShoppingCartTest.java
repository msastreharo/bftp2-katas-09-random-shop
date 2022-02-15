import org.junit.jupiter.api.Test;
import product.Animal;
import product.Fish;
import product.GourmetProduct;
import product.MagicCard;

import java.math.BigDecimal;

import static java.lang.String.valueOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {
    @Test
    void calcularesThePriceOfNewProducts() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(new Fish(0.0, "blue"));
        shoppingCart.addProduct(new GourmetProduct(10, false));
        shoppingCart.addProduct(new MagicCard("Magic: The Gathering - a blue card", "blue"));
        shoppingCart.addProduct(new Animal("Araña", 8));

        assertThat(shoppingCart.getTotalPrice(), equalTo(205.1 + 33.6));
    }

}
