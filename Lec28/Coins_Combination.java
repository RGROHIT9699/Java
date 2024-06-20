package Lec28;

public class Coins_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,5};
		int amt = 11;
		coinChanges(coin, 0, amt, "");

	}
	public static void coinChanges(int[] coin,int ind,int amt,String ans) {
		if(amt==0) {
			System.out.println(ans);
			return;
		}
		for(int i=ind;i<coin.length;i++) {
			if(amt>=coin[i]) {
				coinChanges(coin, i, amt-coin[i], ans+ coin[i]);
			}
		}
	}

}
