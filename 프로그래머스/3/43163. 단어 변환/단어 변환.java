import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(Arrays.asList(words));
        
        //target이 없으면
        if(!set.contains(target)) return answer;
        
        //queue 넣으주고 set에서 제거
        queue.offer(begin);
        set.remove(begin);
        
        while(!queue.isEmpty()){
            for(int i=0; i<queue.size(); i++){
                String current = queue.poll();
                
                //같으면 리턴
                if(current.equals(target)) return answer;
                
                for(String word : set.toArray(new String[set.size()])){
                    if(canChange(current, word)){
                        queue.offer(word);
                        set.remove(word);
                    }
                }
            }
            answer++;
        }
        return 0;
    }
    
    private boolean canChange(String current, String word){
        int diffCnt = 0;
        for(int i=0; i < current.length(); i++){
            if(current.charAt(i) != word.charAt(i)){
                diffCnt++;
            }
        }
        return diffCnt == 1;
    }
    
}