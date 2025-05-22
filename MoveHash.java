import java.util.*;
public class MoveHash {
    public static String moveFirst(String str)
    {
        StringBuilder str1=new StringBuilder("");
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='#')
            {
                stack.push(str.charAt(i));
            }
            else
            {
                str1.append(str.charAt(i));
            }
        }
        StringBuilder res=new StringBuilder("");
        while(!stack.isEmpty())
        {
            res.append(stack.pop());
        }
        String s=res.toString();
        s+=str1.toString();
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("After change string is "+moveFirst(s));
    }
}