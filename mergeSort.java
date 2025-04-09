import java.util.*;
public class mergeSort {
    public static void mergeSorting(int[]arr,int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid=s+(e-s)/2;
        mergeSorting(arr, s, mid);
        mergeSorting(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    public static void merge(int[] b,int s,int m,int e)
    {
        int[] temp=new int[e-s+1];
        if(s>=e)
        {
            return ;
        }
        int i=s,j=m+1;
        int k=0;
        while(i<=m && j<=e)
        {
            if(b[i]<b[j])
            {
                temp[k]=b[i];
                i++;
                k++;
            }
            else if(b[j]<b[i])
            {
                temp[k]=b[j];
                j++;
                k++;
            }
            
        }
       while (i<=m) {
        temp[k]=b[i];
        k++;
        i++;
        
       }
       while (j<=e) {
        temp[k]=b[j];
        k++;
        j++; 
       }
       for(k=0,i=s;k<temp.length;k++,i++)
       {
          b[i]=temp[k];
       }
        
    }
    public static void printArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        mergeSorting(arr, 0, n-1);
        printArray(arr);
    }
}