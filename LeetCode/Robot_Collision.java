import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Robot_Collision {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = qw.nextInt();
        }
        int[] he = new int[n];
        for (int i = 0; i < n; i++) {
            he[i] = qw.nextInt();
        }
        String dir = qw.next();
        System.out.println(survivedRobotsHealths(pos, he, dir));
        qw.close();

    }
    public static List<Integer> survivedRobotsHealths(int[] pos, int[] he, String dir) {
        int n = pos.length;
        Integer act[] = new Integer[n];
        for(int i=0;i<n;i++){
            act[i]=i;
        }
        Arrays.sort(act,(a,b) -> Integer.compare(pos[a],pos[b]));
        Stack<Integer> st = new Stack<>();
        List<Integer> ll = new ArrayList<>();
        for(int i:act){
            if(dir.charAt(i)=='L'){
                while(!st.isEmpty() && he[i]>0){
                    int j = st.pop();
                    if(he[i]>he[j]){
                        he[i] -= 1;
                        he[j] = 0;
                    }
                    else if(he[j]>he[i]){
                        he[j] -= 1;
                        he[i] = 0;
                        st.push(j);
                    }
                    else{
                        he[i]=0;
                        he[j]=0;
                    }
                }
            }
            else{
                st.push(i);
            }
        }
        for(int i=0;i<n;i++){
            if(he[i]>0){
                ll.add(he[i]);
            }
        }
        return ll;       
    }
}
