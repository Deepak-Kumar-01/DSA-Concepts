import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedListMap {
    public static void main(String[] args) {
        Map<String,String> linkedHashMap=new LinkedHashMap<>();
        // Adding entries
        linkedHashMap.put("USA", "Washington, D.C.");
        linkedHashMap.put("Canada", "Ottawa");
        linkedHashMap.put("UK", "London");
        linkedHashMap.put("Australia", "Canberra");

        // Printing the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);
        //LinkedHashMap: {USA=Washington, D.C., Canada=Ottawa, UK=London, Australia=Canberra}
    }
}
