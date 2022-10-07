import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<nums.length;i++){
            if(i+2 >= nums.length)break;
            for(int j=i+1 ; j<nums.length; j++){
                for(int k=j+1 ; k<nums.length; k++){
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }    
        }
        for(int a : list){
            int count = 2;
            answer++;
            while(count < a){
                if(a%count==0){
                    answer--;
                    break;
                }
                count++;
            }
        }
        return answer;
    }
}