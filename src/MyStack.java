import java.util.Stack;
public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        stack.remove(2);//This is also working beacause of List Interface
        System.out.println(stack);

    }
}
