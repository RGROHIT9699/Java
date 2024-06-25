package Asg3;

public class Wave_Print {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[][] = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 71 }, { 110, 11, 13, 16, 19 },
                { 111, 112, 113, 114, 115 } };
        WavePrint(arr);
        wavePrint(arr);

    }

    public static void WavePrint(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                int i = 0;
                for (; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            } else {
                int i = arr.length - 1;
                for (; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
        // display(arr);
    }

    public static void wavePrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                int j = 0;
                for (; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            } else {
                int j = arr[0].length - 1;
                for (; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
        // display(arr);
    }
}
// public static void display(int[][] arr) {
// for(int i=0;i<arr.length;i++) {
// for(int j=0;j<arr[0].length;j++) {
// System.out.print(arr[i][j]+" ");
// }
// System.out.println();
// }
// }
