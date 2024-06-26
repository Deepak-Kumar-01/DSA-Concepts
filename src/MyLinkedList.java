import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        //Question 1:
        //Create a LinkedList of strings, add "A", "B", "C", "D" to it, and print the list.
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        //Question 2:
        //Remove the first and last elements from the list and print the list.
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
