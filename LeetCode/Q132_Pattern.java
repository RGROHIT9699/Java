import java.util.Scanner;
import java.util.Stack;

public class Q132_Pattern {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = qw.nextInt();
        }
        System.out.println(find132pattern(nums));
        qw.close();        
    }
    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if(n<3){
            return false;
        }
        Stack<Integer> st = new Stack<>();
        int min[]= new int[n];
        min[0] = nums[0];
        for(int i=1;i<n;i++){
            min[i]= Math.min(min[i-1],nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            if(min[i]<nums[i]){
                while(!st.isEmpty() && st.peek()<=min[i]){
                    st.pop();
                }
                if(!st.isEmpty()&& st.peek()<nums[i]){
                    return true;
                }
                else{
                    st.push(nums[i]);
                }
            }
        }
        return false;
        
    }
}
