package Asg6;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        try (Scanner qw = new Scanner(System.in)) {
            int qa = qw.nextInt();
            int qb = qw.nextInt();
            int qc = qw.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            ArrayList<Integer> C = new ArrayList<>();
            for (int qi = 0; qi < qa; qi++) {
                A.add(qw.nextInt());
            }
            for (int qi = 0; qi < qb; qi++) {
                B.add(qw.nextInt());
            }
            for (int qi = 0; qi < qc; qi++) {
                C.add(qw.nextInt());
            }
            A.sort(null);
            B.sort(null);
            C.sort(null);
            System.out.println(solution(A, B, C));
        }
    }

    public static int solution(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int qi = 0, qj = 0, qk = 0;
        int ans = Integer.MAX_VALUE;
        int qmax, qmin;
        while (qi < A.size() && qj < B.size() && qk < C.size()) {
            qmax = Math.max(A.get(qi), Math.max(B.get(qj), C.get(qk)));
            qmin = Math.min(A.get(qi), Math.min(B.get(qj), C.get(qk)));
            ans = Math.min(ans, qmax - qmin);
            if (ans == 0) {
                break;
            }
            if (A.get(qi) == qmin)
                qi++;
            else if (B.get(qj) == qmin)
                qj++;
            else
                qk++;
        }
        return ans;
    }
}
