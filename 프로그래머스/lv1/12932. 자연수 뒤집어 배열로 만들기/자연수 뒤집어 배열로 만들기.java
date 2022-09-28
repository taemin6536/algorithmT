class Solution {
    public int[] solution(long n) {
        
        String str = n + "";
        char[] c = str.toCharArray();
        int[] arr = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            arr[i]=c[c.length-i-1]-48;
        }   
        
        return arr;
    }
}