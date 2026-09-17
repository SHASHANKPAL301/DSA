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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy, curr1 = head;
        while (curr1 != null) {
            count++;
            curr1 = curr1.next;
        }
ListNode curr=head;
        while (count >= k) {
            ListNode prev = null;
            ListNode groupStart = curr;
            for (int i = 0; i < k; i++) {
                ListNode nextnode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextnode;
            }
            groupPrev.next = prev;
            groupStart.next = curr;
            groupPrev = groupStart;
            count -= k;

        }

        return dummy.next;

    }

}