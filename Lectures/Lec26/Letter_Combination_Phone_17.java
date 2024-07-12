package Lec26;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combination_Phone_17 {
	static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "79";
		List<String> str = new ArrayList<>();
		System.out.println(keyPad(ques,"",str));
	}
	public static int keyPad(String ques,String ans,List<String> str) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			str.add(ans);
//			cou+=1;
			return 1;
		}
		char ch= ques.charAt(0);
		String press = map[ch-'0'];
		int a=0;
		for(int i = 0 ;i<press.length();i++) {
			a+=keyPad(ques.substring(1), ans+ press.charAt(i),str);
		}
		return a;
	}

}
