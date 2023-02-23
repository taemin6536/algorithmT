import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double userAllCount = stages.length;
        int cnt = 0;
        List<double[]> failRate = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            for (int stage : stages) {
                if (i == stage) {
                    cnt++;
                }
            }
            if (cnt == 0){
                failRate.add(new double[]{i, 0});
                continue;
            }
            failRate.add(new double[]{i, cnt/userAllCount});
            userAllCount -= cnt;
            cnt = 0;
        }
        // {1 , 실패율}, {2, 실패율} ...
        failRate.sort((a,b) -> Double.compare(b[1],a[1]));
        for (int i = 0; i < failRate.size(); i++) {
            answer[i] = (int) failRate.get(i)[0];
        }

        return answer;
    }
}