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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int sum=0;
        ListNode current_l1= l1;
        ListNode current_l2= l2;
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(current_l1!=null || current_l2!=null){
            int value1=0;
            int value2=0;

            if(current_l1!=null){
                value1=current_l1.val;
            }
            if(current_l2!=null){
                value2=current_l2.val;
            }
            sum= value1+value2+carry;
            int digit=sum%10;
            carry=sum/10;
            current.next=new ListNode(digit);
            current=current.next;
              if (current_l1 != null) {
                current_l1 = current_l1.next;
            }

            if (current_l2 != null) {
                current_l2 = current_l2.next;
            }
            
        }
        if(carry!=0){
                current.next=new ListNode(carry);
            }
        return dummy.next;
    }
}