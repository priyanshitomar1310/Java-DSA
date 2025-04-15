import java.util.*;

class Practice{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<Character> s=new Stack<>();
        String st=input.nextLine();
        for(int i=0;i<st.length();i++)
        {
            s.push(st.charAt(i));
        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }
    }
}