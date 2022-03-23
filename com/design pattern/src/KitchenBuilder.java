import java.awt.*;

public class KitchenBuilder {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    public KitchenBuilder() {

    }

    public KitchenBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

}
