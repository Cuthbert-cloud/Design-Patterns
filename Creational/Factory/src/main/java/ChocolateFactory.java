public class ChocolateFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {
        return switch (section) {
            case "dark" -> new Chocolate_dark();
            case "white" -> new Chocolate_white();
            default -> new Chocolate_milk();
        };
    }
}
