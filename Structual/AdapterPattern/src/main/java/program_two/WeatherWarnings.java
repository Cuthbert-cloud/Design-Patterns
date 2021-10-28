package program_two;

public class WeatherWarnings {

    public static double MAX_TEMP = 100;
    public static double MIN_TEMP = 16;

    public void postWarning(City city) {
        if (city.getTemp() >= MAX_TEMP || city.getTemp() <= MIN_TEMP) {
            System.out.println("Warning! current temperature in " + city.getName() + " is "
                    + city.getTemp() + " " + city.getTempScale());
            city.setHasWeatherWarning(true);
        } else {
            System.out.println("Temperature in " + city.getName() + " is OK.");
        }
    }
}
