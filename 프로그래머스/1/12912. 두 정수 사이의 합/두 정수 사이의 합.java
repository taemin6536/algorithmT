class Solution {
    public long solution(int a, int b) {
        int min;
        int max;
        long result = 0;
        
        if(a < b){
            min = a;
            max = b;
        } else {
            max = a;
            min = b;
        }
        
        for(int i = min; i<=max; i++) {
            result += i;
        }
        
        return result;
    }
}