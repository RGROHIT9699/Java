package Lec38;
public class Maximal_Rectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
		int[] arr = new int[mat[0].length];
		int ans = 0;
		for(int i=mat.length-1;i>=0;i--) {
			if(i==mat.length-1) {
				arr=mat[i];
			}
			else {
				for(int j=0;j<mat[0].length;j++) {
					arr[j]= mat[i][j] == 1 ? arr[j]+1 : 0;
				}
			}
			ans = Math.max(ans,area(arr));
		}
		System.out.println(ans);
	}

	public static int area(int[] area) {
		int aa = Histogram.areaRectangle(area);
		return aa;
	}

}