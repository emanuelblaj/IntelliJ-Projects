import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Building building = new Building();
//        Office office = new Office();
//        build(building);
//        build(office);

//        List of buildings
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

//        List of ofices
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

//        List of houses
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);

        addHouseToList(houses);
        addHouseToList(buildings);

    }


//    static void build(Building building){
//        System.out.println("Constructing a new "+ building.toString());
//    }

    static void printBuildings(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size();i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }

}
