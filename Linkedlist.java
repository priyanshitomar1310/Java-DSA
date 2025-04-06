import java.util.*;
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
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(Head==null)
        {
            Head=Tail=newNode;
            return ;
        }
        newNode.next=Head;
        Head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(Head==null)
        {
            Head=Tail=newNode;
            return ;
        }
        
        Tail.next=newNode;
        Tail=newNode;
    }
    public void addBetween(int index,int data)
    {
        
        if(index==0)
        {
            addFirst(data);
            return ;
        }
        int i=0;
        Node newNode=new Node(data);
        size++;
        Node temp=Head;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void removeFirst()
    {
        if(Head==null)
        {
            System.out.println("List is already empty");
            return ;
        }
        if(size==1)
        {
            System.out.println("Deleting data is "+Head.data);
            Head=Tail=null;
            size=0;
            return ;
        }
        size--;
        System.out.println("Deleting data is "+Head.data);
        Head=Head.next;
    }
    public void removeLast()
    {
        if(Head==null)
        {
            System.out.println("List is already empty");
            return ;
        }
        if(size==1)
        {
            System.out.println("Deleting data is "+Head.data);
            Head=Tail=null;
            size=0;
            return ;
        }
        Node temp=Head;
       for(int i=0;i<size-2;i++)
       {
        temp=temp.next;
       }
       temp.next=null;
       System.out.println("Deleting data is "+Tail.data);
       Tail=temp;
        size--;
    }
    public void printList(Node Head)
    {
        if(Head==null)
        {
            System.out.println("List doesn't exist");
            return ;
        }
        Node temp=Head;
        while(temp !=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
       LinkedList ll=new LinkedList();
       ll.addFirst(5);
       ll.addFirst(10);
       ll.addFirst(15);
       ll.addFirst(20);
       ll.addLast(35);
       ll.addLast(40);
       ll.addLast(45);
       ll.addBetween(2, 9);
       ll.removeFirst();
       ll.removeLast();
       ll.printList(Head);
       System.out.println(ll.size);
    }
}