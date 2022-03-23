import java.awt.*;

public interface Builder {
    BedroomBuilder setDimensions(Dimension dimensions);

    BedroomBuilder setCeilingHeight(int ceilingHeight);

    BedroomBuilder setFloorNumber(int floorNumber);

    BedroomBuilder setWallColor(Color wallColor);

    BedroomBuilder setNumberOfWindows(int numberOfWindows);

    BedroomBuilder setNumberOfDoors(int numberOfDoors);
}
