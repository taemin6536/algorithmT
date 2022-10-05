import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int n=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    n += 1;  
                }
            }
            map.put(i,n);
            n = 0;
        }
        System.out.println(map);
        for (int i = left; i <= right ; i++) {
           answer = (map.get(i)%2==0) ? answer + i : answer - i;
        }
        return answer;
    }
}