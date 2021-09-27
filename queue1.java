import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String args[]){
        Queue<Integer> qu1 = new LinkedList<Integer>();

        qu1.add(1);
        qu1.add(2);
        qu1.add(3);
        qu1.add(4);

        System.out.println("the front element is "+qu1.peek());
        System.out.println("the size of queue is "+qu1.size());

        qu1.remove();
        System.out.println("the front element is "+qu1.peek());
        System.out.println("the size of queue is "+qu1.size());

        qu1.remove();
        System.out.println("the front element is "+qu1.peek());
        System.out.println("the size of queue is "+qu1.size());
    }
}
