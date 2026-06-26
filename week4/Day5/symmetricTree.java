package week4.Day5;

class Solution {
    public boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return (isSame(p.left,q.left) && isSame(p.right,q.right));
    }
    public TreeNode invert(TreeNode root){
        if(root==null) return root;
        TreeNode l=invert(root.left);
        TreeNode r=invert(root.right);
        root.right=l;
        root.left=r;
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        root.left=invert(root.left);
        return isSame(root.left,root.right);
    }
}