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
    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        Stack<ListNode> st = new Stack<>();

        ListNode start = head;

        // CHANGE 1
        while (start != null) {
            st.push(start);
            start = start.next;
        }

        int n = st.size();

        ListNode head2 = head;

        // CHANGE 2
        for (int i = 0; i < n / 2; i++) {

            ListNode popped = st.pop();

            // CHANGE 3: remove popped node from old position
            st.peek().next = null;

            ListNode tmp = head2.next;

            head2.next = popped;
            popped.next = tmp;

            head2 = tmp;
        }
    }
}