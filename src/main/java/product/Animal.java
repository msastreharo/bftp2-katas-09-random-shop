package product;

public class Animal implements Product {
    private final String name;
    private final int numberOfLegs;

    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public Double getPrice() {
        return numberOfLegs*4.2;
    }

}
