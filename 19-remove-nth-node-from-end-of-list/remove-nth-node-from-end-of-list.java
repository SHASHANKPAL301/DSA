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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        if (head == null || head.next == null) {
            return null;
        }
        ListNode curr = head;
        ListNode temp = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        if(count==n){
            return head.next;
        }
        int i = 1;

        while (i < count - n) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}