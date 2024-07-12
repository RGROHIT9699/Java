// import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_Operations_to_Halve_Array_Sum {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = qw.nextInt();
        }
        System.out.println(halveArray(arr));
        qw.close();
        
    }
    public static int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pq.add((double)nums[i]);
        }
        int cou=0;
        double half = sum / 2;
        while(sum>half){
            double temp = pq.poll();
            sum -= temp/2;
            pq.add(temp/2);
            cou++;
        }
        return cou;
    }
}
