package Lec29;
import java.util.*;

public class PartitioningPalindrome_LT131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques= "123";
		List<List<String>> ll= new ArrayList<>();
		partitioning(ques,ll,new ArrayList<>());
		System.out.println(ll);
	}
	public static void partitioning(String ques,List<List<String>> ll,List<String> lis) {
		if(ques.length()==0) {
			if(lis.size()>0) {
				ll.add(new ArrayList<>(lis));	
				
			}
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(palindrome(s)) {
				lis.add(s);
				partitioning(ques.substring(i),ll,lis);
				lis.remove(lis.size()-1);					
			}
		}
	}
	public static boolean palindrome(String ans) {
		int i=0;
		int j=ans.length()-1;
		while(i<=j) {
			if(ans.charAt(i++)!=ans.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}
