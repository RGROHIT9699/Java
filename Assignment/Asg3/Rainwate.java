package Asg3;

public class Rainwate {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 0, 2, 0, 4 };
        System.out.println(collect(arr));

    }

    public static int collect(int[] arr) {
        int sum = 0;
        int[] left = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }
}
