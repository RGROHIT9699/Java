import java.util.*;
public class Word_Game {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        long t = qw.nextLong();
        final int num = 3;
        while (t-- > 0) {
            long n = qw.nextLong();
            List<Set<String>> v = new ArrayList<>(num);
            for (int p = 0; p < num; p++) {
                v.add(new HashSet<>());
                for (long q = 0; q < n; q++) {
                    String s = qw.next();
                    v.get(p).add(s);
                }
            }

            long[] score = new long[num];
            for (int p = 0; p < num; p++) {
                for (String x : v.get(p)) {
                    long cnt = 0;
                    for (int q = 0; q < num; q++) {
                        if (q == p) {
                            continue;
                        }
                        cnt += v.get(q).contains(x) ? 1 : 0;
                    }

                    if (cnt == 0) {
                        score[p] += 3;
                    } else if (cnt == 1) {
                        score[p] += 1;
                    }
                }
            }

            for (int p = 0; p < num; p++) {
                System.out.print(score[p] + " ");
            }
            System.out.println();
        }
        qw.close();
    }
}