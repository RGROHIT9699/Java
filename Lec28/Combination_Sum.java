package Lec28;
import java.util.*;
public class Combination_Sum {

//	private static final List<Integer> List = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,3};
		int amt = 3;
		List<List<Integer>> ll = new ArrayList<>();
		coinChanges(coin, 0, amt,new ArrayList<>(),ll);
		System.out.println(ll);

	}
	public static void coinChanges(int[] coin,int ind,int amt,List<Integer> lis,List<List<Integer>> ll) {
		if(amt==0) {
			ll.add(new ArrayList<>(lis));
			return;
		}
		for(int i=ind;i<coin.length;i++) {
			if(amt>=coin[i]) {
				lis.add(coin[i]);
				coinChanges(coin, i, amt-coin[i],lis,ll);
				lis.remove(lis.size()-1);
			}
		}

	}

}
