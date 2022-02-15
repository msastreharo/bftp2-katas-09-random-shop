package product;

import java.math.BigDecimal;

public class MagicCard implements Product {
    private final String name;
    private final String color;
    private final int ageInYears;

    public MagicCard(String name, String color) {
        this.name = name;
        this.color = color;
        this.ageInYears = 1;
    }

    public MagicCard(String name, String color, int ageInYears) {
        this.name = name;
        this.color = color;
        this.ageInYears = ageInYears;
    }

    public Double getPrice() {
        if (this.name.equals("Magic: The Gathering - Black Lotus")) {
            return 40000.0;
        }
        switch (color) {
            case "blue":
                return isMoreThan10YearsOld() ? 2.5 : 5.0;
            case "red":
                return 3.5;
            case "green":
                return 4.40;
            case "black":
                return 6.80;
            default:
                return 2.0;
        }
    }

    private boolean isMoreThan10YearsOld() {
        return ageInYears > 10;
    }
}
