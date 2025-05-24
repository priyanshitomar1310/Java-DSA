import java.util.*;
public class Greedy {
    public static int numberCount(int[] a,int[] b)
    {
        int count=1;
        int curr=b[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>=curr)
            {
                count++;
                curr=b[i];
            }
        }
        return count;
    }    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++)
        {
            start[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            end[i]=sc.nextInt();
        }
        System.out.println(numberCount(start, end));
    }
}