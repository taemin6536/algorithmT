import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        
        for(int i=0; i<numbers.length; i++){
            int size = queue.size();
            for(int j=0; j<size; j++){
                int sum = queue.poll();
                queue.add(sum + numbers[i]);
                queue.add(sum - numbers[i]);
            }
        }
        
        while(!queue.isEmpty()){
            if(queue.poll() == target){
                answer++;
            }
        }
        
        return answer;
    }
}