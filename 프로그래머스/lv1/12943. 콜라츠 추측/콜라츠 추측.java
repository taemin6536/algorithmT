class Solution {
    public int solution(long num) {
       
       int sum = 0;
        while(num!=1){
            if(num%2==0){
                num = num/2;
            }else{
                num = num*3+1;
            }
            sum++;
            if (sum==500){
                sum = -1;
                break;
            }
        }
        return sum;
    }
}