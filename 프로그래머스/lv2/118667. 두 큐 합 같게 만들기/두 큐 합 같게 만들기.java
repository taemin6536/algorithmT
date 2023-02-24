import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        long total=0;
        long hap =0;
        for (int i = 0; i < queue1.length; i++) {
            hap += queue1[i];
            total += queue1[i];
            total += queue2[i];
            que1.add(queue1[i]);
            que2.add(queue2[i]);
        }
        int maxCount = queue1.length*3;
        total/=2;

        while (hap != total){
            if (maxCount == 0){
                return -1;
            }

            if (hap > total){
                int temp = que1.poll();
                hap -= temp;
                que2.add(temp);
            }else {
                int temp = que2.poll();
                hap += temp;
                que1.add(temp);
            }
            maxCount--;
        }
        return queue1.length*3 - maxCount;
    }
}