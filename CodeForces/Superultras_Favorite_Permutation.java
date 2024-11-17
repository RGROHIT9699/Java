import java.util.*;
public class Superultras_Favorite_Permutation {
	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);
		int t = qw.nextInt();
		while(t-->0) {
		    int n = qw.nextInt();
		    if(n<=4) {
		        System.out.println(-1);
		    } else {
		        for(int i=1;i<=n;i+=2) {
		            if(i!=5) {
		                System.out.print(i+" ");
		            }
		        }
		        System.out.print(5+" "+4+" ");
		        for(int i=2;i<=n;i+=2) {
		            if(i!=4) {
		                System.out.print(i+" ");
		            }
		        }
		    }
		}
		qw.close();
	}
}
