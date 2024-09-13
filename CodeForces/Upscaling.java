import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-->0) {
            int n = qw.nextInt();
            for (int i=0;i<n;i++) {
                int q = 2;
                while (q-->0) {
                    for (int j=0;j<n;j++) {
                        if ((i+j)%2==0){
                            System.out.print("##");
                        } else {
                            System.out.print("..");
                        }
                    }
                    System.out.println();
                }
            }
        }
        qw.close();
    }
}
