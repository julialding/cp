// disclaimer: extremely inefficient and sacrilegious brute force solution, not representative of my coding abilities

import java.util.Collections;
import java.math.BigInteger;
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
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        while (l1 != null) {
            n1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            n2.add(l2.val);
            l2 = l2.next;
        }
        Collections.reverse(n1);
        Collections.reverse(n2);
        BigInteger n1Int = BigInteger.ZERO;; BigInteger n2Int = BigInteger.ZERO;
        for (int n1Digit : n1) {
            n1Int = n1Int.multiply(BigInteger.TEN).add(BigInteger.valueOf(n1Digit));
        }
        for (int n2Digit : n2) {
            n2Int = n2Int.multiply(BigInteger.TEN).add(BigInteger.valueOf(n2Digit));
        }
        BigInteger sum = n1Int.add(n2Int);
        ListNode head = new ListNode(sum.mod(BigInteger.TEN).intValue());
        sum = sum.divide(BigInteger.TEN);
        ListNode pointer = head;
        while (!sum.equals(BigInteger.ZERO)) {
            pointer.next = new ListNode(sum.mod(BigInteger.TEN).intValue());
            sum = sum.divide(BigInteger.TEN);
            pointer = pointer.next;
        }
        return head;
    }
}