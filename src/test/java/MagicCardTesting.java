import org.junit.jupiter.api.Test;
import product.MagicCard;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MagicCardTesting {

    @Test
    void blackLotusIsVeryExpensive() {
        MagicCard magicCard = new MagicCard("Magic: The Gathering - Black Lotus", "black lotus");

        assertThat(magicCard.getPrice(), equalTo(40000.0));
    }

    @Test
    void cardPriceIsBasedOnColor() {
        assertThat(new MagicCard("Magic: The Gathering - blue card", "blue", 1).getPrice(), equalTo(5.0));
        assertThat(new MagicCard("Magic: The Gathering - red card", "red", 1).getPrice(), equalTo(3.5));
        assertThat(new MagicCard("Magic: The Gathering - green card", "green", 1).getPrice(), equalTo(4.40));
        assertThat(new MagicCard("Magic: The Gathering - black card", "black", 1).getPrice(), equalTo(6.80));
        assertThat(new MagicCard("Magic: The Gathering - brown card", "brown", 1).getPrice(), equalTo(2.0));
    }

    @Test
    void blueCardsOlderThan10YearsCostHalf() {
        MagicCard magicCard = new MagicCard("Magic: The Gathering - blue", "blue", 12);

        assertThat(magicCard.getPrice(), equalTo(2.50));
    }
}
