/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode pre = null, cur = head;
    while (cur != null && cur.next != null) {
      ListNode after = cur.next;
      cur.next = after.next;
      after.next = cur;
      if (pre != null) pre.next = after;
      if (after.next == head) head = after;
      pre = cur;
      cur = cur.next;
    }
    return head;
  }
}
