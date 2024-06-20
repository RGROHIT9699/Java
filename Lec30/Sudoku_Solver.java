package Lec30;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		char[][] grid = { { '3', '.', '6', '5', '.', '8', '4', '.', '.' }, { '5', '2', '.', '.', '.', '.', '.', '.', '.' }, { '.', '8', '7', '.', '.', '.', '.', '3', '1' },
                { '.', '.', '3', '.', '1', '.', '.', '8', '.' }, { '9', '.', '.', '8', '6', '3', '.', '.', '5' }, { '.', '5', '.', '.', '9', '.', '6', '.', '.' },
                { '1', '3', '.', '.', '.', '.', '2', '5', '.' }, { '.', '.', '.', '.', '.', '.', '.', '7', '4' }, { '.', '.', '5', '2', '.', '6', '3', '.', '.' } };
		sudoku(grid, 0, 0);
		display(grid);
	}
	public static void sudoku(char[][] grid,int row,int col) {
		if(col == 9) {
			row++;
			col = 0;
		}
		if(row == 9) {
			return;
		}
		if(grid[row][col] != '.') {
		    sudoku(grid, row, col + 1);
		} 
		else{
			for(int val = 1; val <= 9; val++) {
				if(isitsafe(grid, row, col, val)) {
                    grid[row][col] = (char)(val+'0');
                    sudoku(grid, row, col + 1);
                    grid[row][col] = '.';
				}
			}
		}                                

	}
	public static boolean isitsafe(char[][] grid, int row, int col, int val) {
        // TODO Auto-generated method stub
        // row
        for(int c = 0; c < 9; c++) {
        	if((grid[row][c]-'0') == val) {
        		return false;
            }
        }
        // col
        for(int r = 0; r < 9; r++) {
        	if((grid[r][col]-'0') == val) {
               return false;
            }
        }
        // 3*3 Matrix
        int r = row - row % 3;
        int c = col - col % 3;
        for(int i = r; i < r + 3; i++) {
            for(int j = c; j < c + 3; j++) {
            	if((grid[i][j]-'0') == val) {           
            		return false;
                }
            }
        }
        return true;
	}
	public static void display(char[][] grid) {
        // TODO Auto-generated method stub
        for(int i = 0; i < grid.length; i++) {
           for(int j = 0; j < grid.length; j++) {
               System.out.print(grid[i][j]+" ");
           }
           System.out.println();
        }

	}
}
