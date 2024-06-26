package classUseCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayUseCase {
    //populate funtion for arrayList
    private static void populateList(ArrayList<Integer> list,int size){
        for(int i=0;i<size;i++){
            list.add(i);
        }
    }
    //populate function for LinkedList
    private static void populateList(LinkedList<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }
    //Method to traverse ArrayList
    private static void traverseList(ArrayList<Integer> list){
        for(Integer val:list){
            //Traverse operation(just iterating
        }
    }
    //Method to traverse LinkedList
    private static void traverseList(LinkedList<Integer> list) {
        for (Integer value : list) {
            // Traverse operation (just iterating)
        }
    }

    //Method to access random element from ArrayList
    private static void accessElement(ArrayList<Integer> list,int index){
        list.get(index);
    }
    //Method to access random element from ArrayList
    private static void accessElement(LinkedList<Integer> list,int index){
        list.get(index);
    }
    // Method for insertion at end
    private static void insertEnd(ArrayList<Integer> list, int value) {
        list.add(value);
    }
    private static void insertEnd(LinkedList<Integer> list, int value) {
        list.add(value);
    }
    public static void main(String[] args) {
        final int SIZE=1000000;//Size of List
        //Populate ArrayList
        ArrayList<Integer> arrayList=new ArrayList<>();
        populateList(arrayList,SIZE);

        //Populate LinkedList
        LinkedList<Integer> linkedList=new LinkedList<>();
        populateList(linkedList,SIZE);

        //Measure time for traversal of ArrayList
        long startTimeForArray=System.currentTimeMillis();
        traverseList(arrayList);
        long endTimeForArray=System.currentTimeMillis();
        System.out.println("Time Take by ArrayList for traversal: "+(endTimeForArray-startTimeForArray)+" ms");

        //Measure time for traversal of LinkedList
        long startTimeForLinkedList=System.currentTimeMillis();
        traverseList(linkedList);
        long endTimeForLinkedList=System.currentTimeMillis();
        System.out.println("Time Take by LinkedList for traversal: "+(endTimeForLinkedList-startTimeForLinkedList)+" ms");
        //Conclusion for Traversal:
        //Time Take by ArrayList for traversal: 7 ms
        //Time Take by LinkedList for traversal: 14 ms
        //Note:For traversal operation ArrayList is more efficient that LinkedList

        //RANDOM ACCESS
        Random random=new Random();
        int randomIndex=random.nextInt(SIZE);

        //Measure random access from ArrayList
        long randomAccessStartTimeForArray=System.currentTimeMillis();
        accessElement(arrayList,randomIndex);
        long randomAccessEndTimeForArray=System.currentTimeMillis();
        System.out.println("Time taken to access random elemnet from ArrayList: "+(randomAccessEndTimeForArray-randomAccessStartTimeForArray)+" ms");

        //Measure random access from LinkedList
        long randomAccessStartTimeForLinked=System.currentTimeMillis();
        accessElement(linkedList,randomIndex);
        long randomAccessEndTimeForLinked=System.currentTimeMillis();
        System.out.println("Time taken to access random elemnet from LinkedList: "+(randomAccessEndTimeForLinked-randomAccessStartTimeForLinked)+" ms");
        //Conclusion:
        //Time taken to access random elemnet from ArrayList: 0 ms
        //Time taken to access random elemnet from LinkedList: 1 ms
        //Note:Random access operation in ArrayList is faster than LinkedList

        //Insertion at End
        int randomVal=random.nextInt(SIZE+1);
        //Measure random access from ArrayList
        long insertionStartTimeForArray=System.currentTimeMillis();
        insertEnd(arrayList,randomVal);
        long insertionEndTimeForArray=System.currentTimeMillis();
        System.out.println("Time taken to insert random elemnet into ArrayList: "+(insertionEndTimeForArray-insertionStartTimeForArray)+" ms");

        //Measure random access from LinkedList
        long insertionStartTimeForLinked=System.currentTimeMillis();
        accessElement(linkedList,randomVal);
        long insertionEndTimeForLinked=System.currentTimeMillis();
        System.out.println("Time taken to insert random elemnet into LinkedList: "+(insertionEndTimeForLinked-insertionStartTimeForLinked)+" ms");
        //Conclusion:
        //Time taken to insert random elemnet into ArrayList: 0 ms
        //Time taken to insert random elemnet into LinkedList: 2 ms
        //Note:Both operations are generally efficient
        // (O(1) for ArrayList and LinkedList due to their respective structures),
        // but ArrayList tends to be slightly faster for this operation.
    }
}
