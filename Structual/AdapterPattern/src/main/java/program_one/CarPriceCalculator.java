package program_one;

public class CarPriceCalculator implements PriceCalculator {

    private final int age;
    private final String model;
    private final static int averageCarPrice = 6000;

    public CarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public int getRetailPrice() {
        return switch (model) {
            case "Ford" -> 3000;
            case "Audi" -> 5000;
            case "BMW" -> 7000;
            case "Tesla" -> 10000;
            default -> averageCarPrice;
        };
    }

    @Override
    public String calculatePrice() {
        int price = Math.max(getRetailPrice() - (age * 100), 0);
        return price + " USD";
    }
}
