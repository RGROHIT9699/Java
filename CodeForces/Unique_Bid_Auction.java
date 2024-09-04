import java.util.*;
import java.util.Map.Entry;

public class Unique_Bid_Auction {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int tt = qw.nextInt();
        while (tt-- > 0) {
            int n = qw.nextInt();
            List<Integer> ll = new ArrayList<>();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int kk = qw.nextInt();
                ll.add(kk);
                map.put(kk,map.getOrDefault(kk,0)+1);
            }
            int ans = -1;
            for(Entry<Integer, Integer> mm : map.entrySet()){
                if(mm.getValue() == 1) {
                    ans = mm.getKey();
                    break;
                }
            }
            if(ans == -1) {
                System.out.println(-1);
                // System.out.println(map);
            } else {
                int h = ll.indexOf(ans);
                System.out.println(h+1);           
                // System.out.println(map);
            }
        }
        qw.close();
    }
}
