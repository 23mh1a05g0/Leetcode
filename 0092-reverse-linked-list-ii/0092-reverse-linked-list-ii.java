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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int i = left-1;
        int j = right-1;
        while(i<j){
            int element = list.get(i);
            list.set(i,list.get(j));
            list.set(j,element);
            i++;
            j--;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp1 = dummy;
        for(int k=0;k<list.size();k++){
            temp1.next = new ListNode(list.get(k));
            temp1 = temp1.next;
        }
        return dummy.next;

     }
}