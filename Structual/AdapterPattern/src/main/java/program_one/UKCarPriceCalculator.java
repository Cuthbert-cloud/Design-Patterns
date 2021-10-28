package program_one;

public class UKCarPriceCalculator extends CarPriceCalculator {

    public UKCarPriceCalculator(String model, int age) {
        super(model, age);
    }

    public int getPrice() {
        return this.getRetailPrice();
    }
}
