import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int checkNum = 0;

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) =='(' ){
                checkNum++;
            }else{
                checkNum--;
            }
            if(checkNum < 0) return false;
        }

        if(checkNum != 0){
            answer = false;
        }

        return answer;
    }
}