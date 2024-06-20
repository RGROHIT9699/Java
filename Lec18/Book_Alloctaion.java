package Lec18;
import java.util.*;
public class Book_Alloctaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int yy=0;yy<t;yy++){
			int n = sc.nextInt();
			int nos = sc.nextInt();
			int[] page = new int[n];
			for(int i=0;i<n;i++) {
				page[i]=sc.nextInt();
			}
			System.out.println(minPages(page,nos));
		}
		sc.close();
	}
	public static int minPages(int[] page,int nos) {
		int lo=0;
		int hi=0;
		for(int i=0;i<page.length;i++) {
			hi +=page[i];
		}
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isPossible(page,nos,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static boolean isPossible(int[] page,int nos,int mid) {
	    int stud=1;
		int rdp=0;
		int i=0;
		while(i<page.length) {
			if(rdp+page[i]<=mid) {
				rdp+=page[i];
				i++;
			}
			else {
				rdp=0;
				stud++;
			}
			if(stud>nos) {
				return false;
			}
		}
		return true;
    }

}
