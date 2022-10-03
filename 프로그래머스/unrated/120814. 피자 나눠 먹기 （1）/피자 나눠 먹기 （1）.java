class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            int b = n % 7;
            if (b > 0){
                answer= n/7;
                answer++;
                break;
            }else{
                answer = n/7;
                break;
            }
        }
        
        return answer;
    }
}