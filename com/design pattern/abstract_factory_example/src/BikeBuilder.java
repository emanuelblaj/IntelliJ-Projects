public class BikeBuilder {

    public static void main(String[] args) {
      createBikeWithExtensibleAbstractFactory("road bike");

    }

    public static void createBikeWithExtensibleAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = (Tire) bikeFactory.create("tire");
        tireFront.getDescription();
        Tire tireBack = (Tire) bikeFactory.create("tire");
        tireBack.getDescription();
        HandleBar handleBar = (HandleBar) bikeFactory.create("handlebar");
        handleBar.getDescription();;
    }

  /*  public static void createBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlerbar mountainBikeHandlerbar = new MountainBikeHandlerbar();
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlerbar.getDescription();
        System.out.println();
    }

    public static void createBikeWthAbstractFactory(String type) {

        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        HandleBar handleBar = bikeFactory.createHandlebar();
        tireFront.getDescription();
        tireBack.getDescription();
        handleBar.getDescription();
        System.out.println();
    }*/
}
