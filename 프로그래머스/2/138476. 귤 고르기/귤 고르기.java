import java.util.*;
import java.util.stream.Collectors; 

class Solution {
    public int solution(int k, int[] tangerine) {
        List<Integer> list = Arrays.stream(tangerine)
                .sorted()
                .boxed()          
                .collect(Collectors.toList());
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            count += entry.getValue();
            if (count >= k) {
                return sortedEntries.indexOf(entry) + 1; 
            }
        }
        return 0; 
    }
}