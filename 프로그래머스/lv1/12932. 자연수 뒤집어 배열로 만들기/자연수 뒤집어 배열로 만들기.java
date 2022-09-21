class Solution {
    public int[] solution(long n) {
        
        String a = ""+n;
        
        StringBuilder sb = new StringBuilder(a);
        sb = sb.reverse();
        
        String[] stringArr = sb.toString().split("");
        int[] answer = new int[sb.length()];
        for(int i =0;i<sb.length();i++){
            answer[i] = Integer.parseInt(stringArr[i]);
        }        
        
        return answer;
    }
}