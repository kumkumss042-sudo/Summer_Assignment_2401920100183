package week2.Day_4;

import java.util.*;
class Solution {
    public void helper(int n,int left,int right,String res,List<String>ans){
        if(right==n){
            ans.add(res);
            return;
        }
        if(left<n) helper(n,left+1,right,res+'(',ans);
        if(right<left) helper(n,left,right+1,res+')',ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        helper(n,0,0,"",ans);
        return ans;
    }
}