import java.util.*;
class Solution {
    public String solution(String s) {
//         char arr[] = s.toCharArray();
//         Arrays.sort(arr,);
        
        
//         StringBuilder sb = new StringBuilder(new String(arr,0,arr.length));
        
//         return sb.reverse().toString();
        String[] str = s.split("");
        String a = "";
        Arrays.sort(str, Comparator.reverseOrder());
        for (String i : str) {
            a += i;
        }
        
        return a;
    }
}