import java.util.LinkedList;
import java.util.Queue;
public class MyQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queue before removing head: "+queue);
        //Removing Head queue implementation
        queue.remove();
        queue.add(50);
        //ex- inserting at particular index
        //queue.add(2,10);//doesn't exist because of Queue<Integer>/Queue interface
        System.out.println("Queue after removing head"+queue);
        LinkedList<Integer> list= new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("LinkedList before removing head: "+list);
        //Removing Head queue implementation
        list.remove();
        //List interface gives add on functionality of list type
        //ex- inserting at particular index
        list.add(2,10);
        list.add(50);
        System.out.println("LinkedList after removing head"+list);
    }
}
