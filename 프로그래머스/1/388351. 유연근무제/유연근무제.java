class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
                int answer = schedules.length;

        for (int i = 0; i < schedules.length; i++) {
            for (int j = 0; j < 7; j++) {
                if ((startday + j) % 7 > 0 && (startday + j) % 7 <6 && (timelogs[i][j] / 100)*60 + (timelogs[i][j] % 100) > 60*(schedules[i]/100) + (schedules[i]%100) + 10) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}