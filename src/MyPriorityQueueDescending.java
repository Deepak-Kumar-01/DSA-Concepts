import java.util.PriorityQueue;
import java.util.Comparator;
public class MyPriorityQueueDescending {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ= new PriorityQueue<>(Comparator.reverseOrder());
        maxPQ.add(4);
        maxPQ.add(2);
        maxPQ.add(5);
        maxPQ.add(1);
        maxPQ.add(3);
        // The elements are stored in reverse order (descending)
        System.out.println("Max priority Queue: "+maxPQ);
        //Note:
        //n both examples, the internal structure of the priority queue ensures that the highest (or lowest)
        // priority element is efficiently accessible, making it suitable for scenarios
        // where such priority-based access is necessary.
    }
}
