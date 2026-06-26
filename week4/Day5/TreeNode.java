package week4.Day5;
public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
class Solution {
    public TreeNode helper(int preorder[],int prelo,int prehi,int inorder[],int inlo,int inhi){
        if(prelo>prehi || inlo>inhi) return null;
        TreeNode root=new TreeNode(preorder[prelo]);
        int r=inlo;
        while(preorder[prelo]!=inorder[r]) r++;
        int leftsize=r-inlo;
        root.left=helper(preorder,prelo+1,prelo+leftsize,inorder,inlo,r-1);
        root.right=helper(preorder,prelo+leftsize+1,prehi,inorder,r+1,inhi);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}