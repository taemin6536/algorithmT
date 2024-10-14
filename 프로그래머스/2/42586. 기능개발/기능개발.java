import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<progresses.length; i++){
            int temp = 100 - progresses[i];
            if(temp % speeds[i] == 0){
                q.add(temp/speeds[i]);
            }else{
                q.add((temp/speeds[i]) +1);
            }
        }
        // 7 3 9
        int x = q.poll(); // 7 
        int count = 1;
        
        while(!q.isEmpty()){
            if(x >= q.peek()){
                count++;
                q.poll();
            }else{
                list.add(count);
                count = 1;
                x = q.poll();
            }
        }
        list.add(count);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}