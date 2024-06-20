package Lec13;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas= {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		System.out.println(Index(gas, cost));
		

	}
	public static int Index(int[] gas,int[] cost) {
		int t_sum=0;
		int c_sum=0;
		int si=0;
		for(int i=0;i<gas.length;i++) {
			t_sum+=(gas[i]-cost[i]);
			c_sum+=(gas[i]-cost[i]);
			if (c_sum<0) {
				si=i+1;
				c_sum=0;
			}
		}
		if(t_sum<0) {
			return -1;
		}
		return si;
	}

}
