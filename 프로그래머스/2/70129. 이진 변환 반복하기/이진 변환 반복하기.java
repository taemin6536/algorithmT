import java.util.*;
class Solution {
    
    static int zeroCount = 0;
    static int count=0;
    
    public int[] solution(String s) {
        while(!s.equals("1")){
                int length = s.length();
                s = s.replace("0", "");
                zeroCount += length - s.length();
                s = Integer.toBinaryString(s.length());
                count++;
            }

        return new int[]{count, zeroCount};
    }
}