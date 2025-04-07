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
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node midNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean  isPalindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        Node mid=midNode(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            right=right.next;
            left=left.next;
        }
       return true; 

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            ll.addLast(input.nextInt());
        }
        ll.printList(head);
        System.out.println(ll.isPalindrome());
        input.close();
    }
}