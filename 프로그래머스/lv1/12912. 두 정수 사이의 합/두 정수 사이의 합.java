class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        
        if(a>b){
            for(int i=b;b<=a;b++){
                answer += b;
            }
        }else{
            for(int i=a;a<=b;a++){
                answer += a;
            }
        }
    
        return answer;
    }
}