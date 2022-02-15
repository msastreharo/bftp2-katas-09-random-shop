import org.junit.jupiter.api.Test;
import product.GourmetProduct;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GourmetProductTest {
    @Test
    void wineCost20EuroPerYearOfAge() {
        GourmetProduct wine = new GourmetProduct(10, false);

        assertThat(wine.getPrice(), equalTo(200.00));
    }

    @Test
    void cheeseCost10EuroPerYearOfAge() {
        GourmetProduct cheese = new GourmetProduct(10, true);

        assertThat(cheese.getPrice(), equalTo(100.0));
    }
}
