public class RoadBikeTire extends Tire{
    private static final String width = "NARROW";

    @Override
    void getDescription() {
        System.out.println("Road bike tire width:" + width);
    }
}
