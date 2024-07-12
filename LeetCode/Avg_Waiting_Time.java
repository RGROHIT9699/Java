import java.util.Scanner;

public class Avg_Waiting_Time {
    public static double averageWaitingTime(int[][] cus) {
        int n = cus.length;
        long time = cus[0][0] + cus[0][1];
        long avg = cus[0][1];
        for(int i=1;i<n;i++){
            int ctime = cus[i][0];
            int rtime = cus[i][1];
            if(ctime>time){
                time = (long)ctime;
            }
            time += (long)rtime;
        // System.out.println(time);
            avg += (long)(time-ctime);
        // System.out.println(avg);
        }
        double ans = (double)avg/n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[][] cus = new int[n][2];
        for(int i=0;i<n;i++){
            cus[i][0] = qw.nextInt();
            cus[i][1] = qw.nextInt();
        }
        System.out.println(averageWaitingTime(cus));
        qw.close();
    }
}
