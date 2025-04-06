import java.util.*;
import java.util.Scanner;

class LinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void printList(Node head)
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List doesn't exist");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public int searchKey(Node head,int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            ll.addLast(input.nextInt());
        }
        int key=input.nextInt();
        ll.printList(head);
        System.out.println(ll.searchKey(head, key));
        input.close();
    }
}