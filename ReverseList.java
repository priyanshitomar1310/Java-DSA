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
    public void reverseList()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            ll.addLast(input.nextInt());
        }
        ll.printList(head);
        System.out.println("Linked list after the reversing");
        ll.reverseList();
        ll.printList(head);
        input.close();
    }
}