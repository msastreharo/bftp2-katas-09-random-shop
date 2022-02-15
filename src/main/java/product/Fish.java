package product;

public class Fish implements Product {
    private final Double basePrice;
    private final String color;

    public Fish(Double basePrice, String color){
        this.basePrice = basePrice;
        this.color = color;
    }

    public Double getPrice() {
        switch (color) {
            case "blue":
                return basePrice + 0.1;
            case "gold":
                return basePrice * 100;
            default:
                return basePrice;
        }
    }
}
