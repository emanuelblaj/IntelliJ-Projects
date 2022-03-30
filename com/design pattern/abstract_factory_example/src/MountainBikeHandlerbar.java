public class MountainBikeHandlerbar extends HandleBar {

    private static String type = "FLAT";

    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
}
