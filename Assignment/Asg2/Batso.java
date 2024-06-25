// package Asg2;

public class Batso {
    public static void main(String[] args) {
        int num = 378, sum = 0, num1 = num;
        while (num % 2 == 0) {
            sum += 2;
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                if (i >= 10) {
                    int t = i;
                    while (t > 0) {
                        int rem = t % 10;
                        sum += rem;
                        t /= 10;
                    }
                } else {
                    sum += i;
                }
                num /= i;
            }
        }
        if (num > 2) {
            if (num >= 10) {
                while (num > 0) {
                    int rem = num % 10;
                    sum += rem;
                    num /= 10;
                }
            } else {
                sum += num;
            }
        }

        int sum1 = 0;
        while (num1 > 0) {
            int rem = num1 % 10;
            sum1 += rem;
            num1 /= 10;
        }
        if (sum1 == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
