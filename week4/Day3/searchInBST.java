package week4.Day3;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        if(root.right!=null && val>root.val) return searchBST(root.right,val);
        else return searchBST(root.left,val);
    }
}