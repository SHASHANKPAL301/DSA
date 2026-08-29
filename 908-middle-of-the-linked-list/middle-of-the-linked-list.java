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
    public ListNode middleNode(ListNode head) {
        ListNode current= head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        current=head;
        int middle= count/2;
        
        for(int i =0;i<middle;i++){
            current=current.next;
        }
        return current;
    }
}