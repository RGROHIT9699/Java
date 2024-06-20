package Lec19;

import java.util.*;

public class Array_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>(26);
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(10);
		ll.add(20);
		ll.add(105);
		ll.add(-10);
		System.out.println(ll);
		ll.add(1,3);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.remove(2));
		ll.remove(2);
		System.out.println(ll);
		ll.set(0, 69);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		for(int v:ll) {
			System.out.print(v+" ");
		}
		
	}
}
//	public int[][] generateMatrix(int n) {
//        int num = 1;
//        int[][] mat = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                mat[i][j]=num;
//                num++;
//            }
//        }
//        ArrayList<Integer> lis= new ArrayList<>(); 
//        int c=0;
//        int g= n*n;
//        int rmin=0;
//        int rmax = n-1;
//        int cmin= 0;
//        int cmax = n-1;
//        while(c<g){
//            for(int i=cmin;i<=cmax && c<g;i++){
//                lis.add(mat[rmin][i]);
//                c++;
//            }
//            rmin++;
//            for(int i=rmin;i<=rmax && c<g;i++){
//                lis.add(mat[i][cmax]);
//                c++;
//            }
//            cmax--;
//            for(int i=cmax;i>=cmin && c<g;i--){
//                lis.add(mat[rmax][i]);
//                c++;
//            }
//            rmax--;
//            for(int i=rmax;i>=rmin && c<g;i++){
//                lis.add(mat[i][cmin]);
//                c++;
//            }
//            cmin++;
//        }
//        num=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                mat[i][j]= lis.get(num);
//                num++;
//            }
//        }
//        return mat;        
//    }
//
//}
