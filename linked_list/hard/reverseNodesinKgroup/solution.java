/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || head.next == null || k <= 1) {
      return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode preHead = dummy, tail = dummy, postTail, tmp;
    int count = 0;
    while (tail != null) {
      if (count == k) {
        count = 0;
        postTail = tail.next;
        tail.next = null;
        preHead.next = null;
        tail = head; // reuse "tail"
        while (tail != null) { // reverse head to originsl tsil
          tmp = tail.next;
          tail.next = preHead.next;
          preHead.next = tail;
          tail = tmp;
        }
        head.next = postTail;
        preHead = head;
        tail = preHead;
        head = head.next;
      }
      tail = tail.next;
      count++;
    }
    return dummy.next;
  }
}
