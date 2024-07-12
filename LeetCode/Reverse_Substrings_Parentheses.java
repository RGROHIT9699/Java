import java.util.Scanner;
import java.util.Stack;

public class Reverse_Substrings_Parentheses {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String s = qw.next();
        System.out.println(reverseParentheses(s));
        qw.close();
        
    }
    public static String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(sb);
                sb = new StringBuilder();
            }
            else if(ch == ')'){
                sb.reverse();
                sb = st.pop().append(sb);
                System.out.println(sb.toString());
            }
            else{
                sb.append(ch+"");
            }
        }
        return sb.toString();
    }
}