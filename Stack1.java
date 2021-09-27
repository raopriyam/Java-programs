import java.util.Stack;



public class Stack1 {
    public static void main(String args[]){
        Stack<Integer> st1 = new Stack<Integer>();

        System.out.println("the size of statck is "+st1.size());

        st1.push(1);
        st1.push(2);
        st1.push(3);

        System.out.println("the size of statck is "+st1.size());

        System.out.println("the top element in statck is "+st1.peek());

        st1.pop();
        System.out.println("the top element in statck is "+st1.peek());
        System.out.println("the size of statck is "+st1.size());
        st1.pop();
        System.out.println("the top element in statck is "+st1.peek());


        System.out.println("the size of statck is "+st1.size());

    }

}
