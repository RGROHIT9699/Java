package Lec17;
import java.util.*;

public class Check_CB_Num {

	public static void main(String args[]) {
        Scanner qw = new Scanner (System.in);
//        int n = qw.nextInt();
        String str = qw.next();
        System.out.println(countCbnumber(str));
        qw.close();
//        n+=1;
    }
    public static boolean isCbNum(long num) {
		if(num==0|| num==1) {
			return false;
		}
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int countCbnumber(String str) {
		int c=0;
		boolean[] visited = new boolean[str.length()];
		for(int len=1;len<=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i= j-len;
				String s = str.substring(i,j);
				if(isCbNum(Long.parseLong(s)) && isVisited(visited, i, j-1)) {
					c++;
					for(int k=i;k<=j-1;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return c;
	}
	public static boolean isVisited(boolean[] visited,int si,int ei) {
		for(int i=si;i<=ei;i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
	}
}
