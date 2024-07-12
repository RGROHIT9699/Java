package Lec24;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis_Making {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> ll = new ArrayList<>();
		parenthesis(n,0,0,"",ll);
		System.out.println(ll);

	}
	public static void parenthesis(int n,int l,int r,String ans,List<String> ll) {
		if(l==n && r==n) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(l>n || r>l) {
			return;
		}
		parenthesis(n,l+1,r,ans+"(",ll);
		parenthesis(n,l,r+1,ans+")",ll);
	}

}
