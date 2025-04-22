class MyQueue {
Queue<Integer> q = new ArrayDeque<>();

        public MyQueue() {

        }

        public void push(int x) {
            q.add(x);
        }

        public int pop() {
            return q.poll();
        }

        public int peek() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */