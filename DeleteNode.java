//Here is a singly-linked list head and we want to delete a node in it. You are given the node to be deleted node. You will not be given access to the first node of head.
class Solution {
    public void deleteNode(ListNode currNode) 
    {
     while( currNode.next.next !=null ){
        currNode.val = currNode.next.val;
         currNode = currNode.next;
     }
        currNode.val = currNode.next.val;
        currNode.next = null;
    }
}
