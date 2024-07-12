package Lec28;
import java.util.*;
public class Two_D_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.get(1).add(-56);
		ll.get(1).add(6);
		System.out.println(ll);
		System.out.println(ll.get(1));
		
	}

}
