import java.util.*;

public class FarmerJohnsCardGame {
    static final int MAX_N = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] cards = new int[n][m];
            int[] smallest = new int[n];
            int[] order = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    cards[i][j] = sc.nextInt();
                }
                Arrays.sort(cards[i]);
                smallest[i] = cards[i][0];
                order[i] = i + 1; 
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (smallest[i] > smallest[j]) {
                        // Swap smallest
                        int temp = smallest[i];
                        smallest[i] = smallest[j];
                        smallest[j] = temp;

                        // Swap order
                        temp = order[i];
                        order[i] = order[j];
                        order[j] = temp;
                    }
                }
            }

            int pile = -1;
            boolean valid = true;
            for (int r = 0; r < m && valid; r++) { 
                for (int i = 0; i < n && valid; i++) { 
                    int cow = order[i] - 1;
                    boolean played = false;

                    for (int j = 0; j < m; j++) { 
                        if (cards[cow][j] > pile) {
                            pile = cards[cow][j];
                            cards[cow][j] = -1;
                            played = true;
                            break;
                        }
                    }

                    if (!played) {
                        valid = false;
                    }
                }
            }
            if (valid) {
                for (int i = 0; i < n; i++) {
                    System.out.print(order[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
