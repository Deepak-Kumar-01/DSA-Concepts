import java.util.PriorityQueue;
import java.util.TreeMap;

public class CustomTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();
        int data1=10;
        int data2=20;
        int data3=40;
        int data4=2;
        if(!map.containsKey(0)){
            map.put(0,new TreeMap<>());
        }
        if(!map.get(0).containsKey(1)){
            map.get(0).put(1,new PriorityQueue<>());
        }
        map.get(0).get(1).offer(data1);
        map.get(0).get(1).offer(data2);
        map.get(0).get(1).offer(data3);
        map.get(0).get(1).offer(data4);


        System.out.println(map);
    }
}
