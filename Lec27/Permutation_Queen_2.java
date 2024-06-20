package Lec27;

public class Permutation_Queen_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		boolean[] board = new boolean[n];
		int tq = 2;
		permutation(board,tq,0,"",0);
	
	}
	
	public static void permutation(boolean[] board,int tq,int qpsf,String ans,int last) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i = last; i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				permutation(board,tq,qpsf+1,ans + "b"+i+" Q"+qpsf+" ",i+1);	
				board[i]=false;					
			}
		}
	}
}
