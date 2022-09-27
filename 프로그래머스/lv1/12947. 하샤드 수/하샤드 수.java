import java.util.*;
class Solution {
    public boolean solution(int x) {
        
        int temp=0;
        String[] str = String.valueOf(x).split("");
        int[] ints = Arrays.stream(str)
                .mapToInt(Integer::valueOf)
                .toArray();
        temp = Arrays.stream(ints).sum();
        boolean a = x%temp == 0?true:false;
        return a;
        
    }
}