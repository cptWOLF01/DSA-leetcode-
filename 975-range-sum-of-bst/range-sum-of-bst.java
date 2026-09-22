/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {

        List<Integer> inOrderList = new ArrayList<>();

        helper(root, inOrderList);

        int sum = 0;

        for (int i = 0; i < inOrderList.size(); i++) {

            if (inOrderList.get(i) >= low &&
                inOrderList.get(i) <= high) {

                sum = sum + inOrderList.get(i);
            }
        }

        return sum;
    }

    public void helper(TreeNode root, List<Integer> inOrderList) {

        if (root == null) {
            return;
        }

        // Left
        helper(root.left, inOrderList);

        // Root
        inOrderList.add(root.val);

        // Right
        helper(root.right, inOrderList);
    }
}