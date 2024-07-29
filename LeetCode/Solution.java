import java.util.*;
class Solution{

    static long goodSubarrays(int arr[], int n, int x){
    
    int co=0;
    
    for(int len=x;len<=n; len++){
    
    Map<Integer, Integer> mapHai = new HashMap<>();
    
    for(int i=0;i<len;i++){
    
    mapHai.put(arr[i], mapHai.getOrDefault(arr[i],0)+1);
    
    }
    
    if(isGoodarr(mapHai,x)){
    
    co++;
    
    }
    
    for(int i=len;i<n;i++){
    
    int tremove = arr[i-len];
    
    mapHai.put(tremove, mapHai.get(tremove)-1);
    
    if(mapHai.get(tremove)==0){
    
    mapHai.remove(tremove);
    
    }
    
    int add = arr[i];
    
    mapHai.put(add, mapHai.getOrDefault(add,0)+1); if(isGoodarr (mapHai,x)){
    
    co++;
    
    }
    
    }
    
    }
    
    return co;
    
    } public static boolean isGoodarr (Map<Integer, Integer> lulu, int x){
    
    int c =0;
    
    for(int val: lulu.values()){
    
    if(val>=3){
    
    c++;
    
    }
    
    } return c==x;
    
    }
    
    }