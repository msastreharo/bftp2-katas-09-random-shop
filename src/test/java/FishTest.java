import org.junit.jupiter.api.Test;
import product.Fish;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FishTest {

    @Test
    void blueFishCost1CentPlusTheirBasePrice() {
        Fish fish = new Fish(0.0, "blue");

        assertThat(fish.getPrice(), equalTo(0.1));
    }

    @Test
    void goldenFishCostAHundredTimesTheirBasePrice() {
        Fish fish = new Fish(10.0, "gold");

        assertThat(fish.getPrice(), equalTo(1000.0));
    }

    @Test
    void regularFishCostTheirBasePrice() {
        Fish fish = new Fish(10.0, "other");

        assertThat(fish.getPrice(), equalTo(10.0));
    }
}
