import java.util.*;

class Solution {
    public int solution(int[] ab, boolean[] si) {
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ab.length; i++) {
            if (si[i]) {
                result.add(ab[i]);
            } else {
                result.add(-ab[i]);
            }
        }
        int realResult=0;
        for (Integer integer : result) {
            realResult+=integer;
        }
        return realResult;
    }
}