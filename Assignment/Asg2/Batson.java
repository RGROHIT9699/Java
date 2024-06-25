import java.util.*;
import java.lang.Math;

public class Batson {
	public static void main(String[] args)
	{
	    Scanner qw = new Scanner(System.in);
		int n = qw.nextInt(),su=0,q1=n;
        while (n % 2 == 0) {
			su = su+2;
			n /= 2;
		}
	   for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
                if (i>=10){
                    int t = i;
                    while(t>0){
                        int re = t%10;
                        su = su+re;
                        t/=10;
                    }
                }
                else{
                    su = su +i;
                }
				n /= i;
			}
		}
		if (n > 2){
            if (n>=10){
                while(n>0){
                    int re = n%10;
                    su = su+ re;
                    n/=10;
                }
            }
            else{
                su = su + n;
            }
        }
        int summ= 0;
        while(q1>0){
            int re = q1%10;
            summ = summ+ re;
            q1/=10;    
        }
        if (su == summ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
		qw.close();
	}
}
