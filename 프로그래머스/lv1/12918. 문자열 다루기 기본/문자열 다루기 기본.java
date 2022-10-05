class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            char[] str = s.toCharArray();  
            for(int i=0;i<str.length;i++){
                if(str[i] >= 65){
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}