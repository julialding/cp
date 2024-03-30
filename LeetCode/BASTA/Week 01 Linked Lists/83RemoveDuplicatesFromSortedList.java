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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode previous = head;
        ListNode current = head.next;
        while (current != null) {
            if (previous.val == current.val) {
                while (current != null && previous.val == current.val) {
                    current = current.next;
                }
                previous.next = current;
            }
            else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
}