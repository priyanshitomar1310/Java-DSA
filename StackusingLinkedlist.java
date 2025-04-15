import java.util.*;
class Stack1{
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
      }
    static class  Stack{
     static Node head=null;
     public static boolean isEmpty()
     {
        if(head==null)
        {
            return true;
        }
        return false;
     }
      public static void push(int data)
      {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
      }
      public static int pop()
      {
        if (isEmpty()) {
            System.out.println("List is empty");
            return 0;
        }
          int top=head.data;
          head=head.next;
          return top;
      }
      public static int peek()
      {
        if (isEmpty()) {
            System.out.println("List is empty");
            return 0;
        }
        return head.data;
      }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(s.isEmpty()!=true)
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}