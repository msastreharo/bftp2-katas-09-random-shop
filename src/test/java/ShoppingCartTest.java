import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static java.lang.String.valueOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {

    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(3.5));
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(5.0));
    }

    @Test
    void calculatePriceForMagicCards_red_old() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 10, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(1.75));
    }

    @Test
    void calculatePriceForMagicCards_blue_old() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 10, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.5));
    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Here Goes Some Amazing Title", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(4.40));
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Here Goes Some Other Amazing Title", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(6.80));
    }

    @Test
    void calculatePriceForMagicCards_green_old() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 20, false, "green", null, "Magic: The Gathering - Here Goes Some Amazing Title", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(5.28));
    }

    @Test
    void calculatePriceForMagicCards_black_old() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 20, false, "black", null, "Magic: The Gathering - Here Goes Some Other Amazing Title", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(8.16));
    }

    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Here A Different Amazing Title", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.0));
    }

    @Test
    void calculatePriceForMagicCards_blacklotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black lotus", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(40000.0));
    }

    @Test
    void calculatePriceForFourLeggedAnimal() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, 1, false, "white", null, "Sparky", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(16.8));
    }

    @Test
    void calculatePriceForTwoLeggedAnimal() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(2, 1, false, "yellow", null, "Piolín", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(8.4));
    }

    @Test
    void calculatePriceForSixLeggedAnimal() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(6, 1, false, "yellow", null, "Beatle", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(25.200000000000003));
    }

    @Test
    void calculatePriceForBlueFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", new BigDecimal(valueOf(0.0)), "Blue Fish", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(0.10));
    }

    @Test
    void calculatePriceForGoldFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "gold", new BigDecimal(valueOf(1.0)), "Gold Fish", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }

    @Test
    void calculatePriceForAnyOtherFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", new BigDecimal(valueOf(1.0)), "Red Fish", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(1.0));
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);


        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(50.0));
    }

    @Test
    void calculatePriceForRegularSpider() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, null, null, "Spider: Regular", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(9.6));
    }

    @Test
    void calculatePriceForRedSpider() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "red", null, "Spider: Red", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(11.6));
    }

    @Test
    void calculatePriceForGoldenSpider() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "gold", null, "Spider: Gold", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(12.6));
    }

    @Test
    void calculatePriceForStinkySpider() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, null, null, "Spider: Stinky", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(4.8));
    }

}
