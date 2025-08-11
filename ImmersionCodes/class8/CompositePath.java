package class8;

import java.util.*;

public class CompositePath {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<=n;i++) {
            adj.add(i,new ArrayList<>());
        }
        for (int i = 1;i<n;i++) {
            int a = qw.nextInt();
            int b = qw.nextInt();
            adj.get(i).add(a);
            adj.get(i).add(b);
        }
        prime(n);
        System.out.println(adj);
        dfs(adj, 1, -1);
        System.out.println(ans);

    }
    public static Pair dfs(List<List<Integer>> adj,int node,int par) {
        List<Pair> ll = new ArrayList<>();
        for (int nbr: adj.get(node)){
            if(nbr != par) {
                ll.add(dfs(adj, nbr, node));
            }
        } 
        if(isp[node] == false ){
            int total = 0;
            for (Pair child:ll) {
                ans += total*child.npr;
                total += child.npr;
            }
            ans += total;
            Pair p = new Pair();
            p.npr = 0;
            p.pr = 1+ total;
            return p;
        } else {
            int totalNonPrime = 0;
            int totalOnePrime = 0;
            for (Pair child:ll) {
                ans += child.npr + totalNonPrime;
                ans += child.pr + totalOnePrime;
                totalNonPrime += child.npr;
                totalOnePrime += child.pr;
            }
            ans += totalNonPrime + totalOnePrime;
            Pair p = new Pair();
            p.npr = totalNonPrime+1;
            p.pr = totalOnePrime;
            return p;

        }


    }

    static boolean isp[];
    static int ans = 0;

    public static void prime(int n) {
        isp = new boolean[n+1];
        isp[0] = true;
        isp[1] = true;
        for (int i = 2;i*i <= n;i++) {
            if(isp[i] != true) {
                for (int j = 2;j*i<=n;j++) {
                    isp[i*j] = true;
                }
            }
        }
    }
}
class Pair {
    long npr = 0L;
    long pr = 0L;

}