import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] != min){
                list.add(arr[i]);
            }
        }
        int[] answer;
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
        }
        
        
                              
        return answer;
    }
}