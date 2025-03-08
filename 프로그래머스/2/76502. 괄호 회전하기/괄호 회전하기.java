import java.util.*;

class Solution {
    static String a = "(";
    static String b = "[";
    static String c = "{";

    static String d = ")";
    static String e = "]";
    static String f = "}";

    public int solution(String s) {
        int result = 0;
            s = s.trim();
            Queue<String> queue = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                queue.add(s.substring(i, i + 1));
            }

            for (int i = 0; i < queue.size(); i++) {
                boolean correct = isCorrect(queue);
                if (correct) {
                    result++;
                }

                String poll = queue.poll();
                queue.add(poll);
            }

            return result;
    }
    
    private boolean isCorrect(Queue<String> queue) { // ( ) ( ( ) ( ( ) ( ) ) ( ) )
            Queue<String> tempQueue = new LinkedList<>();
            Stack<String> stack = new Stack<>();
            tempQueue = new LinkedList<>(queue);

            if (queue.size() % 2 != 0) {
                return false;
            }

            //하나씩 temp큐에 삽입
            for (int i = 0; i < queue.size(); i++) {
                String poll = tempQueue.poll();

                if (stack.isEmpty()) {
                    stack.push(poll);
                } else {
                    String peek = stack.peek();
                    if (peek.equals(a) && poll.equals(d)) {
                        stack.pop();
                    } else if (peek.equals(b) && poll.equals(e)) {
                        stack.pop();
                    } else if (peek.equals(c) && poll.equals(f)) {
                        stack.pop();
                    } else {
                        stack.push(poll);
                    }
                }
            }
            return stack.isEmpty();
        }
}