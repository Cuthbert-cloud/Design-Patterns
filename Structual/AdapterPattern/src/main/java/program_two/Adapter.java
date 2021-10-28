package program_two;

public class Adapter implements City {

    private final City city;

    public Adapter(AsianCity city) {
        this.city = city;
    }
    @Override
    public String getName() {
        return this.city.getName();
    }

    @Override
    public double getTemp() {
        double temp = this.city.getTemp();
        return temp * 1.8 + 32;
    }

    @Override
    public String getTempScale() {
        return "Fahrenheit";
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.city.setHasWeatherWarning(hasWeatherWarning);
    }

    @Override
    public boolean getHasWeatherWarning() {
        return this.city.getHasWeatherWarning();
    }
}
