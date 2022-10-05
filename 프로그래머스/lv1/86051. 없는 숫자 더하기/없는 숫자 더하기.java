import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 45;
        answer = sum - Arrays.stream(numbers).sum();
        
        
        return answer;
    }
}