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

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode temp = new ListNode(0);
    ListNode finish = temp;
    while (list1 != null && list2 != null) {
      if (list1.val > list2.val) {
        finish.next = list2;
        list2 = list2.next;
        finish = finish.next;
      } else {
        finish.next = list1;
        list1 = list1.next;
        finish = finish.next;
      }
    }

    while (list1 != null) {
      finish.next = list1;
      list1 = list1.next;
      finish = finish.next;
    }
    while (list2 != null) {
      finish.next = list2;
      list2 = list2.next;
      finish = finish.next;
    }
    return temp.next;
  }
}
