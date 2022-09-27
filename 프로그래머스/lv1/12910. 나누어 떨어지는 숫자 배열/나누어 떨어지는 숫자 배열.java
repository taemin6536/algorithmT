import java.util.*;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        boolean is_ok=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
                is_ok = true;
            }

        }
        if (is_ok==false) list.add(-1);
        int[] ints1 = list.stream().sorted()
                .mapToInt(Integer::intValue).toArray();
        
        return ints1;
    }
}