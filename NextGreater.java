import java.util.*;
public class NextGreater {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        Stack<Integer> s=new Stack<>();
        int[] ng=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && a[s.peek()]<=a[i])
            {
                s.pop();    
            }
            if(s.isEmpty())
            {
                ng[i]=-1;
            }
            else{
                ng[i]=a[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ng[i]+" ");
        }
    }
}