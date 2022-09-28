import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<String> solution(String[] strings, int n) {
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(""+strings[i].charAt(n)+strings[i]);
        }
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < collect.size(); i++) {
            answer.add(collect.get(i).substring(1, collect.get(i).length()));
        }
        
        return answer;
    }
}