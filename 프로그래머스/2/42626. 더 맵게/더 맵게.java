import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville) {
            queue.add(i);
        }

        int mixCount = 0;

        // 가장 맵지 않은 음식이 K보다 작고, 섞을 음식이 2개 이상 있는 동안 반복
        while (queue.size() >= 2 && queue.peek() < K) {
            int first = queue.poll();
            int second = queue.poll();

            queue.add(mix(first, second));
            mixCount++;
        }

        // 모든 연산 후, 가장 맵지 않은 음식이 K 이상인지 확인
        if (queue.peek() >= K) {
            return mixCount;
        } else {
            // K 이상으로 만들 수 없는 경우
            return -1;
        }
    }
    
    public int mix(int a, int b) {
        return a + b*2;
    }
}
