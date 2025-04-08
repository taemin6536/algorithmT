/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        
        Deque<Integer> stack = new LinkedList<>();
        ListNode node = head;
        while(node != null){
            stack.push(node.val);
            node = node.next;
        }
        
        while(!stack.isEmpty()){
            ListNode newNode = new ListNode(stack.pollLast());
            newNode.next = result.next;
            result.next = newNode;
        }
        return result.next;
    }
}