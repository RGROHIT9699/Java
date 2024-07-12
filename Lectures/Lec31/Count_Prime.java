package Lec31;

public class Count_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		System.out.println(primeSeive(n));
	}
	public static int primeSeive(int n) {
		boolean[] prime = new boolean[n];
		prime[0]= true;
		prime[1]= true;
		int nn=prime.length;
		int cou=0;
		for(int i=2;i<=Math.sqrt(nn);i++) {
			if(prime[i]==false) {
				for(int j=2;i*j<nn;j++) {
					if(!prime[i*j]) {
						prime[i*j]=true;
						cou++;						
					}
				}
			}
		}
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
//			System.out.println();
		}
		int k = n-cou-2;
		return k;
	}

}
