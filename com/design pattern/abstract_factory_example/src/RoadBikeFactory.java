public class RoadBikeFactory extends BikeFactory{
    @Override
    BikePart create(String type) {
        if(type.equalsIgnoreCase("tire")) {
            return new RoadBikeTire();
        } else if(type.equalsIgnoreCase("handlebar")) {
            return new RoadBikeHandlebar();
        } else{
            return null;
        }
    }

    /*  @Override
    Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    HandleBar createHandlebar() {
        return new RoadBikeHandlebar();
    }*/
}
