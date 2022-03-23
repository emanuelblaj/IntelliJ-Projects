import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String [] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.5f, true);
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 54343);
        phonebook.put("Brenda", 36343);
        phonebook.put("Gary", 22222);
        System.out.println("Kevin's number : " + phonebook.get("Kevin"));

        System.out.println("\nList of contacts in phonebook: ");
        for(Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
