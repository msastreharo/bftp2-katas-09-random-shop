import org.junit.jupiter.api.Test;
import product.Animal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AnimalTest {

    @Test
    void animalCostDependsOnNumberOfLegs() {
        assertThat(new Animal("pulpo", 8).getPrice(), equalTo(33.6));
        assertThat(new Animal("perro", 4).getPrice(), equalTo(16.8));
    }
}
