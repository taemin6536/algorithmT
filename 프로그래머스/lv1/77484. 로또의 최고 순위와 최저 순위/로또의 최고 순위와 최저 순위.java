class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int collect = 0;
        int[] rank = {6,6,5,4,3,2,1};
        int[] answer = new int[2];

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i]==0){
                    zero++;
                    break;
                }
                if (lottos[i] == win_nums[j]){
                    collect++;
                    break;
                }
            }
        }

        answer[0] = rank[zero+collect];
        answer[1] = rank[collect];
        return answer;
    }
}