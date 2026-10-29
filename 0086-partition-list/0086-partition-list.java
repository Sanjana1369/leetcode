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
        ListNode before = beforeDummy;
        ListNode afterDummy = new ListNode(0);
        ListNode after = afterDummy;

        ListNode current = head;
        while(current != null){
            ListNode nextNode = current.next;

            if(current.val < x){
                before.next = current;
                before = before.next;
            }
            else{
                after.next = current;
                after = after.next;
            }
            current = nextNode;
        }
        after.next = null;
        before.next = afterDummy.next;

        return beforeDummy.next;
    }
}