import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = 0;
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i) - '0';
        }

        for(int i=0;i<arr.length;i++){
            
            answer += arr[i];
        }
        
        
        
        return answer;
    }
}