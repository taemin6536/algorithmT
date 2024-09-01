import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;  // 3

        nums = Arrays.stream(nums).distinct().toArray(); // 3, 2, 4
        if (count > nums.length) {
            answer = nums.length;
        } else {
            answer = count;
        }
        return answer;
    }
}