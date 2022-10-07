import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long[] arr = new long[count];
        for(int i=0;i<arr.length;i++){
            arr[i] = price * (i+1);
        }
        long sum = Arrays.stream(arr).sum();
        long result = (long)sum - (long)money;
        return (result > 0)? result : 0;
        
        
    }
}