import java.util.*;
class MyLinkedList{
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
    public Node midNode(Node Head)
    {
        Node slow=Head;
        Node fast=Head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public  Node mergeSort(Node left,Node right)
    {
        Node merge=new Node(-1);
        Node temp=merge;
        while(left!=null && right!=null)
        {
            if(left.data<=right.data)
            {
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left!=null)
        {
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null)
        {
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return merge.next;
    }
    public Node mergeList(Node Head)
    {
        if(Head==null || Head.next==null)
        {
            return Head;
        }
        Node left=midNode(Head);
        Node right=left.next;
        left.next=null;
        Node Newleft=mergeList(Head);
        Node Newright=mergeList(right);
        return mergeSort(Newleft,Newright);
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MyLinkedList ll=new MyLinkedList();
        int data;
        int n;
        do {
            System.out.println("Enter your choice");
            System.out.println("1 to add first");
            System.out.println("2 to add last");
            System.out.println("3 to remove first");
            System.out.println("4 to remove last");
            System.out.println("5 to add in between");
            System.out.println("6 to sort");
            System.out.println("7 to display list");
            n=input.nextInt();
            switch (n) {
                case 1:
                    ll.addFirst(data=input.nextInt());
                    break;
                case 2:
                   ll.addLast(data=input.nextInt());
                   break;
                case 3 :
                  ll.removeFirst();
                break;
                case 4:
                ll.removeLast();
                break; 
                case 5:
                ll.addBetween(3, data=input.nextInt());
                break; 
                case 6:
                Head=ll.mergeList(Head);
                case 7:
                ll.printList(Head); 
                break;
                default:
                System.out.println("Invalid choice");
                return ;
            }
        } while (true);
    }
}