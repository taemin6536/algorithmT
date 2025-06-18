import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = new int[2];
        for(int i=3; i<= sum; i++){
            int s = i;
            int g = sum/i;
            
            if(g < 3) {
                continue;
            }
            
            
            if((s-2)*(g-2)==yellow){
                answer[0] = g;
                answer[1] = s;
                break;
            }
        }
        return answer;
    }
}