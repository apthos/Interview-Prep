public class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(m + n) 
    Space complexity: O(1)
    */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        while(nodeA != nodeB) {
            if(nodeA == null) nodeA = headB;
            else nodeA = nodeA.next;
            
            if(nodeB == null) nodeB = headA;
            else nodeB = nodeB.next;
        }
        
        return nodeA;
    }
}