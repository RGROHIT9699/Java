package Lec04;
import java.util.*;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divis = sc.nextInt();
		int divid = sc.nextInt();
		while(divid%divis!=0) {
			int rem = divid%divis;
			divid= divis;
			divis =rem;
		}
		System.out.println(divis);
		sc.close();

	}

}
