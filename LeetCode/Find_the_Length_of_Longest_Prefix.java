import java.util.HashSet;
import java.util.Set;

public class Find_the_Length_of_Longest_Prefix {
    class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> ii = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            while(arr1[i]>0){
                ii.add(arr1[i]);
                arr1[i]/=10;
            }
        }
        int max1=0;
        for(int i:arr2){
            while(i>0){
                if(ii.contains(i)){
                    max1 = Math.max(max1,Integer.toString(i).length());                                        
                }
                i/=10;
            }        
        }
        return max1;
    }        
}
}
