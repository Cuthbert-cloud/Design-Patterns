public class Computer {

    private static final Computer computer = new Computer();

    private static boolean initialized = false;

    private Computer() {}

    private void init() {}

    public static Computer getInstance() {
        if (initialized) return computer;
        computer.init();
        initialized = true;
        return computer;
    }
}
