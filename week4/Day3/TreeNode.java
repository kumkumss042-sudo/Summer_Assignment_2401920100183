package week4.Day3;


public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp=(root.val>p.val)?true:false;
        boolean rightq=(root.val<q.val)?true:false;
        if((leftp && rightq) || (!leftp && !rightq)) return root;
        else if(!leftp && rightq) return lowestCommonAncestor(root.right,p,q);
        else if(leftp && !rightq) return lowestCommonAncestor(root.left,p,q);
        return null;
    }
}