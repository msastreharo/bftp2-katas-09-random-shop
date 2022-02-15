package product;

public class GourmetProduct implements Product {
    private final int ageInYears;
    private final boolean isStinky;

    public GourmetProduct(int ageInYears, boolean isStinky) {
        this.ageInYears = ageInYears;
        this.isStinky = isStinky;
    }
    public Double getPrice() {
        if (isStinky) {
            return 10.0 * ageInYears;
        }
        return 20.0 * ageInYears;
    }
}
