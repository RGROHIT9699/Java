package Lec28;

public class Coins_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,3,5};
		int amt = 6;
		coinChanges(coin, amt, "");

	}
	public static void coinChanges(int[] coin,int amt,String ans) {
		if(amt==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<coin.length;i++) {
			if(amt>=coin[i]) {
				coinChanges(coin,amt-coin[i], ans+coin[i]);
			}
		}
	}

}
