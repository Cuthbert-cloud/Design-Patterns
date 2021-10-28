package program_two;

public class Main {

    public static void main(String[] args) {
        WeatherWarnings weatherWarnings = new WeatherWarnings();

        NorthAmericaCity chicago = new NorthAmericaCity("Chicago", 16);
        weatherWarnings.postWarning(chicago);

        NorthAmericaCity phoenix = new NorthAmericaCity("Phoenix", 104);
        weatherWarnings.postWarning(phoenix);

        NorthAmericaCity portland = new NorthAmericaCity("Portland", 70);
        weatherWarnings.postWarning(portland);

        AsianCity bangkok = new AsianCity("Bangkok", 50);
        Adapter adapter = new Adapter(bangkok);
        weatherWarnings.postWarning(adapter);
    }
}
