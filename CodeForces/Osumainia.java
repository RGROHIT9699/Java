import java.util.Scanner;
import java.util.Stack;

public class Osumainia {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int tt = qw.nextInt();
        while(tt--> 0) {
            int n = qw.nextInt();
            // char[][] arr = new char[n][4];
            // int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i<n; i++) {
                String str = qw.next();
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j) == '#'){
                        // ans[i] = 4-j;
                        st.add(j+1);
                    }
                }
            }
            while(!st.isEmpty()){
                System.out.print(st.pop()+" ");
            }
            System.out.println();
        }
        qw.close();
    }
}
