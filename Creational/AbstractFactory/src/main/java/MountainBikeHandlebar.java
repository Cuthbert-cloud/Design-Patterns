public class MountainBikeHandlebar extends Handlebar {

    private static final String width = "WIDE";
    private static final String pressure = "MEDIUM";

    @Override
    void getDescription() {
        System.out.println("Mountain bike tire. Width: " + width + ", pressure: " + pressure);
    }
}
