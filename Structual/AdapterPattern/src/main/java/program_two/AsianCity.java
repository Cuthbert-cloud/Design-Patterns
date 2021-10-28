package program_two;

public class AsianCity implements City {

    private final String name;
    private final double temp;
    private boolean hasWeatherWarning;

    public AsianCity(String name, double temp) {
        this.name = name;
        this.temp = temp;
        this.hasWeatherWarning = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemp() {
        return temp;
    }

    @Override
    public String getTempScale() {
        return "Celsius";
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }

    @Override
    public boolean getHasWeatherWarning() {
        return hasWeatherWarning;
    }
}
