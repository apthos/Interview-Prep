class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(n)
    Space complexity: O(n)
    */
    public ListNode rotateRight(ListNode head, int k) {
        if(k < 1 || head == null || head.next == null) return head;

        ListNode tail = head;
        int length = 2;
        while(tail.next.next != null){
            tail = tail.next; length++;
        } 
        
        //if the amount of rotates is equal to the length, then it'll rotate back in place
        int uniqueMoves = k % length;
        if(uniqueMoves == 0) return head;
        
        //rotate the last node to the front and point the new tail to null
        tail.next.next = head;
        head = tail.next;
        tail.next = null;
        
        return rotateRight(head, uniqueMoves - 1);
    }
}