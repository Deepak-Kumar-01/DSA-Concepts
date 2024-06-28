import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("C");
        linkedHashSet.add("A");//Duplicate element

        System.out.println("LinkedHashSet: "+linkedHashSet);
        //Ordered preserved
        //LinkedHashSet: [A, B, D, C]
    }
}
