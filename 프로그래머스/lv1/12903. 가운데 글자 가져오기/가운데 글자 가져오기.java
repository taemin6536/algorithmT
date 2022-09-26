class Solution {
    public String solution(String s) {
        String answer = "";
        int num = s.length();
        if(num%2==0){
            answer = s.substring(num/2-1,num/2+1);
        }else{
            answer = s.substring(num/2,num/2+1);
        }
        
        
        return answer;
    }
}