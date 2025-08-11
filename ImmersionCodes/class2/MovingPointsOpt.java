package class2;

import java.util.*;

public class MovingPointsOpt {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        Pair[] arr = new Pair[n];
        for (int i =0;i<n;i++) {
            int c = qw.nextInt();
            arr[i] = new Pair(c,0);
        } 
        for (int i = 0;i<n;i++) {
            int a = qw.nextInt();
            arr[i].v = a;
        }
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (Pair p: arr) {
            if(!map.containsKey(p.v)){
                map.put(p.v,new ArrayList<>());
            }
            map.get(p.v).add(p.x);
        }
        long ans = 0;
        long prefix = 0;
        for (int speed : map.keySet()) {
            List<Integer> ll = map.get(speed);
            Collections.sort(ll);
            for (int i =0;i<ll.size();i++) {
                ans = ans + (ll.get(i)*i - prefix);
                prefix += ll.get(i);
            }
        } 
        Set<Integer> set = map.keySet();
        List<Integer> sortedSpeed = new ArrayList<>(set);
        Collections.sort(sortedSpeed);


        qw.close();
    }
    static class Pair {
        int x;
        int v;
        public Pair(int x,int v) {
            this.x = x;
            this.v = v;
        }
    }
}
