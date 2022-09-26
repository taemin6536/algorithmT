class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        
        String change = phone_number.substring(0,num-4); 
        answer = change.replaceAll("[0-9]","*");
        
        String result = answer+phone_number.substring(num-4,num);
        
        return result;
    }
}