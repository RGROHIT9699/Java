import java.util.Scanner;

public class Minimise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qw = new Scanner(System.in);
		int tt = qw.nextInt();
		while(tt-->0) {
			int aa = qw.nextInt();
			int bb = qw.nextInt();
			int cc = (aa+bb)/2;
			int dd = (cc - aa) + (bb - cc);
			System.out.println(dd);
		}
        qw.close();

	}

}
