package Lec26;

public class Permutation2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String que = "abca";
		print(que,"");
		System.out.println(count);

	}
	static int count=0;
	public static void print(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			count++;
			return;
		}
		boolean[] visited = new boolean[26];
		for(int i= 0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			if(visited[ch-'a']==false) {
				visited[ch-'a']=true;
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				print(s1+s2,ans+ques.charAt(i));
			}
		}

	}

}
