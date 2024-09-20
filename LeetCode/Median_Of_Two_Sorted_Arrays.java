import java.util.Arrays;

public class Median_Of_Two_Sorted_Arrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int l1 =nums1.length;
            int l2 =nums2.length;
            int arr[] = new int[l1+l2];
            int j=0;
            for(int i= 0;i<l1;i++){
                arr[j]= nums1[i];
                j++;
            }
            for(int i= 0;i<l2;i++){
                arr[j]= nums2[i];
                j++;
            }
            Arrays.sort(arr);
            int len = l1+l2;
            double dd = 0.0;
            if(len%2!=0){
                dd= (double) arr[len/2];
            }
            else{
                dd= ((double)arr[len/2 -1] + (double)arr[len/2])/2.0;
            }
            return dd;       
        }
    }
}
