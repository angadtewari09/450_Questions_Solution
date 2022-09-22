//Cloning linked list with null and random pointer.
class Solution {
    public Node copyRandomList(Node head) 
    {
        Node currNode = head;
        Node nextNode = head;
        
        while( currNode!=null )
        {
            nextNode = currNode.next;

            Node temp = new Node(currNode.val);
            currNode.next = temp;
            temp.next = nextNode;

            currNode = nextNode;
        }
        currNode = head;
        while( currNode!=null )
        {
            if( currNode.random != null )
                currNode.next.random = currNode.random.next;
            currNode = currNode.next.next;
        }
        currNode = head;
        Node tempHead = new Node(-1);
        Node copy = tempHead;

        while( currNode != null )
        {
            nextNode = currNode.next.next;
            copy.next = currNode.next;
            copy = copy.next;
            currNode.next = nextNode;
            currNode = nextNode;
        }
        return tempHead.next;
    }
}
