import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        //Adding elements
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(3); // Attempting to add duplicate element
        System.out.println("HashSet: "+hashSet);
        //Output
        //HashSet: [1, 2, 3, 4, 5] doesn't maintain order
    }
}
