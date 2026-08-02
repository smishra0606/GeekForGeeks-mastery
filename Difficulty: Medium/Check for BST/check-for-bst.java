/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    boolean isBST(Node root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean checkBST(Node root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        
        if (root.data <= minVal || root.data >= maxVal) {
            return false;
        }
        return checkBST(root.left, minVal, root.data) && checkBST(root.right, root.data, maxVal);
    }
}
