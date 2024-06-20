package Lec26;
//import java.util.*;

public class Permutation_Of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String que = "cab";
		print("",que);

	}
	public static void print(String ans,String qu) {
		if(qu.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i= 0;i<qu.length();i++) {
			String s1 = qu.substring(0,i);
			String s2 = qu.substring(i+1);
			print(ans+qu.charAt(i),s1+s2);
		}
	}

}
