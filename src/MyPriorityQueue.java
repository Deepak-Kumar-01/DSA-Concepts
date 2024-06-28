import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        //Priority Queue implements heap Data Structure
        //By default it stores elements in Min Heap
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        //Adding elements
        pq.add(4);
        pq.add(2);
        pq.add(5);
        pq.add(1);
        pq.add(3);
        //Element Store in natural order(ascending means Min Binary Heap)
        //The internal structure of a priority queue may not represent a sorted list; it represents a binary heap.
        System.out.println("Priority Queue: "+pq);

        //Removing Elements
        pq.poll();
        System.out.println("After removing top heap element(min element): "+pq);
    }
}
