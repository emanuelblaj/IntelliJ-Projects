public class RoadBikeFactory extends BikeFactory{
    @Override
    Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    HandleBar createHandlebar() {
        return new RoadBikeHandlebar();
    }
}
