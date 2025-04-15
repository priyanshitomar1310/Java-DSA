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
    static class stack{
         static Node head=null;
         public static boolean isEmpty()
         {
            if(head==null)
            {
                return true;
            }
            return false;
         }
         public static void pushTop(int data)
         {
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;

         }
         public static void pushBottom(int data)
         {
            Node temp=head;
            Node newNode=new Node(data);
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
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
        stack s=new stack();
        s.pushTop(1);
        s.pushTop(2);
        s.pushTop(3);
        s.pushTop(4);
        s.pushBottom(0);
        while (!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}