import java.util.*;
class LinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
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
    public void cycle(Node head)
    {
        tail.next=head.next.next;
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
    public boolean cycleExist(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            ll.addLast(input.nextInt());
        }
        // ll.cycle(head);
        System.out.println(ll.cycleExist(head));
        input.close();
    }
}