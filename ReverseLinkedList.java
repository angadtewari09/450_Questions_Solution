class Solution {
        public ListNode reverseList(ListNode head) 
        {
            if( head == null || head.next == null )
                return head;
            ListNode currNode = head;
            ListNode nextNode = head.next;
            ListNode prevNode = null;

            while( currNode != null ) {
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            head = prevNode;

            return head;
    }
}
