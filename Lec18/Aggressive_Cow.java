package Lec18;

import java.util.*;

public class Aggressive_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		for(int jj=0;jj<t;jj++) {
			int n =sc.nextInt();
			int c = sc.nextInt();
			int[] stall = new int[n];
			for(int i=0;i<n;i++) {
				stall[i]= sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(largestMinDist(stall,c));
		}
		sc.close();
	}
	public static int largestMinDist(int[] stall,int c) {
		int lo=0;
		int hi= stall[stall.length-1]-stall[0];
		int ans=0;
		while(hi>=lo) {
			int mid = (hi+lo)/2;
			if(isItPossible(stall,c,mid)) {
				ans=mid;
				lo= mid+1;				
			}
			else {
				hi=mid-1;
			}
			
		}
		return ans;
	}
	public static boolean isItPossible(int[] stall,int c,int mid) {
		int cow=1;
		int pos = stall[0];
		for(int i =1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				cow++;
				pos=stall[i];
			}
			if(cow==c) {
				return true;
			}
		}		
		return false;
	}

}
