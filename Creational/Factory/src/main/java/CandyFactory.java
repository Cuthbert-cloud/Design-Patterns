import java.util.ArrayList;

public abstract class CandyFactory {
//    public Candy getCandy(String section) {
//        return switch (section) {
//            case "dark" -> new Chocolate_dark();
//            case "white" -> new Chocolate_white();
//            case "candycane" -> new HardCandy_CandyCane();
//            case "lollipop" -> new HardCandy_Lollipop();
//            case "peppermint" -> new HardCandy_Peppermint();
//            default -> new Chocolate_milk();
//        };
//    }
//
//    public ArrayList getCandyPackage(int quantity, String type, String section) {
//        Candy candy = getCandy(type);
//
//        if (section.equals("hard candy")) {
//            if (quantity % 10 != 0) {
//                System.out.println("Hard candy must be packaged in multiples of 10.");
//                return null;
//            }
//        }
//        ArrayList candyPackage = candy.makeCandyPackage(quantity);
//        return candyPackage;
//    }
    public abstract Candy getCandy(String type);

    public ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
