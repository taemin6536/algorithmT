import java.util.*;
class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        for (int i = 0; i < n; i++) {
            String a = binary(arr1[i], n);
            String b = binary(arr2[i], n);
            for (int j = 0; j < n; j++) {
                if (a.charAt(j)=='1' || b.charAt(j)=='1'){
                    answer[i] += "#";
                }else {
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }

    public static String binary(int binary, int n) {
        String temp = "";
        while(binary!=0){
            if (binary%2 == 1){
                temp = "1"+temp;
            }else {
                temp = "0"+temp;
            }
            binary/=2;
        }

        while (temp.length() != n){
            temp = "0"+temp;
        }
        return temp;
    }
}