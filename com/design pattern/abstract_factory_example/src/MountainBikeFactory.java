public class MountainBikeFactory extends BikeFactory {
    @Override
    BikePart create(String type) {
        if(type.equalsIgnoreCase("tire")) {
            return new MountainBikeTire();
        } else if(type.equalsIgnoreCase("handlebar")) {
            return new MountainBikeHandlerbar();
        } else {
            return null;
        }
    }

    /* @Override
    Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    HandleBar createHandlebar() {
        return new MountainBikeHandlerbar();
    }*/
}
