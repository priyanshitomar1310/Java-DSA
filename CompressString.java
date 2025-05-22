import java.util.*;
public class CompressString {
    public static String compressString(String s)
    {
        StringBuilder str=new StringBuilder("");
        int curr=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)==s.charAt(curr))
           {
              count++;
           }
           else if(s.charAt(i)!=s.charAt(curr))
           {
              if(count==1)
              {
                 str.append(s.charAt(curr));
                 count=1;
              }
              else
              {
                str.append(s.charAt(curr));
                str.append(String.valueOf(count));
              }
              count=1;
              curr=i;
           }
        }
        if(count==1)
        {
           str.append(s.charAt(curr));
        }
        else{
            str.append(s.charAt(curr));
           str.append(String.valueOf(count));
        }
        
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(compressString(s));
    }
}