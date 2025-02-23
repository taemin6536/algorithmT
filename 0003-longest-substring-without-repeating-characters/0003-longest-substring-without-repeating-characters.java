class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int init = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(init));
                init++;
            }

            set.add(s.charAt(i));
            
            max = Math.max(max, set.size());
        }

        return max;
    }
}