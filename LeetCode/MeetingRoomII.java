import java.util.*;
public class MeetingRoomII {
    public static void main(String[] args) {
        int[][] arr = {{0, 30}, {5, 10}, {15,20}};
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        // int ans = 0;
        int room=1;
        PriorityQueue<int []>pq= new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(arr[0]);
        for (int i=1;i<arr.length;i++){
            if (pq.peek()[1]>arr[i][0]){
                pq.add(arr[i]);
                room=Math.max(room,pq.size());
            }
            else{
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(room);
    }
}
