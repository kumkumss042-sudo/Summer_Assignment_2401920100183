package week4.Day2;
import java.util.*;
class Solution {
    public void helper(TreeNode root,List<Integer>list){
        if(root==null) return;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        helper(root,list);
        return list;
    }
}