import java.util.*;
public class CountEleemnt {
    public static void countElement(int[] a)
    {
       int count=0;
       int curr=0;
       Arrays.sort(a);
       for(int i=0;i<a.length;i++)
       {
           if(a[i]==a[curr])
           {
              count++;
           }
           if(a[i]!=a[curr])
           {
              System.out.println(a[curr]+"-->"+count);
              curr=i;
              count=1;
           }
       }
       System.out.println(a[count]+"-->"+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        countElement(arr);
    }
}