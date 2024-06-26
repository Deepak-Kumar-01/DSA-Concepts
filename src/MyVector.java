import java.util.Vector;
public class MyVector {
    public static void main(String[] args) {
        //Question 1:
        //Create a Vector of strings, add "Apple", "Banana", "Orange", "Grapes" to it, and print the vector.
       Vector<String> vector=new Vector<>();
       vector.add("Apple");
       vector.add("Banana");
       vector.add("Orange");
       vector.add("Grapes");
       System.out.println(vector);

       //Question 2:
        //Remove the element at index 2 from the vector and print the updated vector.
        vector.remove(2);
        System.out.println(vector);
    }
}
