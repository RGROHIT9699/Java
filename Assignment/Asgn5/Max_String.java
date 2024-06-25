package Asgn5;

// import java.util.Arrays;
import java.util.Scanner;

public class Max_String {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int ti = qw.nextInt();
        for (int qt = 0; qt < ti; qt++) {
            int arl = qw.nextInt();
            String[] arr = new String[arl];
            for (int qi = 0; qi < arl; qi++) {
                arr[qi] = qw.next();
            }
            for (int qi = 0; qi < arl - 1; qi++) {
                for (int qj = qi + 1; qj < arl; qj++) {
                    if ((arr[qj] + arr[qi]).compareTo(arr[qi] + arr[qj]) > 0) {
                        String tem = arr[qi];
                        arr[qi] = arr[qj];
                        arr[qj] = tem;
                    }
                }
            }
            for (int qi = 0; qi < arl; qi++) {
                System.out.print(arr[qi]);
            }
            System.out.println();
        }
        qw.close();
    }

    // public static String maxString(int[] arr) {
    // // String str = "";
    // StringBuilder sb = new StringBuilder();
    // int[] num = new int[arr.length];
    // Arrays.sort(arr);
    // for (int qi = 0; qi < arr.length; qi++) {
    // num[qi] = (int) Math.log10(arr[qi]);
    // }
    // // int cou=0,tt=0;
    // for (int qi = 0; qi < arr.length; qi++) {
    // sb.append(arr[qi]);
    // arr[qi] = 0;
    // }
    // return sb.toString();
    // }

    // public static int chooseMax(int[] arr, int[] num, int q) {
    // StringBuilder sb = new StringBuilder();
    // int no = 0, fir = 0, cou = 0;
    // for (int qi = q; qi < arr.length; qi++) {
    // for (int qj = qi + 1; qj < arr.length; qj++) {
    // int tt = (int) (Math.pow(10, num[qj] + cou));
    // int jj = arr[qi] / tt;
    // if (jj > fir) {
    // fir = jj;
    // }
    // }
    // cou++;
    // }

    // return no;
    // }
}
