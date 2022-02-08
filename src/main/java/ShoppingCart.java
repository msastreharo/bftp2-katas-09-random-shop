import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        if (product.getName().startsWith("Spider")) {
            if (product.getColor() != null) {
                if (product.getColor() == "red") {
                    return BigDecimal.valueOf(2 + 1.2 * product.getNumberOfLegs());
                } else if (product.getColor() == "gold") {
                    return BigDecimal.valueOf(3 + 1.2 * product.getNumberOfLegs());
                } else {
                    return BigDecimal.valueOf(1.2 * product.getNumberOfLegs());
                }
            } else if (product.getColor() == null && product.isStinky()) {
                return BigDecimal.valueOf(4.8);
            } else if (product.getColor() == null) {
                return BigDecimal.valueOf(1.2 * product.getNumberOfLegs());
            }
        } else if (product.getNumberOfLegs() != null) {
            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            switch (product.getColor()) {
                case "blue":
                    if (product.getAge() != null && product.getAge() >= 10) {
                        return BigDecimal.valueOf(2.5);
                    } else {
                        return BigDecimal.valueOf(5.0);
                    }
                case "red":
                    if (product.getAge() != null && product.getAge() >= 10) {
                        return BigDecimal.valueOf(1.75);
                    } else {
                        return BigDecimal.valueOf(3.5);
                    }
                case "green":
                    if (product.getAge() != null && product.getAge() >= 20) {
                        return BigDecimal.valueOf(5.28);
                    } else {
                        return BigDecimal.valueOf(4.40);
                    }
                case "black":
                    if (product.getAge() != null && product.getAge() >= 20) {
                        return BigDecimal.valueOf(8.16);
                    } else {
                        return BigDecimal.valueOf(6.80);
                    }
                default:
                    return BigDecimal.valueOf(2.0);
            }
        } else if (product.getAge() != null) {
            if (product.isStinky()) {
                return BigDecimal.valueOf(10.0 * product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            switch (product.getColor()) {
                case "blue":
                    return product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold":
                    return product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default:
                    return product.getBasePrice();
            }
        }
        return product.getSellPrice();
    }
}

