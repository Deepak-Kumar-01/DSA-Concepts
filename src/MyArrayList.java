import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        //Question 1:
        //Create an ArrayList of integers, add the numbers 1 to 10 to it, and print the list.
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);

        //Question 2:
        //Remove the 5th element from the list and print the list.
        list.remove(4);//5th element means 4th index
        System.out.println("Updated List: "+list);

    }
}
