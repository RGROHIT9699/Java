package Lec29;

import java.util.*;
public class Rat_Chase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qw = new Scanner(System.in);
		int n = qw.nextInt();
		int m = qw.nextInt();
		char[][] maze = new char[n][m];
		for(int i=0;i<n;i++){
			String s = qw.next();
		    for(int j=0;j<s.length();j++){
		    	maze[i][j]=s.charAt(j);		        
		    }
		}
		int[][] ans= new int[n][m];
		print(maze,0,0,ans);
		if(val==0) {
			System.out.println("NO PATH FOUND");
		}
		qw.close();
	}
	static int val=0;
	public static void print(char[][] maze,int cr,int cc,int[][] ans) {
		if(cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc]=='O') {
			ans[cr][cc]=1;
			val=1;
			display(ans);
			return;	
			
		}
		if(cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		print(maze,cr-1,cc,ans);
		print(maze,cr,cc-1,ans);
		print(maze,cr+1,cc,ans);
		print(maze,cr,cc+1,ans);
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j] + " ");
            }
            System.out.println();
		}
    }
}
