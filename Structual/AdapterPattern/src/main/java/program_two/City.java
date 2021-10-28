package program_two;

public interface City {
    String getName();
    double getTemp();
    String getTempScale();
    void setHasWeatherWarning(boolean hasWeatherWarning);
    boolean getHasWeatherWarning();
}
