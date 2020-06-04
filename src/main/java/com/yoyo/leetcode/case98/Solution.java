package main.java.com.yoyo.leetcode.case98;

public class Solution {

    public boolean isValidBST(TreeNode root) {

        return isValid(root,null,null);
    }

    public boolean isValid(TreeNode root,Integer min,Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;
        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    }

    public static void main(String[] args) {
        TreeNode rootN = new TreeNode(2);
        rootN.left = new TreeNode(1);
        rootN.right = new TreeNode(3);
        new Solution().isValidBST(rootN);
    }
}
