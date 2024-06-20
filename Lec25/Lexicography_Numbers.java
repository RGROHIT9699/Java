package Lec25;

//import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Lexicography_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		List<Integer> ll = new ArrayList<>();
		countingNum(0, n,ll);
		System.out.println(ll);

	}
	public static void countingNum(int curr,int n,List<Integer> ll) {
		if(curr>n) {
			return;
		}
//		if(curr>=0) {
			ll.add(curr);
//		}
		int i=0;
		if(curr==0) {
			i=1;
		}
		for (; i<=9;i++) {
			countingNum(curr*10+i, n,ll);
		}
	}

}
