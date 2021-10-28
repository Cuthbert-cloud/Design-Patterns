package program_one;

public class TruckPriceCalculator implements PriceCalculator {

    private final int age;
    private final int mileage;
    public final static int averagePrice = 10000;

    public TruckPriceCalculator(int age, int mileage) {
        this.age = age;
        this.mileage = mileage;
    }

    @Override
    public String calculatePrice() {
        int price = Math.max(averagePrice - age * 100 - mileage / 100, 0);
        return price + " USD";
    }
}
