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
    public ListNode partition(ListNode head, int x) {
        ListNode beforeDummy = new ListNode(0);
        ListNode afterDummy = new ListNode(0);
        ListNode before = beforeDummy;
        ListNode after = afterDummy;
        ListNode current = head;
        while(current != null){
            if(current.val < x){
                before.next = current;
                before = before.next;
            }
            else{
                after.next = current;
                after = after.next;
            }
            current = current.next;
        }
        after.next = null;
        before.next = afterDummy.next;

        return beforeDummy.next;
    }
}