import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding entries
        treeMap.put(103, "Alice");
        treeMap.put(101, "Bob");
        treeMap.put(102, "Charlie");
        treeMap.put(104, "Dave");

        // Printing the TreeMap->Sorted key
        System.out.println("TreeMap: " + treeMap);
        //TreeMap: {101=Bob, 102=Charlie, 103=Alice, 104=Dave}
    }
}
