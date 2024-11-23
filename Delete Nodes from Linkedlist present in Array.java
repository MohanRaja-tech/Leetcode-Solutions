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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;
        Set<Integer> set = new HashSet<>();
        for(int i  : nums){
            set.add(i);
        }
        while(temp != null && temp.next != null){
            if(set.contains(temp.next.val)){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return dummy.next;
        
    }
    
}
