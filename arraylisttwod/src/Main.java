import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<ArrayList<String>>  groceryList = new ArrayList<>();

        ArrayList<String> backeryList = new ArrayList();
        backeryList.add("pizza");
        backeryList.add("garlic bread");
        backeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");
        drinkList.add("wine");


        groceryList.add(backeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(2).get(1));

    }
}
