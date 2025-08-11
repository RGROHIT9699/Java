package HackwithInfy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class GCDDecomposition {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        HashSet set = new HashSet<>();
        for (int i = 0 ;i<n;i++) {
            int x = qw.nextInt();
            set.add(x);
        }
        if(set.size()<2) {
            System.out.println("no");
        } else {
            List<Integer> ll = new ArrayList<>(set);
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0;i<ll.size();i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0 ;i<ll.size();i++) {
                for(int j = i+1;j<ll.size();j++) {
                    int a = ll.get(i);
                    int b = ll.get(j);
                    if(gcd(a,b) == 1)  {
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }
            if(isBipartite(adj)) {
                System.err.println("yes");
            } else {
                System.out.println("no");
            }
        }
        qw.close();
    }
    public static boolean isBipartite(List<List<Integer>> adj) {
        int [] color = new int [adj.size()];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0;i<adj.size();i++) {
            if(color[i] == 0) {
                q.add(i);
                while(!q.isEmpty()) {
                    int node = q.poll();
                    for (int nb : adj.get(node)) {
                        if(color[nb] == 0) {
                            color[nb] = 3 - color[node];
                            q.add(nb);
                        } else if(color[nb] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    } 
    public static int gcd(int a,int b) {
        while(a%b !=0) {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
}
