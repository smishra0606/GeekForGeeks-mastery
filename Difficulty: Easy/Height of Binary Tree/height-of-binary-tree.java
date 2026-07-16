/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root==null) return -1;
        int x=height(root.left);
        int y=height(root.right);
        return Math.max(x,y)+1;
    }
}