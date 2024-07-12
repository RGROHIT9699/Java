package Lec30;

public class N_Queen_51_52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 4;
		boolean[][] board = new boolean[n][n];
		print(board,n,0);

	}
	public static void print(boolean[][] board,int tq,int row) {
		if(tq==0) {
			display(board);
			System.out.println();
			return;
		}
		for(int col=0;col<board[0].length;col++) {
			if(isItSafe(board,row,col)) {
				board[row][col]=true;
				print(board,tq-1,row+1);
				board[row][col]=false;
			}
		}
	}
	public static boolean isItSafe(boolean[][] board,int row,int col) {
		int r= row;
		int c = col;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		r=row;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;			
		}
		r=row;
		c=col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void display(boolean[][] ans) {
		for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j] + " ");
            }
            System.out.println();
		}
    }


}
