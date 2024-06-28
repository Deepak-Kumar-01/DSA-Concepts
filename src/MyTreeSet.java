import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        //For descending order
//      TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());


        // Adding elements
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);

        // Printing the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //TreeSet: [10, 20, 30, 40, 50] is sorted in ascending order
    }
}
