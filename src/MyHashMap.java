import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();

        //Adding entries
        hashMap.put("india",10);
        hashMap.put("usa",11);
        System.out.println("HashMap: "+hashMap);
        //HashMap: {usa=11, india=10}
        //retriving a grade
        int number=hashMap.get("india");
        System.out.println(number);
    }
}
