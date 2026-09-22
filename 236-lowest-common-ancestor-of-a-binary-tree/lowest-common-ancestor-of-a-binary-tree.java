/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        // If root is p or q
        if (root == p || root == q) {
            return root;
        }

        // Search left
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // Search right
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Both found on different sides
        if (left != null && right != null) {
            return root;
        }

        // Return whichever side found p or q
        if (left != null) {
            return left;
        }

        return right;
    }
}