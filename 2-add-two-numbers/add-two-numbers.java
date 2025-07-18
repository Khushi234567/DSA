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
        ListNode dummy = new ListNode(0);//creating an dummy list
        ListNode curr = dummy ;//initialize an pointer
        int carry = 0;//initialize our carry with 0 intiall

        while(l1 != null || l2 != null || carry == 1){
            int sum  = 0;
            if(l1 != null){
                sum += l1.val;
                l1  = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;//if we get carry then divide it by 10 to get the carry
            ListNode node  = new ListNode(sum%10);//the value we get by module
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;

        
    }
}