/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        if(head==null) return new Node(x);
        // code here
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        Node add=new Node(x);
        curr.next=add;
        return head;
    }
}