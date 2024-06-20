package Lec10;

public class Maximum_SubArray_Lt53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
//		int[] arr= {1};
		int[] arr={5,4,-1,7,8};
		System.out.println(SumOfSubArray(arr));	

	}
	public static int SumOfSubArray(int[] arr) {
		int n=arr.length;
		int sum=0;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			ans= Math.max(ans, sum);
			if (sum<0) {
				sum=0;
			}
		}		
		return ans;
	}

}
