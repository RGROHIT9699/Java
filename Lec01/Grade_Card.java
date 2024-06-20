package Lec01;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=39;
		if (m>=75) {
			System.out.println("A Grade");
		}
		else if (m>=65 && m<75) {
			System.out.println("B Grade");
		}
		else if (m>=55 && m<65) {
			System.out.println("C Grade");
		}
		else if (m>=45 && m<55) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
