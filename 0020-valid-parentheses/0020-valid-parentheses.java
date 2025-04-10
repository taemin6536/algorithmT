class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        Map<Character, Character> map = new HashMap<>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                deque.push(s.charAt(i));
            }else if (deque.isEmpty() || deque.pop() != map.get(s.charAt(i))){
                return false;
            }

        }
        return deque.isEmpty();    
    }
}