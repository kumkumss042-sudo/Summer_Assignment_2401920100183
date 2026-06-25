package week4.Day4;

class Solution {
    public int maxSum=Integer.MIN_VALUE;
    public int gain(TreeNode root){
        if(root==null) return 0;
        int leftSum=Math.max(0,gain(root.left));
        int rightSum=Math.max(0,gain(root.right));
        int newpath=root.val+leftSum+rightSum;
        maxSum=Math.max(maxSum,newpath);
        return root.val+Math.max(leftSum,rightSum);
    }
    public int maxPathSum(TreeNode root) {
        gain(root);
        return maxSum;
    }
}