package week4.Day2;
import java.util.*;
class Solution {
    public void helper(TreeNode root,int n,List<Integer>list){
       if(root==null) return;
       if(n==0) list.add(root.val);
       helper(root.left,n-1,list);
       helper(root.right,n-1,list);
    }
    public int height( TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        int level=height(root);
        for(int i=0;i<level;i++){
            List<Integer>list=new ArrayList<>();
             helper(root,i,list);
             ans.add(list);
        }
        return ans;
    }
}