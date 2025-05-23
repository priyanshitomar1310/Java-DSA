import java.util.*;
public class ReverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> q)
    {
        Stack<Integer> stack=new Stack<>();
        while(!q.isEmpty())
        {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        return q;
    }
    public static void display(Queue<Integer> q)
    {
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        display(reverseQueue(q));
    }
}