/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        // Your code
        if(node==null) return 0;
        int x=countLeaves(node.left);
        int y=countLeaves(node.right);
        if(node.left== null && node.right==null){
            return 1;
        }
        return x+y;
    }
}