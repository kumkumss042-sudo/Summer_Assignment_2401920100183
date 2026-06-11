package week2.Day_4;

import java.util.*;
class Solution {
    public String decodeString(String s) {
       Stack<Integer>stNum=new Stack<>();
       Stack<String>stChar=new Stack<>();

       int num=0;
       for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(Character.isDigit(ch)) num=num*10+(ch-'0');
          else if(ch=='['){
            stNum.push(num);
            stChar.push("[");
            num=0;
          }
          else if(ch==']'){
            String ans="";
              while(!stChar.peek().equals("[")) ans=stChar.pop()+ans;
                int no=stNum.pop();
                StringBuilder sb=new StringBuilder();
                while(no-->0){
                    sb.append(ans);
                }
                stChar.pop();
                stChar.push(sb.toString());
          }
          else stChar.push(ch+"");
       }

       StringBuilder res=new StringBuilder();
       for(String str: stChar){
        res.append(str);
       }
       return res.toString();
    }
}