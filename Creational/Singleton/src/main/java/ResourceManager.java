public class ResourceManager {

    public static void main(String[] args) {
        Computer computer = Computer.getInstance();

        Thread threadOne = new Thread(() -> {Computer c = Computer.getInstance();});

        Thread threadTwo = new Thread(() -> {Computer c = Computer.getInstance();});

        threadOne.start();
        threadTwo.start();
    }
}
