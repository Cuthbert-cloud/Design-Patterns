public class CandyStore {
    //    public static void main(String[] args) {
//        CandyFactory candyFactory = new CandyFactory();
//        candyFactory.getCandyPackage(12, "white", "chocolate");
//        candyFactory.getCandyPackage(7, "dark", "chocolate");
//        candyFactory.getCandyPackage(14, "lollipop", "hard candy");
//        candyFactory.getCandyPackage(20, "peppermint", "hard candy");
//    }
    private static final CandyFactory chocolateFactory = new ChocolateFactory();
    private static final CandyFactory hardCandyFactory = new HardCandyFactory();

    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(7, "dark");
        hardCandyFactory.getCandyPackage(14, "lollipop");
        hardCandyFactory.getCandyPackage(50, "candy cane");
    }
}
